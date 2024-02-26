package leTour;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Queue;

public class WriteCutRidersToFile implements Runnable {

	@Override
    public void run() {

        // cut at winner +30 and write list to file
        writeTimeFile(RaceDirector.generateCutList());
    }
    
    // get the cut list - get the winner time + 30 mins - cut time. Check after after the time..
    // dump that to file 

    /**
     * Write to file
     * 
     * @param riders
     */
    private static void writeTimeFile(Queue<Rider> riders) {
    
        try {
            String fileName = "cut.csv";

            File file = new File(fileName);
            FileWriter fileWriter = new FileWriter(file);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("FirstName,LastName,Team\n");

            // iterate through the queue
            while (!riders.isEmpty()) {
                Rider rider = riders.poll();
                bufferedWriter
                        .write(rider.getFirstName() + "," + rider.getLastName() + "," + rider.getNationality() + "\n");
            }
            bufferedWriter.close();
            System.out.println("File Write complete");

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

	
	
	
	
}
