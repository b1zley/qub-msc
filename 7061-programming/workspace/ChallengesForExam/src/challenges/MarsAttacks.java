/**
 * 
 */
package challenges;

import java.util.Arrays;

/**
 * 
 */
public class MarsAttacks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// The message

		String[] message = { "FBI Report on UFOs", "We believe UFOs do visit our planet.",

				"Many cows have been abducted in Roswell New Mexico USA", "Several reports of Aliens have been made",

				"We think they come from Mars", "The FBI are concerned about public panic", "Strictly confidential",

				"For your eyes only Mr President", "God help us all and God bless America", "End of message..." };

		// the words that will be redacted

		String[] wordsToRedact = { "FBI", "UFO", "UFOs", "Roswell", "Cow", "Cows", "Abducted", "Mars", "Alien",

				"Aliens", "President", "America" };

		for (int messageCounter = 0; messageCounter < message.length; messageCounter++) {

			String[] words = message[messageCounter].split(" ");

			for (int wordCounter = 0; wordCounter < words.length; wordCounter++) {
				
				boolean wordShouldBeRedacted = false;
				
				for (String redactionWord : wordsToRedact) {

					if (words[wordCounter].toUpperCase().equals(redactionWord.toUpperCase())) {
						wordShouldBeRedacted = true;
						break;
					}
				}
				
				if(wordShouldBeRedacted) {
					for (int i = 0; i < words[wordCounter].length(); i++)
					System.out.print("\u25A0");
				}else {
					System.out.print(words[wordCounter]);
				}
				System.out.print(" ");
				
				

			}
			
			System.out.println();
			

		}

	}

}
