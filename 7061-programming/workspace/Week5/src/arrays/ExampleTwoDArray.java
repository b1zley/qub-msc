/**
 * 
 */
package arrays;

/**
 * 
 */
public class ExampleTwoDArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] twoDArray = new int[3][4];
//
//		twoDArray[0][0] = 1;
//		twoDArray[0][1] = 2;
//		twoDArray[0][3] = 4;
//		
//		twoDArray[1][0] = 8;
//		twoDArray[1][3] = 16;
//		
//		twoDArray[2][0] = 32;
//		twoDArray[2][3] = 64;

		int[][] twoDArray = { { 1, 2, 0, 4 }, { 8, 0, 0, 16 }, { 32, 0, 0, 64 } };

		displayAll(twoDArray);
		
		
		System.out.println(sumAll(twoDArray));
		

	}
	
	public static void displayAll(int [][] twoDArray) {
		for (int row = 0; row < twoDArray.length; row++) {
			for (int column = 0; column < twoDArray[row].length; column++) {
				System.out.print(twoDArray[row][column] + "\t");
			}
			System.out.println();
		}
	}
	
	public static int sumAll(int [][]twoDArray) {
		int total =0;
		for (int row = 0; row < twoDArray.length; row++) {
			for (int column = 0; column < twoDArray[row].length; column++) {
				total += twoDArray[row][column];
			}
		}
		return total;
	}

}
