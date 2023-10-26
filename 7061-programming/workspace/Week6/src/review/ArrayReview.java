/**
 * 
 */
package review;

import java.util.Arrays;

/**
 * 
 */
public class ArrayReview {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = { 5, 6, 8, 12, 1, 5 };

		myArray(myArray);

		System.out.println("Max value is: " + max(myArray));

		System.out.println("Min value is: " + min(myArray));

		System.out.println("Average value is: " + average(myArray));

//		updater(myArray,3);
		System.out.println(Arrays.toString(myArray));

		// sort
		Arrays.sort(myArray);
		System.out.println(Arrays.toString(myArray));

		System.out.println(findIndexOfValue(myArray, 5));
		
		
		System.out.println(findIndexOfValue(myArray, 12 ));
	}

	public static void myArray(int[] myArray) {
		System.out.println("Values:");
		for (int arrayPointer : myArray) {
			System.out.println(arrayPointer);
		}

	}

	public static int max(int[] myArray) {
		int max;
		max = -1;

		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] > max) {
				max = myArray[i];
			}
		}

		return max;
	}

	public static int min(int[] myArray) {
		int min;
		min = myArray[0];

		for (int i = 1; i < myArray.length; i++) {
			if (min > myArray[i]) {
				min = myArray[i];
			}
		}

		return min;
	}

	public static double average(int[] myArray) {
		int sum = 0;
		double average;
		for (int i = 0; i < myArray.length; i++) {
			sum += myArray[i];
		}

		average = (double) sum / myArray.length;

		average *= 1000;

		average = Math.round(average);

		average /= 1000;

		return average;
	}

	public static void updater(int[] myArray, int update) {

		for (int i = 0; i < myArray.length; i++) {
			myArray[i] += update;
		}
	}

	public static int findIndexOfValue(int[] myArray, int searchKey) {

		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] == searchKey) {
				return i;
			}
		}

		return -1;

	}

	public static int findIndexBinary(int[] myArray, int searchKey) {
		int indexFoundAt = -1;

		int middle;
		int topBound, bottomBound;
		
		topBound = myArray.length-1;
		bottomBound = 0;

		middle = myArray.length / 2;

		do {
			if(middle == searchKey) {
				indexFoundAt = middle;
			} else if (middle > searchKey) {
				topBound = middle;
				bottomBound = 0;
				middle = (topBound + bottomBound) /2 ;
				
			} else if (middle < searchKey) {
				bottomBound = middle;
				middle = (topBound+bottomBound) / 2;
			}
		} while (indexFoundAt == -1);

		return indexFoundAt;
	}

}
