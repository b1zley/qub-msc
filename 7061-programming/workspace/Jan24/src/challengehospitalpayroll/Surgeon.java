package challengehospitalpayroll;

public class Surgeon extends Employee {
	
	//variables
	
	private String specialistArea;
	private double consultationFee;
	
	private static String type = "Surgeon";
	
	//getters and setters
	
	public String getSpecialistArea() {
		return specialistArea;
	}

	public void setSpecialistArea(String specialistArea) {
		this.specialistArea = specialistArea;
	}

	public double getConsultationFee() {
		return consultationFee;
	}

	public void setConsultationFee(double consultationFee) {
		this.consultationFee = consultationFee;
	}

	
	//methods
	
	@Override
	public void calculateWeeklySalary(int hoursWorked) {
		// TODO Auto-generated method stub
		double weeklySalary =  this.getBaseRate() * hoursWorked + this.consultationFee;
		System.out.println(this.getFirstName() + "\t" + this.getLastName() + "\t" + weeklySalary);
	}

	@Override
	public void printAll() {
		// TODO Auto-generated method stub
		System.out.print("["+this.getType() + "\t]");
		super.printAll();
		System.out.println("Specialist Area: " + this.getSpecialistArea() + " Consultation Fee: " + this.getConsultationFee() );
		
	}
	
	@Override
	public String getType() {
		return type;
	}
	
	//constructor
	public Surgeon(String firstName, String lastName, double baseRate, String specialistArea, double consultationFee) {
		super(firstName, lastName, baseRate);
		this.specialistArea = specialistArea;
		this.consultationFee = consultationFee;
	}
	
	

}
