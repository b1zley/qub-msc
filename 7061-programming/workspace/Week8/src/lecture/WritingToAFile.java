/**
 * 
 */
package lecture;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 */
public class WritingToAFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		try {
			File file = new File("Info.txt");
			FileWriter fileWriter = new FileWriter(file, true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			
			bufferedWriter.write("jOsH wUz H3r3");
			
			
			//close resources
			bufferedWriter.close();
			fileWriter.close();
			
			
			System.out.println("Write to file complete");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
