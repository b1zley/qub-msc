/**
 * 
 */
package challengereadingandsplitting;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 */
public class Reading {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String line;
		File file = new File("Scores.csv");

		if (!file.exists()) {
			System.out.println("File does not exist");
		} else {
			try {
				// using the reader class - including buffer for efficient reads
				FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);

				// read the first line
				line = bufferedReader.readLine();
				int lineCount = 0;

				while (line != null) {

					if (lineCount > 0) {

						int awayScore;
						int homeScore;

						String awayTeam;
						String homeTeam;
						
						String DRAW = "neither";
						
						String winner;

						// manipulate each line here
						String[] splitLine = line.split(",");

						homeScore = Integer.valueOf(splitLine[1]);
						awayScore = Integer.valueOf(splitLine[3]);

						homeTeam = splitLine[0];
						awayTeam = splitLine[2];
						
						winner = DRAW;
						if (homeScore > awayScore) {
							winner = homeTeam;
						} else if  (awayScore > homeScore){
							winner = awayTeam;
						}
						if(winner != DRAW) {
							System.out.println(
									homeTeam + " " + homeScore + " : " + awayTeam + " " + awayScore + "\tWinner " + winner);

						} else {
							System.out.println(
									homeTeam + " " + homeScore + " : " + awayTeam + " " + awayScore + "\tDraw");

						}
						
					}

					line = bufferedReader.readLine();
					lineCount++;
				}
				bufferedReader.close();

			} catch (IOException e) {
				System.out.println("Problem");
				e.printStackTrace();
			}

		}

	}

}
