/**
 * 
 */
package loopsLabExercises;

import java.util.Scanner;

/**
 * examining uses of do while loops
 */
public class Part2DoWhileFileSelector {

	/**
	 * create a menu selector
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String userInput;
		do {
			System.out.println("1. File\n2. Edit\n3. Save\n4. Delete\n5. Exit\nSelect option...");
			
			userInput = scanner.nextLine();
			
			switch(userInput) {
			case "1":
				System.out.println("File selected...");
				continue;
			case "2":
				System.out.println("Editing file...");
				continue;
			case "3":
				System.out.println("Saving file...");
				continue;
			case "4":
				System.out.println("Deleting file...");
				continue;
			case "5":
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid selection!");
				continue;
				
			}
			break;
			
		} while (true);

	}

}
