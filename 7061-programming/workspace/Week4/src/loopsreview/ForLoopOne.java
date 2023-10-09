/**
 * 
 */
package loopsreview;

import java.util.Scanner;

/**
 * reviewing for loops - 1 - 100
 * 
 * 
 */
public class ForLoopOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// print out as is atm
		// 1 - 100 break at 73
		// dont print out any 10s
		// interact with user at program start

		Scanner scanner = new Scanner(System.in);

		int breakPoint;

		// default value
		breakPoint = -1;

		System.out.println("Please input a break point for this loop!");

		breakPoint = scanner.nextInt();

		for (int i = 1; i <= breakPoint; i++) {

			if (i == 73) {
				break;
			} else if (i % 10 == 0) {
				continue;
			} else {
				System.out.println(i);
			}

		}

		System.out.println("Exitting loop.");

		scanner.close();
	}

}
