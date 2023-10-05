/**
 * 
 */
package loopsLabExercises;

import java.util.Scanner;

/**
 * do while
 */
public class Part3Q10 {

	/**
	 * 
	 * use do while check users age provide output based on age input
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userInput;
		int userAge;
		
		userAge = -1;
		
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Please input your age eg 1 - 120");

			userInput = scanner.nextLine();

			try {
				userAge = Integer.valueOf(userInput);
			} catch (Exception e) {
				System.out.println("Please input an integer! eg 1 - 120");
			}
			
			if (userAge >= 1 && userAge <= 30) {
				System.out.println("You are young");
			} else if (userAge >= 31 && userAge <= 60) {
				System.out.println("You are getting on!");
			} else if (userAge >= 61 && userAge <= 120) {
				System.out.println("You look amazing for your age!");
				
			} else {
				System.out.println("Hey now, no one is that age...");
			}
			

		} while (userAge < 1 || userAge > 120);

	}

}
