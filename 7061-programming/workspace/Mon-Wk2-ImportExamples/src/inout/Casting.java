/**
 * 
 */
package inout;

/**
 * Adjustment to lecture notes - inclusion of casting
 */
public class Casting {

	/**
	 * 
	 * casting int to double
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2;
		double answer;
		
		num1 =  6;
		num2 = 4;
		
		answer =  num1/ num2;
		
		System.out.println(answer); // is 1.0
		
		answer = num1 / (double) num2;
		System.out.println(answer); 
		// by casting one of the values to a double
		// the division yields a more accurate result-allows non-integer values 
		

	}

}
