/**
 * 
 */
package challenges;

import java.util.Arrays;

/**
 * 
 */
public class RainfallStatistics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// a 2D array for monthly rainfall data in mm per day in each month
		int[][] monthlyRainfall = {
				// January (31 days)
				{ 12, 8, 23, 4, 0, 9, 2, 3, 11, 14, 7, 18, 15, 1, 0, 2, 4, 0, 1, 1, 0, 0, 1, 0, 10, 3, 2, 0, 0, 0, 3 },
				// February (28 days)
				{ 3, 6, 9, 5, 7, 2, 4, 7, 6, 8, 7, 9, 0, 0, 0, 0, 0, 0, 0, 3, 1, 0, 2, 0, 9, 8, 0, 6 },
				// March (31 days)
				{ 1, 8, 0, 11, 8, 5, 7, 8, 4, 3, 7, 6, 5, 9, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				// April (30 days)
				{ 3, 6, 5, 4, 8, 9, 6, 4, 3, 7, 6, 5, 8, 7, 6, 5, 9, 4, 0, 2, 0, 0, 2, 0, 0, 2, 0, 0, 0, 2 },
				// May (31 days)
				{ 2, 5, 8, 7, 6, 9, 8, 2, 7, 5, 3, 6, 8, 9, 4, 6, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2 },
				// June (30 days)
				{ 0, 6, 5, 8, 9, 6, 4, 7, 6, 5, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				// July (31 days)
				{ 1, 6, 0, 9, 7, 6, 5, 4, 8, 9, 6, 5, 7, 7, 4, 6, 8, 7, 5, 3, 7, 9, 8, 6, 5, 9, 0, 0, 2, 0, 0 },
				// August (31 days)
				{ 7, 6, 5, 8, 9, 6, 5, 4, 7, 6, 5, 9, 0, 0, 2, 0, 0, 0, 2, 0, 3, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0 },
				// September (30 days)
				{ 0, 0, 0, 1, 0, 0, 3, 0, 0, 0, 0, 0, 1, 9, 1, 1, 0, 0, 0, 0, 2, 3, 8, 0, 0, 0, 1, 1, 0, 0 },
				// October (31 days)
				{ 2, 5, 0, 0, 6, 0, 0, 0, 0, 5, 3, 0, 0, 0, 4, 6, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0 },
				// November (30 days)
				{ 7, 0, 5, 4, 8, 9, 6, 4, 3, 7, 6, 5, 8, 7, 6, 5, 9, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0 },
				// December (31 days)
				{ 2, 5, 8, 7, 6, 9, 8, 7, 5, 6, 3, 6, 9, 1, 2, 3, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 2, 0, 0, 1 } };

		displayRainfall(monthlyRainfall);
		System.out.println();
		System.out.println("Heaviest day rain total : " + heaviestDayFromRainAnalysis(monthlyRainfall) + "(mm)");
		
		
		int totalRainfallInYear = totalRainfallFromRainAnalysis(monthlyRainfall);
		System.out.println("Total of rain in year : " + totalRainfallInYear + "(mm)");
		System.out.printf("Rainfall average per year : %.2f(mm)\n" ,averageRainfallPerDayFromRainAnalysis(totalRainfallInYear, 365));
		
		System.out.println();
		displayTotalRainDaysInEachMonthRainAnalysis(monthlyRainfall);
		
		System.out.println();
		System.out.println("Month with most rain by volume : "+monthFromInt(monthWithMostRainByVolume(monthlyRainfall)));
		
		
		displayRainfallSortedAscending(monthlyRainfall);
		
		
	}

	public static void displayRainfall(int[][] monthlyRainfall) {

		System.out.println("All rainfall per month (mm)");
		for (int month = 0; month < monthlyRainfall.length; month++) {
			System.out.print(monthFromInt(month) + "\t");

			for (int day = 0; day < monthlyRainfall[month].length; day++) {
				System.out.print(monthlyRainfall[month][day] + " ");
			}
			System.out.println();
		}
	}
	
	

	public static String monthFromInt(int monthInt) {
		String monthString;
		switch (monthInt) {
		case 0:
			monthString = "Jan";
			break;
		case 1:
			monthString = "Feb";
			break;
		case 2:
			monthString = "Mar";
			break;
		case 3:
			monthString = "Apr";
			break;
		case 4:
			monthString = "May";
			break;
		case 5:
			monthString = "Jun";
			break;
		case 6:
			monthString = "Jul";
			break;
		case 7:
			monthString = "Aug";
			break;
		case 8:
			monthString = "Sep";
			break;
		case 9:
			monthString = "Oct";
			break;
		case 10:
			monthString = "Nov";
			break;
		case 11:
			monthString = "Dec";
			break;
		default:
			monthString = "UNKNOWN";
			break;

		}

		return monthString;

	}

	public static int heaviestDayFromRainAnalysis(int[][] monthlyRainfall) {
		int heaviestRainfall = 0;
		for (int month = 0; month < monthlyRainfall.length; month++) {
			for (int day = 0; day < monthlyRainfall[month].length; day++) {
				if (monthlyRainfall[month][day] > heaviestRainfall) {
					heaviestRainfall = monthlyRainfall[month][day];
				}
			}
		}
		return heaviestRainfall;

	}
	
	public static int totalRainfallFromRainAnalysis (int[][] monthlyRainfall) {
		int totalRainfall = 0;
		for (int month = 0 ; month < monthlyRainfall.length ; month++) {
			for ( int day = 0 ; day < monthlyRainfall[month].length ; day++) {
				totalRainfall += monthlyRainfall[month][day];
				
			}
		}
		
		return totalRainfall;
		
	}
	
	
	public static double averageRainfallPerDayFromRainAnalysis(int totalRainfall, int daysInYear) {
		double average;
		average = (double) totalRainfall / daysInYear;
		return average;
	}
	
	public static void displayTotalRainDaysInEachMonthRainAnalysis(int[][] monthlyRainfall) {
		System.out.println("Total rain days per month (mm)\n");
		for (int month = 0 ; month < monthlyRainfall.length ; month++) {
			int monthlyRainCounter = 0;
			for (int day = 0; day < monthlyRainfall[month].length; day++) {
				if (monthlyRainfall[month][day] != 0) {
					monthlyRainCounter++;
				}
			}
			System.out.println(monthFromInt(month) + "\t" + monthlyRainCounter);
			
		}
	}
	
	public static int monthWithMostRainByVolume(int [][] monthlyRainfall){
		int maxRainDays, maxMonth;
		maxRainDays = 0;
		maxMonth = 0;
		
		for (int month = 0 ; month < monthlyRainfall.length ; month++) {
			
			int sumOfRainInMonth = 0;
			
			for (int day = 0; day < monthlyRainfall[month].length ; day++) {
				sumOfRainInMonth += monthlyRainfall[month][day];
			}
			
			if (sumOfRainInMonth > maxRainDays) {
				maxRainDays = sumOfRainInMonth;
				maxMonth = month;
			}
		}
		
		return maxMonth;
	}
	
	
	/*
	 * method which accepts monthly rainfall statistics for a given year,
	 * then displays to console the rainfall stats for each day in each month
	 * on days where the value is 0, no data is displayed
	 * eg input [][] = {0,1,4,3}
	 * will output January 1 3 4
	 */
	public static void displayRainfallSortedAscending(int [][] monthlyRainfall) {
		System.out.println("Rain visual - mm of rain on wet days sorted (asc)");
		for( int month = 0 ; month < monthlyRainfall.length ; month++) {
			Arrays.sort(monthlyRainfall[month]);
//			System.out.println(Arrays.toString(monthlyRainfall[month]));
			System.out.print(monthFromInt(month) + "\t");
			for (int day = 0; day < monthlyRainfall[month].length ; day++) {
				
				if (monthlyRainfall[month][day] != 0) {
					System.out.print(monthlyRainfall[month][day] + " ");
				}
				
			}
			
			System.out.println();
		}
		
		
	}

}
