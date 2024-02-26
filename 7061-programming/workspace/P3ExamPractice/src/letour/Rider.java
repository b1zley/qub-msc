package letour;

import java.time.LocalTime;

public class Rider {
	
	// instance vars
	private String firstName;
	private String lastName;
	private String nationality;
	private String team;
	
	private LocalTime result;

	
	// getters and setters
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public LocalTime getResult() {
		return result;
	}

	public void setResult(LocalTime result) {
		this.result = result;
	}

	
	
	// constructors
	
	public Rider(String firstName, String lastName, String nationality, String team, LocalTime result) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationality = nationality;
		this.team = team;
		this.result = result;
	}
	
	public Rider() {
		
	}

	// methods

	@Override
	public String toString() {
		return "Rider [firstName=" + firstName + ", lastName=" + lastName + ", nationality=" + nationality + ", team="
				+ team + ", result=" + result + "]";
	}
	
	
	
	
	
	
	

}
