package sustain;

import java.util.Objects;

public class Player {
	String name;
	int balance;
	int currentArea;
	
	public Player() {
		
	}
	
	public Player(String name, int balance, int currentArea) {
		super();
		this.name = name;
		this.balance = balance;
		this.currentArea = currentArea;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getCurrentArea() {
		return currentArea;
	}

	public void setCurrentArea(int currentArea) {
		this.currentArea = currentArea;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", balance=" + balance + ", currentArea=" + currentArea + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return Objects.equals(name, other.name);
	}
	
	
	
	
	
	
	
	
	
}
