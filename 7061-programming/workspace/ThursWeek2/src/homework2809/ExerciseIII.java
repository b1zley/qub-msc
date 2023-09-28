/**
 * 
 */
package homework2809;

import java.util.Scanner;

/**
 * Create an application that when given the month of the year i.e. 1 to 12 as
 * input will output the semester i.e. 1, 2 or summer.
 */
public class ExerciseIII {

	/**
	 * use if else and scanner
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month;
		String userInput;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please input a month (eg january = 1)");

		userInput = scanner.nextLine();
		try {
			month = Integer.valueOf(userInput);
			if ((month >= 9 && month <= 12) || month == 1) {
				System.out.println("Semester 1");
			} else if (month >= 2 && month <= 5) {
				System.out.println("Semester 2");
			} else if (month >= 6 && month <= 8) {
				System.out.println("Summer");
			} else {
				System.out.println("Input not recognised - input an integer between 1 and 12");
			}
		} catch (Exception e) {
			System.out.println("Input not recognised - input an integer between 1 and 12");
		}

		

	}

}
