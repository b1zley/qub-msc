package challengegraduationprocessor;

public class Graduate {

	//variables
	
	private String studentNumber;
	private String firstName;
	private String lastName;
	
	private int resultProgram;
	private int resultCompFound;
	private int resultDBs;
	private int resultWeb;
	private int resultSoftwareE;
	
	private String classification = "Not Available";
	
	// getters and setters

	public String getStudentNumber() {
		return studentNumber;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

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

	public int getResultProgram() {
		return resultProgram;
	}

	public void setResultProgram(int resultProgram) {
		this.resultProgram = resultProgram;
	}

	public int getResultCompFound() {
		return resultCompFound;
	}

	public void setResultCompFound(int resultCompFound) {
		this.resultCompFound = resultCompFound;
	}

	public int getResultDBs() {
		return resultDBs;
	}

	public void setResultDBs(int resultDBs) {
		this.resultDBs = resultDBs;
	}

	public int getResultWeb() {
		return resultWeb;
	}

	public void setResultWeb(int resultWeb) {
		this.resultWeb = resultWeb;
	}

	public int getResultSoftwareE() {
		return resultSoftwareE;
	}

	public void setResultSoftwareE(int resultSoftwareE) {
		this.resultSoftwareE = resultSoftwareE;
	}
	
	
	// methods
	
	
	// generate average
	
	public int averageResult() {
		int average = 0;
		
		int sum = resultCompFound + resultDBs + (resultProgram * 2) + resultSoftwareE + resultWeb;
		
		average = sum / 6;
		
		return average;
	}
	
	// determine classification
	
	public void setClassification() {
		
		String classification;
		int averageResult = this.averageResult();
		
		if(averageResult >= 70 && averageResult <= 100) {
			classification = "Distinction";
		} else if (averageResult >= 60 && averageResult <= 69) {
			classification = "Commendation";
		} else if (averageResult >= 50 && averageResult <= 59) {
			classification = "Pass";
		} else if (averageResult >= 0 && averageResult <= 49) {
			classification = "Fail";
		} else {
			classification = "Error";
		}
		
		this.classification = classification;
	}
	
	// display all
	
	public void displayAll() {
		System.out.println("Student no. : " + this.studentNumber);
		System.out.println("First name : " + this.firstName);
		System.out.println("Last name : " + this.lastName);
		System.out.println("Module Results");
		System.out.println("Program : " + this.resultProgram);
		System.out.println("Comp Found : " + this.resultCompFound);
		System.out.println("DBs : " + this.resultDBs);
		System.out.println("Web : " + this.resultWeb);
		System.out.println("Software E : " + this.resultSoftwareE);
		System.out.println("Average : " + this.averageResult());
		System.out.println("Classification : " + this.classification);
	}
	
	// constructor
	public Graduate(String studentNumber, String firstName, String lastName, int resultProgram, int resultCompFound,
			int resultDBs, int resultWeb, int resultSoftwareE) {
		
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.resultProgram = resultProgram;
		this.resultCompFound = resultCompFound;
		this.resultDBs = resultDBs;
		this.resultWeb = resultWeb;
		this.resultSoftwareE = resultSoftwareE;
		setClassification();
	}
	
	
	
	
	
	
	
	
	
	
}
