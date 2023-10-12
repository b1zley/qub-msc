/**
 * 
 */
package methods;

/**
 * first work involving methods
 */
public class FirstMethod {

	/**
	 * @param args this main method deals with calling other methods Start point of
	 *             program
	 */

	public static void main(String[] args) {

		System.out.println("Start of main");
		
		
		
		printNameXTimes(3);
		
//		printName1000Times();
		
		
//		calculateYearUserTurns100(28);
		
		System.out.println("End of main");
	} // end of main

	/*
	 * invoke me method deals with... first invocation of method
	 * prints "Ouch! That hurt..." 
	 */
	public static void invokeMe() {
		System.out.println("Ouch! That hurt..." );
	}

	/*
	 * printName prints "My name is Josh"
	 */
	public static void printName() {
		System.out.println("Josh");
	}

	/*
	 * printNameXTimes calls printName a number of times passed as argument
	 */
	public static void printNameXTimes(int numberToPrint) {
		for (int i = 1; i <= numberToPrint; i++) {
			System.out.println("Josh");
		}
	}
	
	/*
	 * prints user name 1000 times - josh
	 */
	public static void printName1000Times () {
		for (int i = 1 ; i<= 1000 ; i++ ) {
			System.out.println("Josh");
		}
	}
	/*
	 * calculates and prints year user turns 100
	 */
	public static void calculateYearUserTurns100 (int userAge) {
		int remainingYears, currentYear, yearUserTurns100;
		remainingYears = 100 - userAge;
		currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
		yearUserTurns100 = currentYear + remainingYears;
		
		System.out.println(yearUserTurns100);
		
		
	}
}
