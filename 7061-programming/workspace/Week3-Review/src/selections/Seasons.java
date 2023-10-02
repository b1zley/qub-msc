/**
 * 
 */
package selections;

/**
 * 02/10/29 - seasons for fall through in switch statements
 */
public class Seasons {

	/**
	 * @param args
	 * 
	 *             switch
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month;
		month = 1;

		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("Winter");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("Spring");
			break;
			
		case 6:
		case 7:
		case 8:
			System.out.println("Summer");
			break;

		case 9:
		case 10:
		case 11:
			System.out.println("Autumn");
			break;

		default:
			System.out.println("Unknown!");

		}
	}

}
