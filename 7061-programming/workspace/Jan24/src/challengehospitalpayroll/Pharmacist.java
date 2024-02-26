package challengehospitalpayroll;

public class Pharmacist extends Employee {
	
	private static String type = "Pharmacist";
	
	//variables
	
	private int grade;
	private double bonus;
	
	//getters and setters
	
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	// methods
	
	@Override
	public void calculateWeeklySalary(int hoursWorked) {
		// TODO Auto-generated method stub
		double weeklySalary =  this.getBaseRate() * hoursWorked + this.bonus;
		System.out.println(this.getFirstName() + "\t" + this.getLastName() + "\t" + weeklySalary);
	}

	

	@Override
	public void printAll() {
		// TODO Auto-generated method stub
		System.out.print("["+this.getType() + "\t]");
		super.printAll();
		System.out.println("Grade: " + this.getGrade() + " Bonus: " + this.getBonus());
	}
	
	@Override
	public String getType() {
		return type;
	}
	
	//constructor
	public Pharmacist(String firstName, String lastName, double baseRate, int grade, double bonus) {
		super(firstName, lastName, baseRate);
		this.grade = grade;
		this.bonus = bonus;
	}
	
	
	
	

}
