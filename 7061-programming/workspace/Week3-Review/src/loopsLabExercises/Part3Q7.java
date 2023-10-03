/**
 * 
 */
package loopsLabExercises;

/**
 * for loops
 */
public class Part3Q7 {

	/**
	 * countdown 1000 to 0 - break at 333 
	 * and out "Launch aborted!"
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1000; i >= 0 ; i--) {
			System.out.println(i);
			if (i == 333) {
				System.out.println("Launch aborted!");
				break;
			}
			
		}
		
	}

}
