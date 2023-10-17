/**
 * 
 */
package arrays;

import java.util.Arrays;

/**
 * 
 */
public class MethodsAndArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 2, 4, 8 };
		int[] moreNumbers = { 1, 2, 3 };

		printArray(numbers);
		printArray(moreNumbers);

		int[][] twoDimensionalArray = { numbers, moreNumbers };

		System.out.println(Arrays.toString(twoDimensionalArray[0]));
		System.out.println(Arrays.toString(twoDimensionalArray[1]));

		System.out.println(twoDimensionalArray[0][0]);

		System.out.println(totalOfNumbers(numbers));

	}

	/*
	 * method which prints an int array to console
	 */
	public static void printArray(int[] arrayPassed) {
		System.out.println("index\tvalue");
		for (int i = 0; i < arrayPassed.length; i++) {
			System.out.println(i + "\t" + arrayPassed[i]);
		}
	}
	/*
	 * method which returns the sum of all the values in an integer array, as an int
	 */
	public static int totalOfNumbers(int[] anArray) {
		int total;
		total = 0;

		for (int i = 0; i < anArray.length; i++) {
			total += anArray[i];
		}

		return total;
	}

}
