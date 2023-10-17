/**
 * 
 */
package labexercises;

import java.util.Random;

/**
 * 
 */
public class Part2MethodsWithReturnTypes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(areaOfRectangle(3, 2));
		System.out.println(monthFromNumber(3));
		System.out.println(averageFromThreeInts(1, 2, 2));
		System.out.println(g8CountryCapitalCalculator("GermaNy"));
		coinToss("headS");
	}

	public static double areaOfRectangle(double height, double base) {
		double area;
		area = height * base;
		return area;
	}

	public static String monthFromNumber(int numberOfMonth) {
		String monthToReturn = "";

		switch (numberOfMonth) {
		case 1:
			monthToReturn = "January";
			break;
		case 2:
			monthToReturn = "February";
			break;
		case 3:
			monthToReturn = "March";
			break;
		case 4:
			monthToReturn = "April";
			break;
		case 5:
			monthToReturn = "May";
			break;
		case 6:
			monthToReturn = "June";
			break;
		case 7:
			monthToReturn = "July";
			break;
		case 8:
			monthToReturn = "August";
			break;
		case 9:
			monthToReturn = "September";
			break;
		case 10:
			monthToReturn = "October";
			break;
		case 11:
			monthToReturn = "November";
			break;
		case 12:
			monthToReturn = "December";
			break;

		default:
			monthToReturn = "homie you are on the wrong planet";
		}

		return monthToReturn;
	}

	public static double averageFromThreeInts(int num1, int num2, int num3) {
		double sum = (double) num1 + num2 + num3;

		double average = sum / 3;

		return average;
	}

	public static String g8CountryCapitalCalculator(String country) {
		String capital;
		capital = "Unknown";

		country = country.toUpperCase();

		switch (country) {
		case "CANADA":
			capital = "Ottawa";
			break;
		case "FRANCE":
			capital = "Paris";
			break;
		case "GERMANY":
			capital = "Berlin";
			break;
		case "ITALY":
			capital = "Rome";
			break;
		case "JAPAN":
			capital = "Tokyo";
			break;
		case "RUSSIA":
			capital = "Moscow";
			break;
		case "UNITED KINGDOM":
			capital = "London";
			break;
		case "UNITED STATES":
			capital = "Washington";
			break;

		default:
			capital = "not a g8 country man";
		}

		return capital;
	}

	public static void coinToss(String call) {
		boolean isCoinHeads, isCallHeads, isCallValid;
		isCallValid = true;

		Random rand = new Random();

		isCoinHeads = rand.nextBoolean();

		call = call.toUpperCase();

		isCallHeads = false;
		switch (call) {
		case "HEADS":
			isCallHeads = true;
			break;
		case "TAILS":
			isCallHeads = false;
			break;

		default:
			isCallValid = false;
		}

		if (isCallValid) {
			if (isCallHeads == isCoinHeads) {
				System.out.println("You got it!");
			} else {
				System.out.println("Not this time");
			}
			
			
		} else
		System.out.println("call invalid!");

	}
}
