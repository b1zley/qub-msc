/**
 * 
 */
package challengehospitalpayroll;

/**
 * 
 */
public class PayrollManager {

	private static int HOURS_PER_WEEK = 35;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee[] employees = new Employee[6];

		Porter p1 = new Porter("Ivana", "Patient", 10.50, "Royal");

		// public Surgeon(String firstName, String lastName, double baseRate, String
		// specialistArea, double consultationFee) {

		Surgeon s1 = new Surgeon("name", "mcNammy", 33.50, "dick science", 200);

		// public Pharmacist(String firstName, String lastName, double baseRate, int
		// grade, double bonus) {

		Pharmacist ph1 = new Pharmacist("asd", "mcDrugs", 100, 1, 100);

		employees[0] = p1;
		employees[1] = s1;
		employees[2] = ph1;
		employees[3] = p1;
		employees[4] = s1;
		employees[5] = ph1;
		displayAllEmployees(employees);

		processWeeklyPayroll(employees);
	}

	public static void processWeeklyPayroll(Employee[] employees) {
		System.out.println("Payroll run..... ______________________________________");
		System.out.println("first\tlast\tstacks");
		for (Employee e : employees) {
			e.calculateWeeklySalary(HOURS_PER_WEEK);
			
		}
		System.out.println("Total employees in system : " + employees.length);
		System.out.println("_______________________________________________________");
	}

	public static void displayAllEmployees(Employee[] employees) {
		System.out.println("Display all employees _________________________________");
		System.out.println("[type\t\t] firstname\tlastname\trate\t\tother");

		for (Employee e : employees) {
			e.printAll();
		}
		
		System.out.println("Total employees in system : " + employees.length);
		
		System.out.println("_______________________________________________________");
	}

}
