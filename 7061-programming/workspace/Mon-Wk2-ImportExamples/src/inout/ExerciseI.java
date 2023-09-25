/**
 * 
 */
package inout;

import java.util.Scanner;

/**
 * Exercise I - decide's whether user is old enough to vote
 * based on input age
 */
public class ExerciseI {

	/**
	 * use scanner.nextLn()
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userInput;
		int userAge;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please input your age: ");
		userInput = scanner.nextLine();
		
		userAge = Integer.valueOf(userInput);
		
		if(userAge >= 18) {
			System.out.println("You can vote");
		} else {
			System.out.println("You cannot vote");
		}

	}

}
