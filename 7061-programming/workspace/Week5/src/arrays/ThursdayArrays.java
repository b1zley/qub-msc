/**
 * 
 */
package arrays;

/**
 * 
 */
public class ThursdayArrays {

	/**
	 * enhanced for loops
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 2, 4, 8, 10 };

		for (int number : numbers) {
			System.out.println(number);
		}

		System.out.println();

		displayAll(numbers);

		System.out.println();
		// total of all the values in the array
		System.out.println(sumArray(numbers));

	}

	public static void displayAll(int[] passedArray) {

		for (int number : passedArray) {
			System.out.println(number);
		}

	}

	public static int sumArray(int[] passedArray) {
		int total;
		total = 0;
		for (int number : passedArray) {
			total += number;
		}
		return total;
	}
	
	

}
