package exampleUpload;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class JoshuaOHagan40100099 {

	
	//this is an example file for upload testing
	
	
	public static void main(String args[]) {
		
		String myString = "X";
		
		System.out.println(myString);
		
		modifyString(myString);
		System.out.println(myString);
		
		
		System.out.printf("the %s jumped over the %s, %s, %.8f times, which was less than %.8f", "cow", "moon","other", 2.0003, 10.111111);
		System.out.println();
		int[] anArray = {0,1,2,3,4};
		System.out.println(Arrays.binarySearch(anArray, 3));
		
		Random random = new Random();
		
		Scanner sc = new Scanner(System.in);
		
		sc.close();
		
	}
	
	public static void modifyString(String passedString) {
		passedString = "Y";
	}
}
