/**
 * 
 */
package selectionStatementsABitMore;

import java.util.Scanner;

/**
 * Write a Java program to print the day of week name using a switch statement
 * (i.e. if the input is 1 it outputs Sunday, 2 is Monday etc)
 */
public class Q2DayOfWeekSwitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sun, mon, tue, wed, thu, fri, sat, userInput;
		int inputDay;

		sun = "Sunday";
		mon = "Monday";
		tue = "Tuesday";
		wed = "Wednesday";
		thu = "Thursday";
		fri = "Friday";
		sat = "Saturday";

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please input a day of the week - eg 1 = sunday");

		userInput = scanner.nextLine();
		try {
			inputDay = Integer.valueOf(userInput);
		} catch (Exception e) {
			System.out.println("Error - must input an integer between 1 and 7");
			return;
		}

		switch (inputDay) {
		case 1:
			System.out.println(sun);
			break;
		case 2:
			System.out.println(mon);
			break;
		case 3:
			System.out.println(tue);
			break;
		case 4:
			System.out.println(wed);
			break;
		case 5:
			System.out.println(thu);
			break;
		case 6:
			System.out.println(fri);
			break;
		case 7:
			System.out.println(sat);
			break;
		default:
			System.out.println("Error - day not recognised");
		}

	}

}
