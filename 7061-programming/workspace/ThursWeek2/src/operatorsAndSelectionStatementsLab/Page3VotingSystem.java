/**
 * 
 */
package operatorsAndSelectionStatementsLab;

import java.util.Scanner;
/**
 * 
 */
public class Page3VotingSystem {

	/**
	 * using if else and scanner for interactivity
	 * might also have to use String.toUpperCase() method for CoN and LAb etc
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String labComparison, conComparison, userInput;
		
		labComparison = "LAB";
		conComparison = "CON";
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Voting...");
		System.out.println("Enter 'con' for Conservative and 'lab' for Labour");
		
		userInput = scanner.nextLine();
		
		if (userInput.toUpperCase().equals(labComparison)) {
			System.out.println("Voted registered for Labour");
		} else if (userInput.toUpperCase().equals(conComparison)) {
			System.out.println("Voted registered for Conservative");
		} else {
			System.out.println("Sorry voting party not recognised");
		}
		
		
		
		
	}

}
