/**
 * 
 */
package morningSession;

/**
 * 
 */
public class GCSEGrader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mark, aMark, bMark, cMark, dMark, max, min;
		char grade;

		mark = 62;

		aMark = 90;
		bMark = 80;
		cMark = 70;
		dMark = 60;

		grade = 'x';

		max = 100;
		min = 0;

		if (mark > max) {
			mark = max;
		} else if (mark < min) {
			mark = min;
		}

		if (mark >= aMark) {
			grade = 'A';
		} else if (mark >= bMark) {
			grade = 'B';
		} else if (mark >= cMark) {
			grade = 'C';
		} else if (grade >= dMark) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.println(mark + " Grade " + grade);

	}

}
