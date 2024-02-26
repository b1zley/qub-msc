/**
 * 
 */
package lecture;

/**
 * 
 */
public class QuestionFour {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int day = 21 % 7; // day is initialised as 0
		
		String dayName;

		switch (day) {
		case 1:
			dayName = "Manic Monday";
			break;
		case 2:
		case 3:
		case 4:
		case 5:
			dayName = "Weekday";
			break;
		case 6:
		case 7:
			dayName = "Weekend";
		default:
			dayName = "Invalid day";

		}
		
		// case statement sets dayName to "Invalid day"
		

		System.out.println("The day of the week is " + dayName);
	}

}
