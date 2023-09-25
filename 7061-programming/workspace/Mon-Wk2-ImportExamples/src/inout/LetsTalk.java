/**
 * 
 */
package inout;

//imports go here
import java.util.Scanner;

/**
 * Beginning interactivity through importing java.util.Scanner
 */
public class LetsTalk {

	/**
	 * Ask user for their name
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		String usersName;

		// set up the scanner for use - create new scanner object
		Scanner scanner = new Scanner(System.in);

		System.out.println("Hi, what's your name?");

		usersName = scanner.nextLine();

		System.out.println("Wow great name " + usersName);
		scanner.close();
	}

}
