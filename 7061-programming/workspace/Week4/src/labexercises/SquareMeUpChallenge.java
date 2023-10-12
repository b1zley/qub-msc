/**
 * 
 */
package labexercises;

import java.util.Scanner;

/**
 * 
 */
public class SquareMeUpChallenge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char borderChar = 'x';
		int lengthSize = 30;
		Scanner scanner = new Scanner(System.in);

		// get size of box from user

		System.out.println("Please input the size of the box!");
		lengthSize = scanner.nextInt();
		scanner.nextLine();

		// get char for border from user

		System.out.println("Please input the character for the border!");
		borderChar = scanner.nextLine().charAt(0);

		System.out.println("oh yeah baby, its boxing time");
		// drawing top
		if (lengthSize == 1) {
			drawHorizontal(lengthSize, borderChar);
		} else {
			drawHorizontal(lengthSize, borderChar);
			// draw sides of box
			drawSides(lengthSize, borderChar);
			// draw bottom
			drawHorizontal(lengthSize, borderChar);
		}

	}

	public static void drawHorizontal(int lengthSize, char borderChar) {

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= lengthSize; i++) {
			if (i == lengthSize) {
				sb.append(borderChar);
			} else {
				sb.append(borderChar + "  ");
			}
		}

		System.out.println(sb.toString());

	}

	public static void drawSides(int lengthSize, char borderChar) {
		StringBuilder sb = new StringBuilder();
		// have to use a variable for the total length of each line
		// looping works strangely if not
		int adjustedLength;
		adjustedLength = lengthSize * 3 - 2;

		// loop for each increment through vertical
		for (int outer = 1; outer <= (lengthSize - 2); outer++) {
			// below - loop for each increment through horizontal line
			for (int i = 1; i <= adjustedLength; i++) {
				if (i == 1 || i == adjustedLength) {
					sb.append(borderChar);
				} else {
					sb.append(' ');
				}
			}
			System.out.println(sb.toString());
			sb.setLength(0);
		}

	}

	

}
