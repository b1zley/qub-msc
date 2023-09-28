/**
 * 
 */
package selectionStatementsABitMore;
import java.util.Scanner;
/**
 * Write a Java program to print the day of 
 * week name using If.. else if statements 
 * (i.e. if the input is 1 it outputs Sunday, 2 is Monday etc)
 */
public class Q1DayOfWeek {

	/**
	 * use scanner and if else
	 * @param args
	 */
	public static void main(String[] args) {
		
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
		
		inputDay = Integer.valueOf(userInput);
		
		if(inputDay == 1) {
			System.out.println(sun);
		} else if (inputDay == 2) {
			System.out.println(mon);
		} else if (inputDay == 3 ) {
			System.out.println(tue);
		} else if (inputDay == 4 ) {
			System.out.println(wed);
		} else if (inputDay == 5 ) {
			System.out.println(thu);
		} else if (inputDay == 6 ) {
			System.out.println(fri);
		} else if (inputDay == 7 ) {
			System.out.println(sat);
		} else {
			System.out.println("unknown input");
		}
		
		
	}

}
