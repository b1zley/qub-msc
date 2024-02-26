/**
 * 
 */
package lecture;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 */
public class ReadingFromFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		String line;

		File file = new File("Info.txt");

		if (!file.exists()) {
			System.out.println("Can't find that file!");
		} else {

			try {
				FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				
				
				line = bufferedReader.readLine();
				while(line != null) {
					System.out.println(line);
					line = bufferedReader.readLine();
				}
				
				//close resources
				bufferedReader.close();
				fileReader.close();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
