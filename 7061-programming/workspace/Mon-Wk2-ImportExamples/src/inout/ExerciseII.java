/**
 * 
 */
package inout;

import java.util.Scanner;

/**
 * Exercise II - create java program which prompts user for full name - then ask
 * user how many characters constitutes a long name - then return output based
 * on how long user's name is
 */
public class ExerciseII {

	/**
	 * I like using scanner.nextLine() then converting to int
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your name");
		
		String userInput, userName;
		int userNumberCharactersLongName, userNameNumberCharacters;
		
		userInput = scanner.nextLine();
		userName = userInput;
		userNameNumberCharacters = userName.length();
		
		System.out.println("How many characters constitutes a long name?");
		
		userInput = scanner.nextLine();
		userNumberCharactersLongName = Integer.valueOf(userInput);
		
		
		if (userNameNumberCharacters >= userNumberCharactersLongName) {
			System.out.println("So you think you have a long name!");
		} else {
			System.out.println("You have a short name.");
		}
		
		

	}

}
