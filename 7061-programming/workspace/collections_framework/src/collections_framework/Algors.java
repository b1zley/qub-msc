/**
 * 
 */
package collections_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 */
public class Algors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		
		
		List<String> suitList = Arrays.asList(suits);
		
		System.out.println(suitList.toString());
		
		System.out.println(Collections.max(suitList));
		
		
	}

}
