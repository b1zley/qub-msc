/**
 * 
 */
package review;

/**
 * 
 */
public class AidanCodeReview {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(numberToMonth(12));

	}

	/*
	 * This method converts a number, passed as an integer to the corresponding
	 * month, output to console Accepts parameter values between 1 and 12 to output
	 * the given month if a value which lies outside this range is passed an invalid
	 * output is given.
	 */

	public static String numberToMonth(int monthNumber) {

		String monthName = "";

		switch (monthNumber) {
		case 1:
			monthName = "January";
			break;
		case 2:
			monthName = "February";
			break;
		case 3:
			monthName = "March";
			break;
		case 4:
			monthName = "April";
			break;
		case 5:
			monthName = "May";
			break;
		case 6:
			monthName = "June";
			break;
		case 7:
			monthName = "July";
			break;
		case 8:
			monthName = "August";
			break;
		case 9:
			monthName = "September";
			break;
		case 10:
			monthName = "October";
			break;
		case 11:
			monthName = "November";
			break;
		case 12:
			monthName = "December";
			break;
		default:
			monthName = "Invalid month number";
		}
		return monthName;

	}

}
