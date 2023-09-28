/**
 * 
 */
package morningSession;

/**
 * 
 */
public class Postcode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String post;

		post = "BT11";

		switch (post) {
		case "BT9": 
			System.out.println("Malone Road");
			break;
		
		
		case "BT11":
			System.out.println("Belfast");
			break;
		
		
		default :
			System.out.println("Unknown");
		
		}
	}

}
