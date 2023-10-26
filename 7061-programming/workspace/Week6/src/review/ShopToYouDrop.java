/**
 * 
 */
package review;

/**
 * 
 */
public class ShopToYouDrop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] customersData = { { 39, 45, 56, 78, 101, 45, 34, 34 }, { 31, 55, 56, 83, 121, 65, 31, 5 },

				{ 11, 45, 26, 23 }, { 34, 5, 50, 45, 67, 123, 121, 122, 89, 76 }, { 21, 25, 80, 25, 57, 73, 71, 62 },

				{ 1, 23, 56, 78, 56, 34, 78, 5 }, { 10, 43, 69, 98, 126, 134, 178, 75, 89, 90 } };

		displayCustomerData(customersData);

		System.out.println("Total customers : " + sumCustomers(customersData));
		System.out.println("Highest customer numbers per hour : " + highestCustomersPerHour(customersData));
		System.out.println();
		displayTotalShoppingHours(customersData);
		System.out.println();
		displayAverageCustomerNumberPerHourPerDay(customersData);
	}

	public static void displayCustomerData(int[][] customerData) {
		System.out.println("Shopping stats");
		for (int day = 0; day < customerData.length; day++) {
			System.out.print("Day " + (day + 1));

			for (int hour = 0; hour < customerData[day].length; hour++) {
				System.out.print(" " + customerData[day][hour]);
			}

			System.out.println();
		}
	}

	public static int sumCustomers(int[][] customerData) {
		int sumOfCustomers;
		sumOfCustomers = 0;

		for (int day = 0; day < customerData.length; day++) {
			for (int hour = 0; hour < customerData[day].length; hour++) {
				sumOfCustomers += customerData[day][hour];
			}
		}

		return sumOfCustomers;
	}

	public static int highestCustomersPerHour(int[][] customerData) {
		int highest = -1;

		for (int day = 0; day < customerData.length; day++) {
			for (int hour = 0; hour < customerData[day].length; hour++) {
				if (highest < customerData[day][hour]) {
					highest = customerData[day][hour];
				}
			}
		}

		return highest;
	}

	public static void displayTotalShoppingHours(int[][] customerData) {
		System.out.println("Day\tHours total");
		for (int day = 0; day < customerData.length; day++) {

			System.out.println("Day " + (day + 1) + "\t" + customerData[day].length);

		}

	}

	public static void displayAverageCustomerNumberPerHourPerDay(int[][] customerData) {

		System.out.println("Day\tAverage Hours");
		for (int day = 0; day < customerData.length; day++) {
			int sum = 0;
			double average = 0;

			for (int hour = 0; hour < customerData[day].length; hour++) {
				sum += customerData[day][hour];

			}

			average = (double) sum / customerData[day].length;
			System.out.printf("Day %d\t", day + 1);
			System.out.printf("%.2f\n", average);

		}

	}

}
