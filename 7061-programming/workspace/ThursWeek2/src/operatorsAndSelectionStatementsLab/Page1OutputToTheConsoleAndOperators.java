/**
 * 
 */
package operatorsAndSelectionStatementsLab;

import java.util.Scanner;

import java.text.DecimalFormat;
/**
 * Write a Java program to accomplish each of the following tasks:
1. Prompt the user for a decimal point number.
2. Assign the number to a suitable variable
provide statistics
 */
public class Page1OutputToTheConsoleAndOperators {

	/**
	 * 
	 * must import scanner - then using various static math functions
	 * @param args
	 */
	
	public static double roundToInputDecimalPlaces (double numberToRound, int decimalPlaces) {
		double returnValue;
		double multiplicationFactor;
		returnValue = -1;
		
		
		multiplicationFactor = Math.pow(10, decimalPlaces);
		
		returnValue = (Math.round(numberToRound * multiplicationFactor)/multiplicationFactor);
		
		
		return returnValue;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String userInput;
		double userInputDouble;
		
		double answerRoundedTwoDP;
		double answerSquaredThreeDP;
		double answerCubedThreeDP;
		double answerSqRTFourDP;
		
		Scanner scanner = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("0.000");
		
		System.out.println("Please enter a decimal point number in the format xx.xxx");
		System.out.println("eg 12.3456");
		
		userInput = scanner.nextLine();
		
		userInputDouble = Double.valueOf(userInput);
		
		// to round to two decimal places using the math.round function 
		// (which returns an integer
		// we must multiply by 100, then round, then divide by 100
		answerRoundedTwoDP = roundToInputDecimalPlaces(userInputDouble, 2);
		
		answerSquaredThreeDP = roundToInputDecimalPlaces(Math.pow(userInputDouble, 2), 3);
		
		answerCubedThreeDP = roundToInputDecimalPlaces(Math.pow(userInputDouble, 3),3);
		
		
		answerSqRTFourDP = roundToInputDecimalPlaces(Math.sqrt(userInputDouble),4);
		
		System.out.println("Number rounded (two decimal places)\t: " + answerRoundedTwoDP);
		System.out.println("Number squared (three decimal places)\t: " + answerSquaredThreeDP);
		System.out.println("Number cubed to (three decimal places)\t: " + df.format(answerCubedThreeDP));
		System.out.println("Square root (four decimal places)\t: " + answerSqRTFourDP);
		

	}

}
