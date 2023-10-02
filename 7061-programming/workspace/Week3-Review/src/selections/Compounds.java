/**
 * 
 */
package selections;

/**
 * reviewing selection statements covered so far
 */
public class Compounds {

	/**
	 * @param args if | else if | else | switch | etc
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp;
		temp = 9;

		if (temp > 10) {
			System.out.println("Light coat");
		} else if (temp > 1 && temp <= 10) {
			System.out.println("Medium coat");
		} else {
			System.out.println("Big coat");
		}

		// switch

		int number;
		number = 1000;

		switch (number) {
		case 1:
			System.out.println("Uno");
			break;
		case 2:
			System.out.println("Dos");
			break;
		default:
			System.out.println("Unknown");

		} // end of switch
	}

}
