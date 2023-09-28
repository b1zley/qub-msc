/**
 * 
 */
package selectionStatementsABitMore;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a Java program to check whether a letter is vowel or consonant using a
 * switch statement.
 */
public class Q3VowelOrConsonant {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		String userInput;

		char[] vowelList = { 'a', 'e', 'i', 'o', 'u' };
		char[] consonantList = { 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v',
				'x', 'y', 'z' };
		
		System.out.println("Please input a character");
		
		userInput = scanner.nextLine();
		
		char [] inputArray = userInput.toLowerCase().toCharArray();
		
		if(inputArray.length > 1) {
			System.out.println("One character only!");
			return;
		}  else {
			
			for (int i = 0 ; i < vowelList.length ; i++) {
				if(inputArray[0] == vowelList[i]) {
					System.out.println(userInput + " is a vowel!");
					return;
				}
			}
			
			for (int i = 0 ; i < consonantList.length ; i++) {
				if (inputArray[0] == consonantList[i]) {
					System.out.println(userInput + " is a consonant!");
					return;
				}
			}
			
			System.out.println("This character is neither a vowel nor consonant!");
		}
		
		
	}
}
