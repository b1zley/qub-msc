/**
 * 
 */
package operatorsAndSelectionStatementsLab;

import java.util.Scanner;

/**
 * prompt user for age - check if over 17
 * if over 17 - prompt for name
 * - then output users name and age
 * 
 * if 17 or under - too young to continue
 * 
 * if age = 0 or negative - output "sorry don't recognise your input"
 * 
 */
public class Page3AgeChecker {

	/**
	 * 
	 * scanner.nextLine() should resolve
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String userInput, name;
		int age, boundaryAge;
		
		boundaryAge = 17;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please input your age:");
		
		userInput = scanner.nextLine();
		
		age = Integer.valueOf(userInput);
		
		if (age <= 0) {
			System.out.println("Sorry, don't recognise your input");
			return;
		} else if (age <= boundaryAge) {
			System.out.println("too young to continue");
			return;
		} else {
			System.out.println("Please input your name");
			userInput = scanner.nextLine();
			name = userInput;
			System.out.println("Name: " + name);
			System.out.println("Age: " + age);
			
		}
		
		
		
	}

}
