/**
 * 
 */
package selectionStatementsABitMore;

/**
 * Create a Java program (using an IF... ELSE IF..) to grade the projects using
 * the following boundaries
 */
public class Q6ProjectGrader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int inputMark, passBoundary, commendationBoundary, wonderfulBoundary, max, min;
		
		
		inputMark = 80;
		
		max = 100;
		min = 0;
		
		passBoundary = 50;
		commendationBoundary = 60;
		wonderfulBoundary = 70;
		
		
		if(inputMark > max || inputMark < min || inputMark != (int) inputMark) {
			System.out.println("Invalid input");
		} else if (inputMark >= wonderfulBoundary) {
			System.out.println("Wonderful");
		} else if (inputMark >= commendationBoundary) {
			System.out.println("Commendation");
		} else if (inputMark >= passBoundary) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
	}

}
