/** must import random and scanner
 * 
 */
package compoundsAndLoops;

import java.util.Random;
import java.util.Scanner;

import java.util.concurrent.TimeUnit;

/**
 * Random number guessser - user inputs a number and this is compared against a 
 * randomly generated number
 * 
 * iterates until user inputs number = random number
 */
public class RandomNumberGuesser {

	/**
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userInput;
		int userGuess, generatedNumber;

		Scanner scanner = new Scanner(System.in);

		Random random = new Random();

		generatedNumber = (random.nextInt(10) + 1);

		System.out.println("Generating number...");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (Exception e) {
			System.out.println("uh oh");
		}

		while (true) {

			System.out.println("o0o0o0o0o please guess a number between 1 and 10 - eg 6");
			userInput = scanner.nextLine();
			try {
				userGuess = Integer.valueOf(userInput);
			} catch (Exception e) {
				System.out.println("Please input a number!");
				continue;
			}

			System.out.println("Your number is: " + userGuess);

			System.out.println("Comparing numbers...");
			try {
				TimeUnit.MILLISECONDS.sleep(300);
			} catch (Exception e) {
				System.out.println("uh oh");
			}

			if (userGuess == generatedNumber) {
				System.out.println("My number is: " + generatedNumber);
				System.out.println("oh my god you GOT ME");
				break;
			} else if (userGuess > 10 || userGuess < 1) {
				System.out.println("Numbers 1 - 10 please!");
				continue;
			} else {
				System.out.println("HA, you didn't get me this time!");
				continue;
			}

		}

		scanner.close();

	}

}
