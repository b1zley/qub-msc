/**
 * 
 */
package lecture;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

/**
 * 
 */
public class FileManagement {

	/**
	 * @param args
	 * 
	 */

	// path for java file
	// C:\Users\yah-boi\Desktop\qub-msc\repo\7061-programming\workspace\Week8\src\lecture\FileManagement.java

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File dir = new File("Aidan file");

		if (!dir.exists()) {
			System.out.println("About to create a directory");
			dir.mkdir();
		} else {
			System.out.println("Dir already exists");
		}

		// create file .txt put inside the dir

		File file = new File(dir + "/QUB.txt");
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Problem creating file");
			e.printStackTrace();
		}
		
		System.out.println("Done");
		
		System.out.println("Absoute path for the dir " + dir.getAbsolutePath());
		
		System.out.println("Absolute path file : " + file.getAbsolutePath());
		
//		System.out.println("File date modified : " + file.lastModified());
		
		
		Date dateMod = new Date(file.lastModified());
		
		
		System.out.println("date last mod : " + dateMod);
		
		//get info on the file(s)
		
		
		String [] files = dir.list();
		
		System.out.println(Arrays.toString(files));
		
		
		File newFileName = new File (dir + "/QUBNew.txt");
		file.renameTo(newFileName);
		
		//delete
		newFileName.delete();
		file.delete();
		
		//show files present in directory dir
		files = dir.list();
		System.out.println(Arrays.toString(files));
		
		
		
	}

}
