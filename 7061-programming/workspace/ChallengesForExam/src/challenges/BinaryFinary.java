/**
 * 
 */
package challenges;

import java.util.Arrays;

/**
 * 
 */
public class BinaryFinary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean[] inputBooleanArray = { true, false, false, true, false, true, false, true };

		System.out.println(Arrays.toString(intArrayFromBooleanArray(inputBooleanArray)));

		int[] inputIntArray = {1,0,1,0, 1,1,0,0};
		System.out.println(decimalValueFromIntArray(inputIntArray));

	}

	public static int[] intArrayFromBooleanArray(boolean[] booleanArray) {

		int[] intArray = new int[booleanArray.length];

		for (int i = 0; i < booleanArray.length; i++) {
			if (booleanArray[i]) {
				intArray[i] = 1;
			} else {
				intArray[i] = 0;
			}
		}

		return intArray;
	}

	public static int decimalValueFromIntArray(int[] intArray) {
		int answer = 0;
		System.out.println(intArray.length);
		for (int i = 0; i < intArray.length; i++) {

			if (intArray[i] == 1) {
				System.out.println("i"+i);
				
				double sumToAnswer = 2;
				sumToAnswer = Math.pow(sumToAnswer, intArray.length-1 - i);
				System.out.println(sumToAnswer);

				answer += sumToAnswer;
			}

		}

		return answer;
	}

}
