package methods;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ThursdayExampleMethod {

	public static void main(String[] args) {
//		int a, b, c;
//		a = 9;
//		b = 10;
//
//		System.out.println("Start program");
//		sumTwoInts(a, b);
//		System.out.println("End program");
//
//		countdownToEndpoint(10, 5);
//
//		min(2, 30000);
//
//		System.out.println(averageAge(1, 2, 3, 4));

		calculator();
	}

	public static void sumTwoInts(int a, int b) {
		int result;
		result = a + b;
		System.out.println("Sum is " + result);
	}

	/**
	 * This method takes a number to countdown from from the user as an integer, and
	 * a number to end at as an integer. The method then prints this number, then
	 * all numbers to a custom endpoint in descending order, each on a new line.
	 * 
	 * @param numberToStart - number to begin countdown at, if less than 0, prints
	 *                      nothing
	 * @param numberToEnd   - number to end countdown at, inclusive. If larger than
	 *                      numberToStart, nothing is printed
	 */
	public static void countdownToEndpoint(int numberToStart, int numberToEnd) {
		for (; numberToStart >= numberToEnd; numberToStart--) {
			System.out.println(numberToStart);
		}
	}

	/**
	 * accepts two integers as parameters and prints smallest value to screen, if
	 * numbers are equal, prints second input
	 * 
	 * @param num1
	 * @param num2
	 */
	public static void min(int num1, int num2) {
		System.out.println(num1 < num2 ? num1 : num2);
	}

	/**
	 * prints average of 4 life expectancy integers, passed as parameters, to screen
	 * 
	 * @param num1
	 * @param num2
	 * @param num3
	 * @param num4
	 */
	public static double averageAge(int age1, int age2, int age3, int age4) {
		int sum;
		double average;

		sum = age1 + age2 + age3 + age4;

		average = (double) sum / 4;
		average = (Math.round(average * 100));
		average /= 100;
		return average;
	}

	public static double addTwoNumbers(double num1, double num2) {
		double result;

		result = num1 + num2;

		return result;
	}

	public static double subtractBFromA(double a, double b) {
		double result;

		result = a - b;

		return result;
	}

	public static double multiplyAAndB(double a, double b) {
		double result;
		result = a * b;
		return result;
	}

	public static double divideBintoA(double a, double b) {
		double result;
		result = a / b;
		return result;
	}

	public static void calculator() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input your calculation. eg : 2 / 1");

		double input1, input3;
		char input2;

		String userInput = scanner.nextLine();

		char[] inputArray = userInput.toCharArray();

		System.out.println(inputArray);
		char[] inputArray1 = { ' ', ' ', ' ', ' ' };
		char[] inputArray2 = { ' ', ' ', ' ', ' ' };
		char[] inputArray3 = { ' ', ' ', ' ', ' ' };

		int inputArray1Endpoint = -1;

		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i + 1] == ' ') {
				inputArray1Endpoint = i;
				break;

			}

		}

		System.out.println("inputArray1Endpoint:" + inputArray1Endpoint);

		for (int inner = 0; inner <= inputArray1Endpoint; inner++) {
			inputArray1[inner] = inputArray[inner];
		}

		System.out.println(inputArray1);

		// start of inputArray2

		// find array2 endpoint (' ')
		int inputArray2Endpoint = -1;
		for (int i = (inputArray1Endpoint + 2); i < inputArray.length; i++) {
			if (inputArray[i + 1] == ' ') {
				inputArray2Endpoint = i;
				break;
			}
		}

		// create inputArray2
		int inputArray2Counter = 0;
		for (int i = (inputArray1Endpoint + 2); i <= inputArray2Endpoint; i++) {
			
			inputArray2[inputArray2Counter] = inputArray[i];
			inputArray2Counter++;
		}
		System.out.println(inputArray1);
		System.out.println(inputArray2);

		// start of inputArray3
		System.out.println("inputArray3");
		
		int inputArray3Counter = 0;
		System.out.println("inputArray2Endpoint " + inputArray2Endpoint);
		for (int i = (inputArray2Endpoint + 2); i < inputArray.length; i++) {
			System.out.println(i);
			
			inputArray3[inputArray3Counter] = inputArray[i];
			
			System.out.println(inputArray3);
			inputArray3Counter++;
			
		}
		
		
		System.out.println(inputArray1);
		
		System.out.println(inputArray2);
		
		System.out.println(inputArray3);
	}

}
