/**
 * 
 */
package operatorsAndSelectionStatementsLab;

import java.util.Scanner;

/**
 * write a program which - prompts user for msc student final mark (0 - 100)
 * assigns number to suitable variable provides classification 0-49 fail 50-59
 * pass 60-69 merit 70-100 distinction
 * 
 * if out of range - include suitable error message
 */
public class Page2IfElseMastersGrading {

	/**
	 * scanner.nextLine() + integer.valueOf();
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String userInput, classification;
		int mark, passBoundary, meritBoundary, distinctionBoundary, maxMark, minMark;

		passBoundary = 50;
		meritBoundary = 60;
		distinctionBoundary = 70;
		
		maxMark = 100;
		minMark = 0;
		

		Scanner scanner = new Scanner(System.in);

		
		while (true) {
			
			System.out.println("Enter mark ...");
			userInput = scanner.nextLine();
			try {
				mark = Integer.valueOf(userInput);
				if (mark > 100 || mark < 0 ) {
					System.out.println("Out of range - please input a value between 0 and 100");
					continue;
				} else {
					if (mark >= 70) {
						classification = "distinction";
					} else if(mark >=60) {
						classification = "merit";
					} else if (mark >=50) {
						classification = "pass";
					} else {
						classification = "fail";
					}
				}
				
				System.out.println("Classification : " + classification);
				break;

			} catch (Exception e) {
				System.out.println("Invalid data type - please input an integer between 0 and 100");
					
			}
		}

	}

}
