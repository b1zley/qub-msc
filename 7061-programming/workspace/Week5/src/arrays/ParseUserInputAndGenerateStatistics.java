/**
 * 
 */
package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */
public class ParseUserInputAndGenerateStatistics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// assigned seriesOfAges to int array generated from enter values
		int[] seriesOfAges = enterValues();

		System.out.println("maxAge\t\t"+maxAge(seriesOfAges));

		System.out.println("minAge\t\t"+minAge(seriesOfAges));
		
		System.out.println("averageAge\t"+averageAges(seriesOfAges));
		
		System.out.println("values\t\t"+Arrays.toString(seriesOfAges));

	}
	/*
	 * prompts user for input and generates an integer array based on inputs
	 * this array can only accept int values
	 *firstly prompts the user for the lenght of the arrray
	 *then prompts the user for each value
	 */
	public static int[] enterValues() {

		int arrayLength;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter length of array...");

		arrayLength = scanner.nextInt();

		scanner.nextLine();

		int[] seriesOfAges = new int[arrayLength];

		System.out.println("Input a series of ages...");

		for (int loop = 0; loop < arrayLength; loop++) {

			seriesOfAges[loop] = scanner.nextInt();

			scanner.nextLine();

		}

		scanner.close();

		return seriesOfAges;

	}
	/*
	 * returns the max value from a passed int array as an integer
	 */
	public static int maxAge(int[] ageArray) {

		int largest = ageArray[0];

		for (int i = 0; i < ageArray.length; i++) {

			if (ageArray[i] > largest) {

				largest = ageArray[i];

			}

		}

		return largest;

	}
	/*
	 * returns the min value from a passed int array as an integer
	 */
	public static int minAge(int[] ageArray) {

		int smallest = ageArray[0];

		for (int i = 0; i < ageArray.length; i++) {

			if (ageArray[i] < smallest) {

				smallest = ageArray[i];

			}

		}

		return smallest;

	}
	/*
	 * returns the average value from a passed int array - as a double
	 */
	public static double averageAges(int[] ageArray) {

		double average = 0;

		for (int i = 0; i < ageArray.length; i++) {

			average += ageArray[i];

		}

		return Math.round(average / ageArray.length);

	}

}
