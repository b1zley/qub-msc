package first;

public class StringsYourName {
	
	
	

	public static void main(String[] args) {
		
		String yourName = "Joshua O'Hagan";
		
		System.out.println(yourName);
		
		System.out.println("The number of characters in the string is: " 
				+ yourName.length());
		
		System.out.println("The first character in the string is: "+ yourName.charAt(0)
				+ " and the last character in the string is: " + yourName.charAt(yourName.length()-1));
		
		System.out.println("The string in uppercase: " + yourName.toUpperCase());
		
		System.out.println("The string with the letter a replaced with * is: " + 
				yourName.replace('a','*'));
		
		System.out.println("The character 'n' first occurs in position " + 
				yourName.indexOf('n'));
	}

}
