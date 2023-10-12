/**
 * 
 */
package labexercises;

import java.util.Random;

import java.util.Scanner;

import java.util.Calendar;

/**
 * create a method that - when passed a given integer will determine whether the
 * integer is odd or even
 */
public class Part1MethodInvocation {

	/**
	 * @param args main method - calls all methods formed in part 1 the requisite
	 *             number of times
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oddOrEven(2);
		convertFromUpperToLower('X');
		isMultiple(10, 21);

		generate10RandomNumbers();

		userInputCountdownToZero();

		printNumberInWord(55);

		printSumUpToNumber(100);

		amOrPmPrinter();
	}

	public static void oddOrEven(int numberToCheck) {
		if (numberToCheck % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}

	public static void convertFromUpperToLower(char letter) {
		System.out.println(Character.toLowerCase(letter));
	}

	public static void isMultiple(int num1, int num2) {

		if (num2 % num1 == 0) {
			System.out.println(num2 + " is a multiple of " + num1);
		} else {
			System.out.println(num2 + " is not a multiple of " + num1);
		}
	}

	public static void generate10RandomNumbers() {
		Random rand = new Random();
		int randomOutput;
		for (int i = 1; i <= 10; i++) {
			randomOutput = rand.nextInt(10) + 1;
			System.out.println(randomOutput);
		}
	}

	public static void userInputCountdownToZero() {
		int numberToCountdownFrom;
		System.out.println("Please provide a number to countdown from");
		Scanner scanner = new Scanner(System.in);
		numberToCountdownFrom = scanner.nextInt();

		if (numberToCountdownFrom > 50 || numberToCountdownFrom < 1) {
			System.out.println("Error, out of range");
			return;
		}

		for (int i = numberToCountdownFrom; i >= 0; i--) {
			StringBuilder sb = new StringBuilder();
			sb.append(i);
			sb.append(" ");

			for (int numberOfStars = i; numberOfStars > 0; numberOfStars--) {
				sb.append("*");
			}
			System.out.println(sb.toString());
		}

		scanner.close();
	}

	public static void printNumberInWord(int numberToPrint) {
		String wordToPrint;

		switch (numberToPrint) {
		case 0:
			wordToPrint = "ZERO";
			break;
		case 1:
			wordToPrint = "ONE";
			break;
		case 2:
			wordToPrint = "TWO";
			break;
		case 3:
			wordToPrint = "THREE";
			break;
		case 4:
			wordToPrint = "FOUR";
			break;
		case 5:
			wordToPrint = "FIVE";
			break;
		case 6:
			wordToPrint = "SIX";
			break;
		case 7:
			wordToPrint = "SEVEN";
			break;
		case 8:
			wordToPrint = "EIGHT";
			break;
		case 9:
			wordToPrint = "NINE";
			break;

		default:
			wordToPrint = "OTHER";
		}

		System.out.println(wordToPrint);
	}

	public static void printSumUpToNumber(int upperBound) {
		int sum;
		double average;
		sum = 0;
		average = 0;

		for (int i = 1; i <= upperBound; i++) {
			sum += i;
		}

		average = (double) sum / upperBound;

		System.out.println("The sum is: " + sum);
		System.out.println("The average is: " + average);

	}

	public static void amOrPmPrinter() {
		Calendar cal = Calendar.getInstance();
		if (cal.get(Calendar.AM_PM) == 0) {
			System.out.println("Good morning");
		} else {
			System.out.println("I hope the morning went well for you. Enjoy the rest of your day");
		}
	}
	
}
