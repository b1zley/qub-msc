/**
 * 
 */
package challengeuefacup;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import challengegraduationprocessor.Graduate;

/**
 * 
 */
public class UefaCupRead {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String targetFileName = "ECWinners.txt";
		ArrayList<String> eCWinnerList = new ArrayList<String>();
		
		readInECWinners(targetFileName, eCWinnerList);
		
		showWinnersWithYear(1956, eCWinnerList);
		
		showWinnersNoDuplicates(eCWinnerList);
		
		
		
		

	}
	
	
	public static void readInECWinners(String fileName, ArrayList<String> winnerList) {
		String line;
		File file = new File(fileName);

		if (!file.exists()) {
			System.out.println("file not found");
		} else {
			try {
				FileReader fR = new FileReader(file);
				BufferedReader bR = new BufferedReader(fR);

				// read first line
				line = bR.readLine();

				while (line != null) {
					
					
					winnerList.add(line);
					
					line = bR.readLine();
					
				}
				bR.close();

			} catch (IOException e) {

			}
		}
		
		
	}
	
	public static void showWinnersWithYear(int startYear, ArrayList<String> winnerList) {
		
		
		for (int i = 0; i < winnerList.size(); i++) {
			
			System.out.println((startYear + i) + " : " + winnerList.get(i));
		}
	}
	
	
	public static void showWinnersNoDuplicates(ArrayList<String> winnerList) {
		ArrayList<String> duplicateRemovedWinnerList = new ArrayList<String>();
		boolean alreadyAdded = false;
		// remove duplicates
		for (int i = 0 ; i < winnerList.size() ; i++) {
			String teamToAdd = winnerList.get(i);
			
			for (String winnerAlreadyAdded : duplicateRemovedWinnerList) {
				if (winnerAlreadyAdded.equals(teamToAdd)) {
					alreadyAdded = true;
					break;
				}
				
			}
			
			if (!alreadyAdded) {
				duplicateRemovedWinnerList.add(teamToAdd);
			}
			
			alreadyAdded = false;
		}
		
		
		
		for ( String winner : duplicateRemovedWinnerList) {
			System.out.println(winner);
		}
		
	}

}
