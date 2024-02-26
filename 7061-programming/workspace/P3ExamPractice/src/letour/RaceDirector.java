package letour;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RaceDirector {

	private static final int PENALTY_TO_APPLY = 5;
	private static final int CUTOFF_ADDITION_MINUTES = 30;

	
	public static void main(String[] args) {
		
		
		// lets parse the file, put all data from each row into a rider object, then store each rider in an arraylist
		
		

		ArrayList<Rider> resultSet = new ArrayList<Rider>();
		
		
		readData("stage-results.csv", resultSet);
		
		// remove microsoft - those doping cheaters
		// just kidding - this could theoretically be implemented to prevent teams with microsoft being added to the arraylist initially
		// this would have performance benefits - but is less extensible
		
		// if instead, i create a method which can accept a team name as a parameter, which then removes those teams from the result set
		// then a) we achieve clearer separation of concerns - readData reads the data and filterData methods are responsible for filtering
		// and b) the created function will be more widely applicable
		
		// going to implement like this : find the indexes to remove, remove them 
		
		removeFromRiderArrayListByTeam(resultSet, "Microsoft");
		

		// sort result list - always call before showing menu, as resultset only interacted with in sorted state
		sortRiderListByResultTimeAscending(resultSet);

		
		
		startMenu(resultSet);
		

	}

	private static void startMenu(ArrayList<Rider> targetResultSet) {
		
		Scanner sc = new Scanner(System.in);
		
		String userInput;
		int userInputInt;
		
		do {
			System.out.println("Please select an option:");
			System.out.println("1. Show results - ordered by time (fast stage time first etc)");
			System.out.println("2. Update rider time (add 5 mins penalty)");
			System.out.println("3. Output to file (using separate thread) all riders that are +30 mins inclusive after the winners time");
			System.out.println("0. Quit");

			userInput = sc.nextLine();
			
			// this is a little hacky but is a way of managing unexpected inputs 
			// unexpected inputs will set userInputInt to a disused value - skipping all options, and restarting the loop
			try {
				userInputInt = Integer.valueOf(userInput);
			} catch(Exception e){
				userInputInt = -1000;
			}
			
			
			switch(userInputInt) {
			case 1:
				displayAllRiders(targetResultSet);
				break;
			case 2:
				// hard code for now
				addPenaltyToRider(targetResultSet, "Matthew", "Collins", PENALTY_TO_APPLY );
				break;
			case 3:
				Thread thread = new Thread(new WriteCutRidersToFile(targetResultSet, CUTOFF_ADDITION_MINUTES));
				thread.start();
				break;
				
			default:
				
				break;
			}
			
			
		} 
		while(userInputInt != 0);
		System.out.println("Quit selected - exitting");
		sc.close();
	}

	private static void readData(String fileName, ArrayList<Rider> targetForResults) {
		
		String line;
		
		File file = new File(fileName);
		
		if (!file.exists()) {
			System.out.println("file not found!");
			return;
		}
		
		try {
			
			// file reading boiler plate
			
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			// move target line down one
			bufferedReader.readLine();
			
			line = bufferedReader.readLine();
			
			
			
			while (line != null) {
				// do stuff with the line
				
				
				String [] splitLine = line.split(",");
				
				String firstName = splitLine[0];
				String lastName = splitLine[1];
				String nationality = splitLine[2];
				String team = splitLine[3];
				
				// need to deal with local time parsing, complex!
				// need to split the time into hours and min and secs
				String[] time = splitLine[4].split(":"); // eg 4:09:03
				LocalTime result = LocalTime.of(Integer.parseInt(time[0]), Integer.parseInt(time[1]), Integer.parseInt(time[2]));
				
				Rider riderToAdd = new Rider(firstName, lastName, nationality, team, result);
				
				
				targetForResults.add(riderToAdd);
				
				
				
				
				
				// move the line along!
				line = bufferedReader.readLine();
				
			}
			
			// finished file read
			
			bufferedReader.close();
			fileReader.close();
			
			
			
		} catch (Exception e) {
			
		}
		
		
		
		
	}
	
	
	private static void displayAllRiders(ArrayList<Rider> riderArrayListToDisplay) {
		
		for (Rider rider : riderArrayListToDisplay) {
			
			System.out.println(rider.toString());
		}
		
		
	}
	
	
	// currently there is no event where an unsorted list of riders is necessary - for display or otherwise, compartmentalize as method
	
	private static void sortRiderListByResultTimeAscending(ArrayList<Rider> riderArrayListToSort) {
		// need to get to work on the comparator
		Collections.sort(riderArrayListToSort, new RiderComparator());
	}
	
	
	private static void removeFromRiderArrayListByTeam(ArrayList<Rider> riderArrayListToFilter, String teamFilterKey ){
		
		ArrayList<Integer> indicesToRemove = new ArrayList<Integer>();
		
		// cant use advanced for loop as need access to index
		for (int i = 0 ; i < riderArrayListToFilter.size() ; i++) {
			
			if(riderArrayListToFilter.get(i).getTeam().equalsIgnoreCase(teamFilterKey)) {
				indicesToRemove.add(i);
				
			}
			
		}
		
		// actually i think we grab these indices in order so no need to sort, but still, no harm being sure
		Collections.sort(indicesToRemove);
		
		
		// remove sequentially in reverse order
		for (int i = indicesToRemove.size()-1 ; i >= 0 ; i--) {
//			System.out.println(indicesToRemove.get(i));
			riderArrayListToFilter.remove((int) indicesToRemove.get(i));
		}
		
		
		
	}
	
	public static void addPenaltyToRider(ArrayList<Rider> resultListToModify, String riderFirstName, String riderLastName, int penaltyToAddInMinutes){
		
		for (Rider rider : resultListToModify) {
			String firstNameFromList = rider.getFirstName();
			String lastNameFromList = rider.getLastName();
			LocalTime resultTimeFromList = rider.getResult();
			
			LocalTime toSet = resultTimeFromList.plusMinutes(penaltyToAddInMinutes);
			
			if(firstNameFromList.equalsIgnoreCase(riderFirstName) && lastNameFromList.equalsIgnoreCase(riderLastName)) {
				
				rider.setResult(toSet);
			}
			
		}
		
		
		// funnilly enough - after this occours, we should really resort the arraylist, so lets do that
		
		sortRiderListByResultTimeAscending(resultListToModify);
		
	}
	
	
	public static ArrayList<Rider> generateCutList(ArrayList<Rider> resultSetToFindCut, int cutOffAdditionInMinutes){
		ArrayList<Rider> cutRiders = new ArrayList<Rider>();
		
		LocalTime cutOffTime = resultSetToFindCut.get(0).getResult().plusMinutes(cutOffAdditionInMinutes);
		
		for (Rider rider : resultSetToFindCut) {
			
			if (rider.getResult().isAfter(cutOffTime)) {
				cutRiders.add(rider);
			}
		}
		
		
		return cutRiders;
	}

}
