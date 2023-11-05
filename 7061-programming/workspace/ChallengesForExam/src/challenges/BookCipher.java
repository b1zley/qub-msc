/**
 * 
 */
package challenges;

/**
 * 
 */
public class BookCipher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String message[][] = 
			{ 
				
					{ "Buzz", "LightYear" ,"was"},
					{"once", "apon", "a"}, 
					{ "time","probably" ,"the "},
					{ "coolest", "character", "in", "Toy", "Story 2"},
					{ "but ", "Woody "},
					{ "was ", "always ", "Andy's " , "wow"},
					{ "toy.", "i"},
					{ "was", "never", "keen" },
					{ "because ", "I ", "don't "},
					{ "rate","Tom","Hanks.", "Woody ", "is","quite","dour"},
					{ "but"," Lightyear,", "could fly, sort of...", "Anyhow"},
					{ "the","movies","are", "classic"}
					
			};
		
		for (int row = 0 ; row < message.length ; row ++) {
			
			System.out.print(message[row][message[row].length-1].toUpperCase().charAt(message[row][message[row].length-1].length()-1));
		}
		
	}

}
