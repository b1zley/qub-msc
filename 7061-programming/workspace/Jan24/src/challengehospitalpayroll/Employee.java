package challengehospitalpayroll;

public abstract class Employee {
	
	//variables
	
	private String firstName;
	private String lastName;
	private double baseRate;
	
	
	//getters and setters
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
	public double getBaseRate() {
		return baseRate;
	}
	public void setBaseRate(double baseRate) {
		this.baseRate = baseRate;
	}
	
	public abstract String getType();
	
	// methods
	
	public abstract void calculateWeeklySalary(int hoursWorked);
	
	public  void printAll() {
		
		System.out.print(" "+this.getFirstName() + "\t\t" + this.getLastName() + "\t\t" + this.getBaseRate() + "\t\t");
		
	}
	
	
	
	// constructor 
	
	public Employee(String firstName, String lastName, double baseRate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.baseRate = baseRate;
	}
	
	
	
}
