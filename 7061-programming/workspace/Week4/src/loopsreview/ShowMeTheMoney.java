/**
 * 
 */
package loopsreview;

/**
 * show me the money for loop exercise
 */
public class ShowMeTheMoney {

	/**
	 * 
	 * must forecast savings each year if £1000 input initially
	 * 
	 * and 5% interest per year
	 * 
	 * compound interest!
	 * 
	 * 
	 * should print from 1 - 10 years print 2 dp
	 * 
	 * 
	 * 
	 * @param args
	 */

	public static final double INTEREST_RATE = 1.05;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double savings;

		savings = 1000;

		int yearsRan;

		yearsRan = 10;

		System.out.println("Year\tAmount(£)");
		
		// use year instead of i

		for (int i = 1; i <= yearsRan; i++) {

			savings *= INTEREST_RATE;

			System.out.printf("%d\t%.2f\n", i, savings);
		}

	}

}
