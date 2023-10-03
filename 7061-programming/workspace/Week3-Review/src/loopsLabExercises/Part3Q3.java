/**
 * 
 */
package loopsLabExercises;

/**
 * for loops
 */
public class Part3Q3 {

	/**
	 * 10,9,8,7,6, ... liftoff
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for (int i = 10; i>0; i--) {
			System.out.print(i+", ");
			
			if (i == 1) {
				System.out.print("Liftoff!");
			}
		}
	}

}
