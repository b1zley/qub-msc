/**
 * 
 */
package challenges;

/**
 * 
 */
public class FizzBuzz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for (int i = 0; i <= 100; i++) {
			if (i % 5 == 0 && i % 3 == 0 ) {
				System.out.println("Fizz Buzz");
			} else if (i % 5 == 0 ) {
				System.out.println("Buzz");
			} else if (i % 3 == 0 ) {
				System.out.println("Fizz");
			} else {
				System.out.println(i);
			}
		}
	}

}
