/**
 * 
 */
package challengesongsareus;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 
 */
public class SongStats {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String line;
		File file = new File("songlist.csv");
		
		
		ArrayList<Song> songs = new ArrayList<Song>();

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

						

						// manipulate each line here
						String[] splitLine = line.split(",");
						
						String titleToInput = splitLine[0];
						String artistToInput = splitLine[1];
						int highestPosition = Integer.valueOf(splitLine[2]);
						
						
						songs.add(new Song(titleToInput, artistToInput, highestPosition));
						
						
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
		
		
		for (Song tarSong : songs) {
			tarSong.allDetails();
			System.out.println();
		}

	}

}
