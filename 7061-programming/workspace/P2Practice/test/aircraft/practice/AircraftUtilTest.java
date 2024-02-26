package aircraft.practice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AircraftUtilTest {

	//declare test planes
	PassengerPlane pp1;
	PassengerPlane pp2;
	PassengerPlane pp3;
	PassengerPlane pp4;
	PassengerPlane pp5;
	
	// declare arrayList
	ArrayList<Aircraft> testAircrafts;
	
	
	
	@BeforeEach
	void setUp() throws Exception {
		
		
		// initialize test planes
		pp1 = new PassengerPlane("egtype1", 25, PowerType.FIXED, CountryCode.FR);
		pp2 = new PassengerPlane("egtype2", 30, PowerType.PROP, CountryCode.UK);
		pp3 = new PassengerPlane("egtype3", 35, PowerType.PROP, CountryCode.US);
		pp4 = new PassengerPlane("egtype4", 40, PowerType.ROTOR, CountryCode.UK);
		pp5 = new PassengerPlane("egtype5", 45, PowerType.FIXED, CountryCode.US);
		
		// add test planes to arraylist for testing
		testAircrafts = new ArrayList<Aircraft>(List.of(pp1, pp2, pp3, pp4, pp5));
		
		
		
		
		
	}
	
	
	
	@Test
	void testSearchAircraftByTypePresentInArrayList() {
		
		
		String typeSearchKey = "test";
		
		//declare and initialize test passenger plane which should be found
		PassengerPlane testPlanePresent = new PassengerPlane(typeSearchKey, 30, PowerType.FIXED, CountryCode.FR);
		
		//add this passenger plane to the test arrayList
		testAircrafts.add(testPlanePresent);
		
		// capture return arraylist from search method
		ArrayList<Aircraft> aircraftsMatchingSearchKey = 
				AircraftUtil.searchAircraftByType(typeSearchKey, testAircrafts);
		
		
		
		
		// generate an expected arraylist for comparison
		ArrayList<Aircraft> expectedReturnFromSearch = new ArrayList<Aircraft>(List.of(testPlanePresent));
		
		
		// carry out comparison on these array lists
		
		// equal arrayslists
		assertEquals(expectedReturnFromSearch, aircraftsMatchingSearchKey);
		
		// equal lengths
		assertEquals(expectedReturnFromSearch.size(), aircraftsMatchingSearchKey.size());
		
		// could also assert that object found at given indices are equal
		// but the arraylist class already has a .equals method that assertEquals calls
		// this should suffice
		
		
	}
	
	// also carry out negative testing
	
	@Test
	void testSearchAircraftByTypeNotPresent() {
		String typeSearchKey = "test";
		
		ArrayList<Aircraft> aircraftsMatchingSearchKey = 
				AircraftUtil.searchAircraftByType(typeSearchKey, testAircrafts);
		
		// initialize an empty array list for comparison
		ArrayList<Aircraft> expectedReturnFromSearch = new ArrayList<Aircraft>();
		
		// compare aircraftsMatchingSearchKey to this empty array
		
		assertEquals(aircraftsMatchingSearchKey, expectedReturnFromSearch);
		
		assertEquals(aircraftsMatchingSearchKey.size(), expectedReturnFromSearch.size());
		
		
		
		
		
	}

	
}
