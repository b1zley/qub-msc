package insurance.practice;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.util.Calendar;

public class Motor extends Policy {

	// instance vars
	MotorType motorType;

	String motorPolicyID;

	// getters and setters
	public MotorType getMotorType() {
		return motorType;
	}

	public void setMotorType(MotorType motorType) {
		this.motorType = motorType;
	}

	public String getMotorPolicyID() {
		return motorPolicyID;
	}

	public void generateMotorPolicyID() throws Exception {

		try {
			// declare motorPolicyID string

			String motorPolicyID;

			// code for generating sanitizedSurname
			String sanitizedSurname;
			sanitizedSurname = this.getSurname().substring(0, 3);

			// code for accessing timestamp
			// time stamp number
			int year = Calendar.getInstance().get(Calendar.YEAR);
			int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
			// sum of the year and month
			int timeStamp = year + month;

			// code for accessing parity
			int sanitizedParity;

			if (timeStamp % 2 == 0) {
				sanitizedParity = 0;
			} else {
				sanitizedParity = 1;
			}

			motorPolicyID = sanitizedSurname + timeStamp + sanitizedParity;
			this.motorPolicyID = motorPolicyID;

		} catch (Exception e) {
			throw new Exception("DEPENDENT VALUES NOT YET SET");
		}

	}

	// constructors

	public Motor(String surname, int age, MotorType motorType) throws Exception {
		super(surname, age);
		setMotorType(motorType);

		try {
			generateMotorPolicyID();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}

	}

	public Motor() {
		// TODO Auto-generated constructor stub
	}

	// methods
	@Override
	public void displayAll() {
		System.out.println("Surname\t\t:" + this.getSurname());
		System.out.println("Age\t\t:" + this.getAge());
		System.out.println("Policy Ref\t:" + this.getMotorPolicyID());
		System.out.println("Motor Type\t:" + this.getMotorType());

	}

}
