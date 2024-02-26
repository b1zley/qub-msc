package nasa;

public abstract class SolarObject {
	
	// name length business rules
	private static final int MIN_NAME_LENGTH = 1;
	private static final int MAX_NAME_LENGTH = 99;
	
	
	// orbital distance business rules
	private static final double ORBITAL_DISTANCE_MIN_BOUNDARY = 0;
	
	
	
	//instance vars
	
	/**
	 * refers to the orbital distance from the celestial body which governs this objects movement, expressed in AU
	 */
	private double orbitalDistance;
	
	/**
	 * refers to the position of the solar object relative to true north of its parent, solar objects without defined parents are assumed to have the parent Sol
	 */
	private double angle;
	
	private String name;
	
	//getters and setters
	public double getOrbitalDistance() {
		return orbitalDistance;
	}
	
	public void setOrbitalDistance(double orbitalDistance) throws IllegalArgumentException {
		
		if(orbitalDistance > ORBITAL_DISTANCE_MIN_BOUNDARY) {
			this.orbitalDistance = orbitalDistance;
		} else {
			throw new IllegalArgumentException("impossible orbitalDistance, cannot have orbitalDistance that is <= 0");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) throws IllegalArgumentException{
		if(name.length() >= MIN_NAME_LENGTH && name.length() <= MAX_NAME_LENGTH) {
			this.name = name;
		} else {
			throw new IllegalArgumentException("Name length must be between 0 and 100 characters");
		}
	}
	public double getAngle() {
		return angle;
	}
	public void setAngle(double angle) {
		this.angle = angle;
	}
	
	
	// abstract method for accessing SOLAR_OBJECT_NAME
	
	public abstract String getSOLAR_OBJECT_NAME();
	
	
	// constructors
	
	
	/**
	 * default constructor 
	 */
	public SolarObject() {
		
	}
	
	/**
	 * constructor with args
	 */
	public SolarObject(String name, double orbitalDistance, double angle) {
		setName(name);
		setOrbitalDistance(orbitalDistance);
		setAngle(angle);
	}
	
	
	
	// methods
	@Override
	public String toString() {
		return "SolarObject [orbitalDistance=" + orbitalDistance + ", angle=" + angle + ", name=" + name + "]";
	}
	
	
	public void displayAll() {
		System.out.println("Solar Object Type:\t" + this.getSOLAR_OBJECT_NAME());
		System.out.println("Name:\t\t\t" + this.getName());
		System.out.println("Orbital Distance:\t" + this.getOrbitalDistance());
		System.out.println("Angle:\t\t\t" + this.getAngle());
	}
	
	
	
	
	

}
