/** must import random and scanner
 * 
 */
package compoundsAndLoops;

import java.util.Random;
import java.util.Scanner;

import java.util.concurrent.TimeUnit;

/**
 * 
 */
public class RandomNumberGuesser {

	/**
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
			TimeUnit.SECONDS.sleep(2);
		} catch (Exception e) {
			System.out.println("uh oh");
		}

		while (true) {

			System.out.println("o0o0o0o0o please guess a number between 1 and 10 - eg 6");
			userInput = scanner.nextLine();
			userGuess = Integer.valueOf(userInput);
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
			} else {
				System.out.println("HA, you didn't get me this time!");
				continue;
			}

		}
		
		scanner.close();

	}

}
