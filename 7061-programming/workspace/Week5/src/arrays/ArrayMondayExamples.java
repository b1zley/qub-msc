/**
 * 
 */
package arrays;

import java.util.Arrays;

/**
 * 
 */
public class ArrayMondayExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myShoeSizes ={9,42,73,30,50};

		System.out.println(Arrays.toString(myShoeSizes));
//
//		for (int shoeSize : myShoeSizes) {
//			System.out.println(shoeSize);
//		}
		System.out.println("Print shoe sizes!");
		for (int i = 0; i < myShoeSizes.length; i++) {
			System.out.println(i + ":\t" + myShoeSizes[i]);
		}

	}

}
