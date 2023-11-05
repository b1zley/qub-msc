/**
 * 
 */
package challenges;

import java.util.Scanner;

/**
 * class which contains logic for an ascii convertor
 * 
 * @author Josh
 */
public class AsciiConvertor {

	/**
	 * This acts as entry point for program prompts the user for input, then
	 * depending on that input, either prints an ascii table or accepts further
	 * input, and converts that input to ascii and prints to screen
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// variable for accepting an option from the user
		int userInputOption;

		// initialise needed classes with non-static methods
		Scanner sc = new Scanner(System.in);

		// variables for selecting option from table
		final int SHOW_ASCII_TABLE = 1;
		final int CONVERT_CHARACTER_TO_ASCII = 2;
		final int CONVERT_STRING_TO_ASCII = 3;
		final int QUIT_PROGRAM = 4;

		// do while loop which controls options
		do {
			// set userinputoption at the start of each loop
			userInputOption = -1;
			// prompt the user with list of options
			userInputOption = doMenu(sc);
			
			switch (userInputOption) {
			case SHOW_ASCII_TABLE:
				// display ascii table
				displayAsciiTable();
				break;
			case CONVERT_CHARACTER_TO_ASCII:
				// enter character to see ascii value
				acceptInputAndConvertChartoAsciiInt(sc);
				break;
			case CONVERT_STRING_TO_ASCII:
				// enter name - convert to ascii
				acceptInputAndPrintStringAsAscii(sc);
				break;
			case QUIT_PROGRAM:
				// quit
				System.out.println("Exitting program...");
				break;
			default:

			}

		} while (userInputOption != QUIT_PROGRAM);

		sc.close();

	}
	
	/**
	 * this method displays a list of options to the user from the ascii convertor menu
	 * then accepts an integer from user input
	 * this method then returns the accepted integer
	 * @param sc - accepts an already instantiated instance of a scanner object 
	 * rather than creating its own
	 * @return - returns an int indicating the user selection
	 */

	public static int doMenu(Scanner sc) {
		int userSelection;
		
		System.out.println("ASCII Convertor Menu..........\n");
		System.out.println("1. Show ASCII Table");
		System.out.println("2. Convert a Character to ASCII");
		System.out.println("3. Convert your name to ASCII");
		System.out.println("4. Quit");
		System.out.println("Enter a number and return");
		
		userSelection = sc.nextInt();
		sc.nextLine();
		
		return userSelection;
	}

	/**
	 * this method prompts the user for input, then displays a conversion of the
	 * input string to ascii while not displaying any spaces in the input string
	 * 
	 * @author Josh
	 * @param sc - accepts an already instantiated scanner object rather than
	 *           creating its own
	 */
	public static void acceptInputAndPrintStringAsAscii(Scanner sc) {
		// variable for holding input name
		String userInputName;
		// prompt user for input
		System.out.println("Enter your name");
		// accept user input
		userInputName = sc.nextLine();

		System.out.println("ASCII");
		// loop through input string, converting to ascii
		for (int i = 0; i < userInputName.length(); i++) {
			// if statement prevents printing if character at index i is a space
			if (userInputName.charAt(i) != ' ')
				System.out.println((int) userInputName.charAt(i) + "\t\t" + userInputName.charAt(i));
		}
		System.out.println();

	}

	/**
	 * this method prompts the user for input, then displays to screen an ascii
	 * conversion of that input
	 * 
	 * @author Josh
	 * @param sc - accepts an already instantiated scanner object rather than
	 *           creating its own
	 */
	public static void acceptInputAndConvertChartoAsciiInt(Scanner sc) {
		// variable for holding input
		String userInput;

		// prompt user for input
		System.out.println("Enter a character to see the ASCII value");

		// assign input to string userInput
		userInput = sc.nextLine();

		// print casting of value to int
		System.out.println(userInput.charAt(0) + "\t\t" + (int) userInput.charAt(0));
		System.out.println();

	}

	/**
	 * displays a table of ASCII characters from 32 to 127 inclusive in the
	 * following format int char ie. 33 !
	 * 
	 * @author Josh
	 */
	public static void displayAsciiTable() {
		System.out.println("ASCII Table ...");
		for (int i = 32; i <= 127; i++) {
			System.out.println(i + "\t\t" + (char) i);
		}
		System.out.println();
	}

}
