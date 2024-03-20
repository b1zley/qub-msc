package sustain;

import java.util.Random;

public class Dice {

	private int numberOfSides;
	
	
	
	public int getNumberOfSides() {
		return numberOfSides;
	}



	public void setNumberOfSides(int numberOfSides) {
		this.numberOfSides = numberOfSides;
	}



	protected int roll() {
		
		Random rd = new Random();
		
		int random = rd.nextInt(numberOfSides);
		
		return random+1;
		
		
		
	}
	
	
	
	public Dice(int numberOfSides) {
		super();
		this.numberOfSides = numberOfSides;
	}



	
	
	
}
