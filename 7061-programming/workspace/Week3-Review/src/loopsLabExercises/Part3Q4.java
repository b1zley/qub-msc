/**
 * 
 */
package loopsLabExercises;

/**
 * q3 while loop
 */
public class Part3Q4 {

	/**
	 * 10, 9, 8 ... liftoff
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		i = 10;
		
		while (i>0) {
			System.out.print(i + ", ");
			
			if (i == 1) {
				System.out.print("Liftoff!");
			}
			i--;
		}
		
		
	}

}
