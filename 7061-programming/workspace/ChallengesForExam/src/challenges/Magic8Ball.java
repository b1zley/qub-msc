/**
 * 
 */
package challenges;

import java.util.Random;
import java.util.Scanner;

/**
 * This class contains logic for the use of a magic 8 ball
 * 
 *
 * @author Joshua O'Hagan
 */
public class Magic8Ball {

	/**
	 * @param args no input params accepted the main method acts as start point for
	 *             the program it will prompt the user for a question to answer,
	 *             then generate a random response based on a hard coded array of
	 *             possible answers
	 */
	public static void main(String[] args) {

		// variable for holding input question from user
		String userInputQuestion, userInputContinue;
		// variable for holding random number generated
		int randomNumber;

		// initialise userInputContinue
		userInputContinue = "N";

		// instantiate objects for classes with non-static methods required
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		// array holding possible answers

		String[] eightBallAnswers = {

				"As I see it, yes.", "Ask again later.", "Better not tell you now.", "Cannot predict now.",
				"Concentrate and ask again.", "Don't count on it.", "It is certain.", "It is decidedly so."

		};

		do {
			// prompt user for question
			System.out.println("What's your question?");
			// variable for storing user response
			userInputQuestion = sc.nextLine();

			// repeat user's question
			System.out.printf("You want to know ... \n%s\n", userInputQuestion);
			// generate a random number from 0 - 7
			randomNumber = rd.nextInt(8);
			// syso eightBallAnswers[randomNumber]
			System.out.println(eightBallAnswers[randomNumber]);

			// ask user if they want to continue
			System.out.println("Do you want to ask another question? Y or N");
			userInputContinue = sc.nextLine();

		} while (!userInputContinue.toUpperCase().equals("N"));

		System.out.println("Thanks for playing...");

		// close scanner
		sc.close();
	}

}
