package aircraft.practice;

public abstract class Aircraft {
	
	
	
	// constants for business rules
	private static final int MINIMUM_TYPE_LENGTH = 3;
	private static final int MAXIMUM_TYPE_LENGTH = 15;
	
	private static final int MINIMUM_WINGSPAN_VALUE = 25;
	private static final int MAXIMUM_WINGSPAN_VALUE = 50;
	
	
	//instance vars
	
	//min length 3 max 15
	private String type;
	
	//min 25 max 50 inclusive
	private int wingspan;
	
	// selected by enum
	private PowerType power = PowerType.FIXED;
	
	
	// getters and setters

	public String getType() {
		return type;
	}

	public void setType(String type) throws IllegalArgumentException {
		
		if ( type.length() >= MINIMUM_TYPE_LENGTH && type.length() <= MAXIMUM_TYPE_LENGTH) {
			this.type = type;
		} else {
			throw new IllegalArgumentException("Type length must be 3 - 15 characters");
		}
		
	}

	public int getWingspan() {
		return wingspan;
	}

	public void setWingspan(int wingspan) throws IllegalArgumentException {
		if( wingspan >= MINIMUM_WINGSPAN_VALUE && wingspan <= MAXIMUM_WINGSPAN_VALUE) {
			this.wingspan = wingspan;
		} else {
			throw new IllegalArgumentException("wingspan must be between 25 and 50 inclusive");
		}
	}

	public PowerType getPower() {
		return power;
	}

	public void setPower(PowerType power) {
		this.power = power;
	}
	
	
	// constructors
	public Aircraft(String type, int wingspan, PowerType power) throws IllegalArgumentException {
		setType(type);
		setWingspan(wingspan);
		setPower(power);
	}
	
	public Aircraft() {
		
	};
	
	
	// methods
	
	public void showAll() {
		System.out.println("TYPE\t\t: "+this.getType());
		System.out.println("WINGSPAN\t: " + this.getWingspan());
		System.out.println("POWER\t\t: " + this.getPower());
	}
	
	
	public abstract String ping();

	
	
	
	
	
	
	
	
	
	
	
	
	

}
