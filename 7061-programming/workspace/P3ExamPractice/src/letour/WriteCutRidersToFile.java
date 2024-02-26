package letour;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteCutRidersToFile implements Runnable {
	
	private ArrayList<Rider> riderListPassed;
	private int cutOffAddition;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		ArrayList<Rider> cutRiders = RaceDirector.generateCutList(riderListPassed, cutOffAddition);
		try {
			writeCutRidersToFile(cutRiders);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	private static void writeCutRidersToFile(ArrayList<Rider> riders) throws IOException {
		String fileName = "cut.csv";
		
		File file = new File(fileName);
		FileWriter fileWriter = new FileWriter(file);
		
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		
		bufferedWriter.write("firstName, lastName, Nationality \n ");
		
		for (Rider rider : riders) {
			
			String firstName = rider.getFirstName();
			String lastName = rider.getLastName();
			String nationality = rider.getNationality();
			
			String toWrite = firstName + "," + lastName + "," + nationality + "\n";
			
			bufferedWriter.write(toWrite);
			
		}
		
		bufferedWriter.close();
		System.out.println("file write complete");
		
		
	}


	public WriteCutRidersToFile(ArrayList<Rider> riderListPassed, int cutOffAddition) {
		this.riderListPassed = riderListPassed;
		this.cutOffAddition = cutOffAddition;
	}
	
	

}
