/**
 * 
 */
package challengegraduationprocessor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 
 */
public class GradProcessor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Graduate g1 = new Graduate("StudentNumber", "first", "last", 25, 50, 25, 50, 25);

		ArrayList<Graduate> graduates = new ArrayList<Graduate>();

		readInGrads(graduates, "ModuleScoresMSc.csv");

		for (Graduate graduate : graduates) {
			graduate.displayAll();
		}

		copyGradsToCSV(graduates, "ListForGraduation.txt");

	}

	static void copyGradsToCSV(ArrayList<Graduate> graduates, String targetFileName) {
		// TODO Auto-generated method stub
		File file = new File(targetFileName);
		try {
		FileWriter fileWriter = new FileWriter(file, true);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		// use bufferedWriter.write(// your text here// );
		// to write to the file
		for (int i = 0 ; i < graduates.size(); i ++) {
			
			Graduate targetGrad = graduates.get(i);
			
			
			String studentNumber = targetGrad.getStudentNumber();
			String firstName = targetGrad.getFirstName();
			String lastName = targetGrad.getLastName();
			String classification = targetGrad.getClassification();
			
			
			if(classification != "Fail" && classification != "Error" && classification != "Not Available") {
				String textToWrite = studentNumber + "," + firstName + "," + lastName + "," + classification + "\n";
				bufferedWriter.write(textToWrite);
				System.out.println(textToWrite);
			}
			
			
			
			
			
			
		}
		
		bufferedWriter.close();
		fileWriter.close();
		
		} catch (Exception e) {
			System.out.println("File cannot be written");
		}
	}

	static void readInGrads(ArrayList<Graduate> graduates, String fileName) {
		// TODO Auto-generated method stub
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
				int lineCount = 0;

				while (line != null) {
					if (lineCount > 0) {

						String[] splitLine = line.split(",");

						String studentNumber = splitLine[0];
						String firstName = splitLine[1];
						String lastName = splitLine[2];

						int resultProgram = Integer.valueOf(splitLine[3]);
						int resultCompFound = Integer.valueOf(splitLine[4]);
						int resultDBs = Integer.valueOf(splitLine[5]);
						int resultWeb = Integer.valueOf(splitLine[6]);
						int resultSoftwareE = Integer.valueOf(splitLine[7]);

						graduates.add(new Graduate(studentNumber, firstName, lastName, resultProgram, resultCompFound,
								resultDBs, resultWeb, resultSoftwareE));

					}

					line = bR.readLine();
					lineCount++;
				}
				bR.close();

			} catch (IOException e) {

			}
		}

	}

}
