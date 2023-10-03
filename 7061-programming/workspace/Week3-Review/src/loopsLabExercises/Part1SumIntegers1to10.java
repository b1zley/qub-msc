/**
 * 
 */
package loopsLabExercises;

/**
 * examining different loops in this case - sum integers from 1 to 10
 */
public class Part1SumIntegers1to10 {

	/**
	 * must use a while loop
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, sum;
		num = 1;
		sum = 0;
		
		
		while (num <= 10) {
			sum += num;
			num++;
		}
		
		System.out.println("The sum is: " + sum);

	}

}
