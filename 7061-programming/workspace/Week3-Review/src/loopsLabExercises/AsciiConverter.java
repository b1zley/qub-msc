/**
 * 
 */
package loopsLabExercises;

import java.util.Scanner;

/**
 * convert to ascii from characters user interface using scanner
 * 
 */
public class AsciiConverter {

	public static void printAsciiTable() {

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userOption;

		char userCharacter;
		
		String userName;
		
		userName = "-";

		userCharacter = '-';

//		returnFromChar = -1;

		userOption = -1; // default value

		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("\nASCII Convertor Menu................");
			System.out.println("1. Show ASCII Table");
			System.out.println("2. Convert a Character to ASCII");
			System.out.println("3. Convert your name to ASCII");
			System.out.println("4. Quit");

			System.out.println("Enter a number and return");

			// get a user's option
			userOption = scanner.nextInt();
			scanner.nextLine(); // this clears out the return character (nextInt takes just the int entered)

			switch (userOption) {

			case 1:
				// print ascii table
				System.out.println("Ascii table");
				for (int i = 32; i <= 126; i++) {

					System.out.println(i + "\t" + (char) i);
				}
				break;
			case 2:
				// convert character to ascii
				System.out.println("Input a character to convert to ascii");

				userCharacter = scanner.nextLine().charAt(0);

				System.out.println((int) userCharacter);

				break;
			case 3:
				// convert name to ascii
				
				System.out.println("Please input your name");
				
				userName = scanner.nextLine();
				
				System.out.println("ASCII");
				for (int i = 0 ; i < userName.length() ; i++) {
					System.out.println((int) userName.charAt(i) + "\t" + userName.charAt(i));
					
					
				}
				
				
				
				break;
			case 4:
				System.out.println("Exitting program...");
				break;
			default:
				System.out.println("Invalid selection.");

			}

		} while (userOption != 4);

		System.out.println("Exitted.");

		scanner.close();
	}

}
