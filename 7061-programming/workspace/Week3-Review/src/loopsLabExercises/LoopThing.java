/**
 * 
 */
package loopsLabExercises;

/**
 * 
 */
public class LoopThing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1000; i >= 0; i--) {
			if (i % 2 == 0 && i % 3 == 0 && i % 7 == 0) {
				System.out.println(i);
			}

		}
		System.out.println("Blast off!");

	}

}
