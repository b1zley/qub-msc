package challengehospitalpayroll;

public class Porter extends Employee {
	
	//variables
	
	private String site;
	
	private static String type = "Porter";
	//getters and setters
	
	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	
	//methods
	@Override
	public void calculateWeeklySalary(int hoursWorked) {
		// TODO Auto-generated method stub
		double weeklySalary =  this.getBaseRate() * hoursWorked;
		System.out.println(this.getFirstName() + "\t" + this.getLastName() + "\t" + weeklySalary);
		
	}

	
	@Override
	public void printAll() {
		// TODO Auto-generated method stub
		System.out.print("["+this.getType() + "\t\t]");
		super.printAll();
		System.out.println("Site: " + this.getSite());
	}
	
	@Override
	public String getType() {
		return type;
	}

	
	// constructor 
	public Porter(String firstName, String lastName, double baseRate, String site) {
		super(firstName, lastName, baseRate);
		this.site = site;
	}
	
	
	

}
