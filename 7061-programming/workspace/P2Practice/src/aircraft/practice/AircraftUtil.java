package aircraft.practice;

import java.util.ArrayList;

public class AircraftUtil {
	
	
	public static ArrayList<Aircraft> searchAircraftByWingspan(int wingspanSearchKey, ArrayList<Aircraft> aircraftToSearch){
		ArrayList<Aircraft> aircraftMatchingSearchKey = new ArrayList<Aircraft>();
		
		for (Aircraft aircraft : aircraftToSearch) {
			
			if (aircraft.getWingspan() == wingspanSearchKey) {
				
				aircraftMatchingSearchKey.add(aircraft);
			}
			
		}
		
		
		return aircraftMatchingSearchKey;
		
		
		
	}
	
	public static ArrayList<Aircraft> searchAircraftByType(String typeSearchKey, ArrayList<Aircraft> aircraftToSearch){
		ArrayList<Aircraft> aircraftMatchingSearchKey = new ArrayList<Aircraft>();
		
		for (Aircraft aircraft : aircraftToSearch) {
			
			if (aircraft.getType().equals(typeSearchKey)) {
				aircraftMatchingSearchKey.add(aircraft);
				
				
			}
			
		}
		
		
		
		return aircraftMatchingSearchKey;
	}
	
	
	public static void displayAircraft(ArrayList<Aircraft> aircraftToDisplay){
		
		for (Aircraft aircraft : aircraftToDisplay) {
			aircraft.showAll();
			System.out.println();
		}
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassengerPlane pp1 = new PassengerPlane();
		
		pp1.setCountryCode(CountryCode.FR);
		pp1.setPower(PowerType.FIXED);
		pp1.setType("Boeing 777");
		pp1.setWingspan(40);
		
//		pp1.showAll();
		
//		System.out.println(pp1.ping());
		
		PassengerPlane pp2 = new PassengerPlane();
		
		pp2.setCountryCode(CountryCode.UK);
		pp2.setPower(PowerType.PROP);
		pp2.setType("BlackBird 7");
		pp2.setWingspan(35);
		
//		System.out.println(pp2.ping());
		
		
		Military mp1 = new Military();
		
		mp1.setPower(PowerType.FIXED);
		mp1.setType("BIG MILITARY");
		mp1.setWingspan(42);
		
		
//		mp1.showAll();
		
		
		ArrayList<Aircraft> testAircraftList = new ArrayList<Aircraft>();
		testAircraftList.add(mp1);
		testAircraftList.add(pp1);
		testAircraftList.add(pp2);		
		
		
		displayAircraft(testAircraftList);
		
		
		ArrayList<Aircraft> aircraftWithWingspan40 = searchAircraftByWingspan(40,testAircraftList);
		
		System.out.println("Aircraft 40 wingspan");
		displayAircraft(aircraftWithWingspan40);
		
		System.out.println("bb7");
		ArrayList<Aircraft> aircraftWithTypeBB7 = searchAircraftByType("BlackBird 7", testAircraftList);
		displayAircraft(aircraftWithTypeBB7);
	}

}
