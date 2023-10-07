/**
 * 
 */
package loopsLabExercises;

/**
 * 
 */
public class BreaksAndContinues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 10; i >=0 ; i--) {
			if (i == 3 ) {
				System.out.println("ABORT");
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("Blast off!");
		
		
	}

}
