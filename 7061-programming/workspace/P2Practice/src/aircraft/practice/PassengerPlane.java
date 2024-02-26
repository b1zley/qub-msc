package aircraft.practice;

import java.util.Objects;

public class PassengerPlane extends Aircraft {

	// instance vars
	private CountryCode countryCode;

	// getters and setters
	public CountryCode getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(CountryCode countryCode) {
		this.countryCode = countryCode;
	}

	// constructors

	public PassengerPlane(String type, int wingspan, PowerType power, CountryCode countryCode) {
		super(type, wingspan, power);
		setCountryCode(countryCode);
	}

	// default constructor
	public PassengerPlane() {

	}

	// methods

	@Override
	public void showAll() {
		// TODO Auto-generated method stub
		super.showAll();
		System.out.println("COUNTRY\t\t: " + this.getCountryCode());
	}

	@Override
	public String ping() {
		// TODO Auto-generated method stub
		String pingToReturn;

		String classCode;
		String convertedCountryCode;
		String powerType;
		String wingspan;
		String typeName;

		// class code is associated with the overridden method, acceptable to declare as
		// variable here
		classCode = "PP";

		// country code conversion occours through casting to int
		int convertedCountryCodePartOne = (int) this.getCountryCode().toString().charAt(0);
		int convertedCountryCodePartTwo = (int) this.getCountryCode().toString().charAt(1);

		convertedCountryCode = String.valueOf(convertedCountryCodePartOne)
				+ String.valueOf(convertedCountryCodePartTwo);

		// power type accessed from .get method
		powerType = this.getPower().toString();

		// wingspan accesed via .get method and converted to string

		wingspan = String.valueOf(this.getWingspan());

		// typename accessed through instance .get method
		typeName = this.getType();

		pingToReturn = classCode + "-" + convertedCountryCode + "-" + powerType + "-" + wingspan + "-" + typeName;

		return pingToReturn;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;

		}
		if (this.getClass() != obj.getClass() || obj == null) {

			return false;

		}

		PassengerPlane objPP = (PassengerPlane) obj;

		if (objPP.getCountryCode() == this.getCountryCode() 
				&& objPP.getPower() == this.getPower()
				&& objPP.getType().equals(this.getType()) 
				&& objPP.getWingspan() == this.getWingspan()) 
		{
			return true;

		} else {
			return false;
		}

	}

}
