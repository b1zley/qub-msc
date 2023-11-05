/**
 * 
 */
package challenges;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 */
public class PubQuiz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaring the questions and answers
		String[] jokeQuestions = { "Largest planet ? ", "Worse song ever ? ", "Capital of Peru?",
				"Roman god of War ?" };
		String[] jokeAnswers = { "Jupiter", "Castles in the Sky", "Lima", "Mars" };

		//strings for accepting user input
		String userInputAnotherQuestion;
		String userAnswer;
		
		//int for holding a random number
		int randomNumber0To3;
		
		
		// scanner for accepting user input
		Scanner sc = new Scanner(System.in);

		// placeholder value for userInputAnotherQuestion
		userInputAnotherQuestion = "N";
		
	
		// random class for generating random numbers
		Random rd = new Random();

		System.out.println("General Knowledge quiz....");
		do {
			randomNumber0To3 = rd.nextInt(4);
			System.out.println(jokeQuestions[randomNumber0To3]);
			
			userAnswer = sc.nextLine();
			
			//compares userAnswer to value indexed at randomNumber in answer array
			//if equal, congratulates, otherwise, disparages
			if (userAnswer.toUpperCase().equals(jokeAnswers[randomNumber0To3].toUpperCase())) {
				System.out.println("You got eem");
			} else {
				System.out.println("You did not got eem");
			}
			
			
			
			// do while for controlling exit of program - loops if valid answer is not given
			do {
				System.out.println("Another question? (Y or N)");
				userInputAnotherQuestion = sc.nextLine().toUpperCase();
			} while(!userInputAnotherQuestion.toUpperCase().equals("Y") && !userInputAnotherQuestion.toUpperCase().equals("N"));
			
			
			
		} while (!userInputAnotherQuestion.equals("N") );
		
		System.out.println("Thanks for playing");
	}

}
