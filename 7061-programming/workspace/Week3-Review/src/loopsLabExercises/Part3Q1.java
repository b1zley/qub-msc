/**
 * 
 */
package loopsLabExercises;

import java.util.Scanner;

/**
 * using for loops
 */
public class Part3Q1 {

	/**
	 * prompt user for name - print to screen 10 times
	 * user should be able to input
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		String userInput;
		
		
		System.out.println("Please input a name");
		
		userInput = scanner.nextLine();
		
		
		for (int i = 1 ; i < 11; i++) {
			System.out.println(userInput);
		}

	}

}
