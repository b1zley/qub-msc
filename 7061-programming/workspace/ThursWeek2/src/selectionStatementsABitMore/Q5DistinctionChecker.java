/**
 * 
 */
package selectionStatementsABitMore;

/**
 * Create a Java program (using an IF... ELSE and then a Conditional operator)
 * that will output "Distinction" if a project mark is over 69 otherwise "Pass".
 */
public class Q5DistinctionChecker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int inputMark, distinctionBoundary;

		distinctionBoundary = 69;

		inputMark = 79;

		if (inputMark > distinctionBoundary) {
			System.out.println("Distinction");
		} else {
			System.out.println("Pass");
		}

	}

}
