/**
 * 
 */
package arrays;

import java.util.Arrays;

/**
 * 
 */
public class TuesdayArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] myArray = { 11, 10, 10, 9, 11, 9, 11, 8.5 };
		double sum, average;
		sum = 0;
		average = 0;
		System.out.println("index\tvalue");

		for (int i = 0; i < myArray.length; i++) {
			sum += myArray[i];
			System.out.println(i+"\t"+myArray[i]);
		}

		average = sum / myArray.length;

		average = Math.round(average * 2);
		average /= 2;

		System.out.println("average\t" + average);
		
		
		System.out.println("values\t"+Arrays.toString(myArray));

	}

}
