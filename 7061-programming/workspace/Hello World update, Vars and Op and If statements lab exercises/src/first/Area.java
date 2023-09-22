/**
 * 
 */
package first;

/**
 * 
 */
public class Area {

	/**
	 * @param args
	 */

	public static int areaOfSquare(int lengthOfSide) {
		int areaOfSquare = lengthOfSide * lengthOfSide;
		return areaOfSquare;
	}
	
	public static double areaOfCircle(double radius) {
		double pi = Math.PI;
		double areaOfCircle = pi * radius * radius;
		return areaOfCircle;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lengthOfSide = 6;
		System.out.println(areaOfSquare(lengthOfSide));
		
		double radiusOfCircle = 9;
		
		System.out.println(areaOfCircle(radiusOfCircle));
	}

}