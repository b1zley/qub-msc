/**
 * 
 */
package compoundsAndLoops;

/**
 * while, do while, for loops for increment control
 */
public class IncrementControlLoop {

	/**
	 * apparently we're just using while loops but I might just stick them all in here anyway :)
	 * @param args
	 */
	public static void main(String[] args) {
		// 1001 to 0
		// only print even numbers
//		
//		int loop;
//		loop = 1001;
//		
//		if (loop % 2 != 0) {
//			loop -=1;
//		}
//		
//		
//		while (loop >= 0) {
//			System.out.println(loop);
//			loop-=2;
//			
//		}
//		#
		int count;
		count = 10;
		
		
		do {
			System.out.println(count);
			count--;
		} while (count >= 0);
		System.out.println("Blast off!");

	}

}
