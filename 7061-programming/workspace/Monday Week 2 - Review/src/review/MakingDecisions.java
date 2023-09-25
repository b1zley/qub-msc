/**
 * 
 */
package review;

/**
 * My first IF statements
 */
public class MakingDecisions {

	/**
	 * Start point for various IF statement operators
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// declare vars
		int num1, num2;

		num1 = 20;
		num2 = 10;

		System.out.println("Num1 " + num1);
		System.out.println("Num2 " + num2);

		if (num1 == num2) {
			System.out.println(num1 + " is the same as " + num2);
		}

		if (num1 != num2) {
			System.out.println(num1 + " is not the same as " + num2);
		}

		if (num1 > num2) {
			System.out.println(num1 + " is greater than " + num2);
		}

		if (num1 < num2) {
			System.out.println(num1 + " is less than" + num2);
		}

		System.out.println("Done");
	}

}
