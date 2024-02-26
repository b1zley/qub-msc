/**
 * 
 */
package nasa;

import java.util.ArrayList;

/**
 * class for interacting with arraylists of solar objects
 */
public class NasaUtil {
	
	
	public static ArrayList<SolarObject> searchSystemOnName(String nameSearchKey, ArrayList<SolarObject> systemToSearch){
		
		
		ArrayList<SolarObject> solarObjectsMatchingSearchKey = new ArrayList<SolarObject>();
		
		for (SolarObject so : systemToSearch) {
			if (so.getName().equals(nameSearchKey)) {
				solarObjectsMatchingSearchKey.add(so);
			}
		}
		
		
		return solarObjectsMatchingSearchKey;
	}
	
	
	public static ArrayList<SolarObject> searchSystemOnOrbitalDistance(double orbitalDistanceSearchKey, ArrayList<SolarObject> systemToSearch){
		ArrayList<SolarObject> solarObjectsMatchingSearchKey = new ArrayList<SolarObject>();
		
		for (SolarObject so : systemToSearch) {
			
			if (so.getOrbitalDistance() == orbitalDistanceSearchKey) {
				solarObjectsMatchingSearchKey.add(so);
			}
		}
		
		
		return solarObjectsMatchingSearchKey;
	}
	
	
	public static void displaySystem(ArrayList<SolarObject> systemToDisplay) {
		for (SolarObject so : systemToDisplay) {
			so.displayAll();
		}
	}
	
	
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		// declare and initialize earth
		Planet earth = new Planet("Earth", 12, 35, PlanetType.TERRESTRIAL);
		
		// declare and initialize earth's moon(s)
		Moon theMoon = new Moon("The Moon", 0.3, 12);
		Moon fakeMoon = new Moon("Fake Moon", 100, 25);
		
		// add theMoon to earths child moons
		earth.addMoon(theMoon);
		earth.addMoon(fakeMoon);
		
		//		earth.displayAll();
		
		// declare and initialize mars
		Planet mars = new Planet("Mars", 5, 16, PlanetType.TERRESTRIAL);
		
		//declare and initialize man made probe voyager-1
		ManMadeProbe vg1 = new ManMadeProbe("Voyager-1", 300, 0, "To seek out new civilizations", 1973);
		
		// create the solar system
		ArrayList<SolarObject> solarSystem = new ArrayList<SolarObject>();
		solarSystem.add(earth);
		solarSystem.add(mars);
		solarSystem.add(vg1);
		
		
//		displaySystem(searchSystemOnName("Earth", solarSystem));
//		System.out.println("------------------------------");
//		System.out.println();
//		System.out.println("------------------------------");
		
//		displaySystem(solarSystem);
		
		displaySystem(searchSystemOnOrbitalDistance(300, solarSystem));
		
		
	}

}
