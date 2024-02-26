package nasa;

import java.util.ArrayList;

public class Planet extends SolarObject{
	
	// static constant user-friendly name
	private static final String SOLAR_OBJECT_NAME = "Planet";
	
	
	// instance vars
	
	// planet types selected by PlanetType enum
	
	PlanetType planetType;
	
	// array for storing child moons
	
	ArrayList<Moon> childMoons;
	
	
	// getters and setters

	public PlanetType getPlanetType() {
		return planetType;
	}

	public void setPlanetType(PlanetType planetType) {
		this.planetType = planetType;
	}

	public ArrayList<Moon> getChildMoons() {
		return childMoons;
	}

	public void setChildMoons(ArrayList<Moon> childMoons) {
		this.childMoons = childMoons;
	}

	
	
	@Override
	public String getSOLAR_OBJECT_NAME() {
		// TODO Auto-generated method stub
		return SOLAR_OBJECT_NAME;
	}
	
	
	//constructors
	public Planet() {
		super();
	}
	
	public Planet(String name, double orbitalDistance, double angle, PlanetType planetType) {
		super(name, orbitalDistance, angle);
		childMoons = new ArrayList<Moon>();
		setPlanetType(planetType);
		
	}
	
	
	// methods
	public void addMoon(Moon moonToAdd) {
		childMoons.add(moonToAdd);
	}
	
	public void removeMoon(int indexToRemove) {
		childMoons.remove(indexToRemove);
	}

	
	@Override
	public void displayAll() {
		super.displayAll();
		System.out.println("Planet Type:\t\t" + this.getPlanetType());
		System.out.println("Child Moons:");
		
		for (int i = 0 ; i < childMoons.size() ; i++) {
			System.out.println("Child Moon " + i);
			Moon moon = childMoons.get(i);
			moon.displayAll();
			
		}
		
	}
	
	
	

	

	
	
	
	
	
	
	
	

}
