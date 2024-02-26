package leTour;

import java.time.LocalTime;

public class Rider {
	
	// vars
	
	private String firstName;
	private String lastName;
	private String teamName;
	private String nationality;
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
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public LocalTime getResult() {
		return result;
	}
	public void setResult(LocalTime result) {
		this.result = result;
	}
	
	
	// constructors
	public Rider(String firstName, String lastName, String teamName, String nationality, LocalTime result) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.teamName = teamName;
		this.nationality = nationality;
		this.result = result;
	}
	
	public Rider() {
		
	}
	
	
	// methods
	
	@Override
	public String toString() {
		return "Rider [firstName=" + firstName + ", lastName=" + lastName + ", teamName=" + teamName + ", nationality="
				+ nationality + ", result=" + result + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
