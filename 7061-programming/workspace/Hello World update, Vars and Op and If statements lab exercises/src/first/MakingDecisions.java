/**
 * 
 */
package first;

/**
 * 
 */
public class MakingDecisions {

	public static void compareTwoNumbersAndPrint(int number1, int number2) {
		System.out.println("Numbers to compare: " + number1 + " and " + number2);

		if (number1 > number2) {
			System.out.println("Biggest number " + number1);
		} else if (number2 > number1) {
			System.out.println("Biggest number " + number2);
		} else {
			System.out.println("Numbers are the same");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number1 = 3;
		int number2 = 10;

		compareTwoNumbersAndPrint(number1, number2);
		
		number1 = 44;
		number2 = 10;
		
		compareTwoNumbersAndPrint(number1, number2);
		
		number1 = 44;
		number2 = 44;
		
		compareTwoNumbersAndPrint(number1, number2);
		

	}

}
