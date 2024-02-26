package leTour;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class RaceDirector {

	private static List<Rider> stageResults = new ArrayList<Rider>();

	private static final int CUT_OFF = 30;

	private static final int PEN = 5;

	public static void readData() {

		System.out.println("Loading data...");
		File file = new File("stage_results-1.csv");

		FileReader fileReader;
		BufferedReader bufferedReader;
		String riderInfo;
		String[] data;
		int recordsReadAttempts = 0;
		Rider rider;

		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);

			// parse each data point - by comma
			riderInfo = bufferedReader.readLine();
			// ignore the first line (header values)
			riderInfo = bufferedReader.readLine();

			do {

				recordsReadAttempts++;
				data = riderInfo.split(",");

				// parse departure data info into parts
				System.out.println(riderInfo); // showing this for learning purposes only

				// going check for banned team
				if (data[3].equalsIgnoreCase("Microsoft")) {
					// need to ignore this one
					riderInfo = bufferedReader.readLine();
					continue;
				}

				// First Name, Last Name, Nationality, Team,Time
				rider = new Rider();

				rider.setFirstName(data[0]);
				rider.setLastName(data[1]);
				rider.setNationality(data[2]);
				rider.setTeamName(data[3]);

				// need to split the time into hours and min and secs
				String[] time = data[4].split(":");
				LocalTime result = LocalTime.of(Integer.parseInt(time[0]), Integer.parseInt(time[1]),
						Integer.parseInt(time[2]));
				rider.setResult(result);
				stageResults.add(rider);
				riderInfo = bufferedReader.readLine();

			} while (riderInfo != null);

			// close all
			fileReader.close();
			bufferedReader.close();

			System.out.println("\nAttempted to read riders data " + recordsReadAttempts);
			System.out.println("Results data read successfully : " + stageResults.size());

		} catch (FileNotFoundException e) {
			System.out.println("Unable to find the file ");
		} catch (IOException e) {
			System.out.println("Other issues with file read  ");
			// could log these or use own defined exception type
		} catch (Exception e) {
			System.out.println("General issue on data read / processing  ");
		}

	}

	public static void showMenu() {

		int userOption;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("\nMenu _____________________________________________________");
			System.out.println("1. Display race scores (ordered by time) - time relative ");
			System.out.println("2. Update rider time (add 5 mins penalty) - using Matthew Collins as example");
			System.out.println(
					"3. Cut at winner time plus " + CUT_OFF + " mins and write cut list to file - new Thread "); //
			System.out.println("0. Quit");
			System.out.println("Enter option ...");

			userOption = 0;
			boolean inputAccepted = true;
			try {
				userOption = scanner.nextInt();
			}
			catch (Exception e) {
				System.out.println("Hey, thats my green grocer!");
				inputAccepted = false;
			}
			
			

			switch (userOption) {
			case 1:
				// sort by time
				Collections.sort(stageResults, new CompareTime());
				displayAll();
				break;
			case 2:
				// Create a LocalTime object with 5 mins
				// note hard coded record example used here
				updateRiderWithPenalty("Collins", PEN);
				break;
			case 3:
				// write cut off list to file
				Thread thread = new Thread(new WriteCutRidersToFile());
				thread.start();
				break;
			case 0:
				System.out.println("Thanks bye");
				break;
			default:
				System.out.println("Try again!");
			}
		} while (userOption != 0);
		scanner.close();
	}

	/**
	 * Displays all riders to screen
	 */
	public static void displayAll() {
		System.out.println("____________________________");
		for (Rider rider : stageResults) {

			System.out.println(rider.toString());
		}
	}

	/**
	 * update given rider record time - note - assuming here unique lastname
	 * 
	 * @param lastName
	 * @param minutePen
	 */
	public static void updateRiderWithPenalty(String lastName, int minutePen) {

		// get the rider by name (assuming unique lastNAme
		for (Rider rider : stageResults) {

			if (rider.getLastName().equalsIgnoreCase(lastName)) {

				// got the record
				rider.setResult(rider.getResult().plusMinutes(minutePen));
				System.out.println("Penaly applied to rider " + rider.getLastName());
				break;
			}
		}
	}
	
	
	
	/**
     * Creates cut list based on the best time + CUT OFF
     * @return
     */
    public static Queue<Rider> generateCutList() {

        Queue<Rider> toBeCut = new LinkedList<Rider>();
        
        // get the cut point
        // assuming ordered list ! taking the first time .. otherwise would need to analyse list for fastest time
        LocalTime time = stageResults.get(0).getResult().plusMinutes(CUT_OFF);
        
        System.err.println("CUT OFF TIME : "+time);
        
        for (Rider rider : stageResults) {
            if (rider.getResult().isAfter(time)) {
                // too bad you are out
                toBeCut.add(rider);
            }
        }
        return toBeCut;
    }

	// main method
	public static void main(String[] args) {

		readData();

		showMenu();

	}

}
