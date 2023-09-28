/**
 * 
 */
package challenge;
import java.util.Scanner;
import java.util.Random;
/**
 * You have been asked to write a Java program to prompt the user to think and
 * then enter a question... e.g. will it be sunny tomorrow?
 */
public class Magic8Ball {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String userInput;
		int randomChoice;
		
		String outputArray[] = {"As I see it, yes.", "Ask again later.",
				"Better not tell you now.", "Cannot predict now.", 
				"Concentrate and ask again.", "Don't count on it.",
				"It is certain.", "It is decidedly so."};
		
		
		System.out.println("Ask your question...");
		userInput = scanner.nextLine();
		
		Random random = new Random();
		randomChoice = random.nextInt(8);
		System.out.println("You want to know..");
		System.out.println(userInput);
		System.out.println(outputArray[randomChoice]);
		
		scanner.close();
		
	}

}
