/**
 * 
 */
package challenges;

import java.util.Arrays;

/**
 * 
 */
public class CodeBreaker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// string to convert
		String userInput = "Aidan McGowan";
		
		//array used for output, initialized at length of input string
		int outputArray[] = new int[userInput.length()];
		
		
		for (int i = 0; i < userInput.length(); i++) {
			outputArray[i] = (int) userInput.charAt(i);

			
		}
		
		//call the Arrays method toString to output the 
		//ascii encoded array
		System.out.println(Arrays.toString(outputArray));
		
		int inputArray[] = outputArray;
		
		System.out.println(decodeIntArrayToString(inputArray));
		
		
		
		

	}
	/*
	 * method which converts input int[] to corresponding ascii
	 * returning a string
	 */
	public static String decodeIntArrayToString(int[] asciiArray) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < asciiArray.length; i++) {
			sb.append((char) asciiArray[i]);
		}
		
		return sb.toString();
	}

}
