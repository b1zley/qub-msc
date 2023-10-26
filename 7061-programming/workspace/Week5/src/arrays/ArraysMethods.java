/**
 * 
 */
package arrays;

import java.util.Arrays;

/**
 * 
 */
public class ArraysMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myNumbers = { 2, 4, 10, 2, 6, 10, 78, 3 };

		System.out.println(Arrays.toString(myNumbers));

		Arrays.sort(myNumbers);

		System.out.println(Arrays.toString(myNumbers));
		int[][] myJag = { {2,4,5}, {1,2,3,4}, {8,8,9} };
		
		
		
		for (int row = 0; row < myJag.length ; row++) {
			for (int col = 0; col < myJag[row].length; col++) {
				System.out.print(myJag[row][col] +"\t");
			}
			System.out.println();
		}
	}

}
