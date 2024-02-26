package insurance.practice;

public abstract class Policy {
	
	// constants for business rules
	
	// age ranges
	private static final int AGE_MINIMUM_BOUNDARY = 18;
	private static final int AGE_MAXIMUM_BOUNDARY = 50;
	
	// name lengths
	private static final int SURNAME_MINIMUM_LENGTH_BOUNDARY = 3;
	private static final int SURNAME_MAXIMUM_LENGTH_BOUNDARY = 20;

	// instance vars
	private String surname;
	private int age;

	// getters and setters

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) throws IllegalArgumentException {
		if (surname.length() >= SURNAME_MINIMUM_LENGTH_BOUNDARY && surname.length() <= SURNAME_MAXIMUM_LENGTH_BOUNDARY) {

			this.surname = surname;

		} else {
			throw new IllegalArgumentException(
					"surname argument length must have minimum value 3 and maximum value 20");
		}

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws IllegalArgumentException {

		if (age >= AGE_MINIMUM_BOUNDARY && age <= AGE_MAXIMUM_BOUNDARY) {

			this.age = age;

		} else {
			throw new IllegalArgumentException("age must have min value 18 and max value 50");
		}
	}

	// constructors

	public Policy(String surname, int age) {
		setSurname(surname);
		setAge(age);
	}

	// default constructor

	public Policy() {

	}

	// methods
	public abstract void displayAll();

}
