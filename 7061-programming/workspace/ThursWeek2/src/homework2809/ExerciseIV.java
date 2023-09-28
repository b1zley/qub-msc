/**
 * 
 */
package homework2809;

import java.util.Scanner;

/**
 * Create an application that when given the month of the year i.e. 1 to 12 as
 * input will output the semester i.e. 1, 2 or summer.
 */
public class ExerciseIV {

	/**
	 * use switch statement + scanner.nextLine()
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userInput;
		int month;

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Please input a month of the year - eg 12 for december");

			userInput = scanner.nextLine();
			try {
				month = Integer.valueOf(userInput);
			} catch (Exception e) {
				month = -1;
			}

			switch (month) {

			case 9:
			case 10:
			case 11:
			case 12:
			case 1:
				System.out.println("Semester 1");
				break;

			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("Semester 2");
				break;

			case 6:
			case 7:
			case 8:
				System.out.println("Summer");
				break;

			default:
				System.out.println("Error: input not recognised - input should be as int between 1 and 12");
				continue;
			}

			break;
		}

	}

}
