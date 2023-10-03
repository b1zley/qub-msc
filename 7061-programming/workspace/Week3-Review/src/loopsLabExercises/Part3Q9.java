/**
 * 
 */
package loopsLabExercises;

/**
 * for loops
 */
public class Part3Q9 {

	/**
	 * 
	 * output leap years between 1910 and 1990
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1910; i <= 1990; i++) {
			if (i % 4 == 0) {
				System.out.println(i);
			}
		}

	}

}
