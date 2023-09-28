/**
 * 
 */
package selectionStatementsABitMore;

import java.util.Scanner;

/**
 * Write a Java program to show the following menu, prompt for a user response
 * and handle option ... (handling the option : just output to screen the name
 * of the option chosen e.g. When the user enters 1 the output should be output
 * “You selected File”.
 */
public class Q4MenuOptions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userInput, opt1, opt2, opt3, opt4, opt5;
		int inputInt;

		Scanner scanner = new Scanner(System.in);

		opt1 = "File";
		opt2 = "Add";
		opt3 = "Edit";
		opt4 = "Delete";
		opt5 = "Exit";

		System.out.println("1." + opt1);
		System.out.println("2." + opt2);
		System.out.println("3." + opt3);
		System.out.println("4." + opt4);
		System.out.println("5." + opt5);
		System.out.println("Enter option ...");

		userInput = scanner.nextLine();
		inputInt = Integer.valueOf(userInput);

		switch (inputInt) {
		case 1:
			System.out.println("You selected " + opt1);
			break;
		case 2:
			System.out.println("You selected " + opt2);
			break;
		case 3:
			System.out.println("You selected " + opt3);
			break;
		case 4:
			System.out.println("You selected " + opt4);
			break;
		case 5:
			System.out.println("You selected " + opt5);
			break;
		default:
			System.out.println("Input not recognised");
		}

	}

}
