/**
 * 
 */
package smarthome.practice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class SmartRadiatorTest {

	// test data

	// names
	String validLowName, validMidName, validHighName;
	String invalidLowName, invalidHighName;

	// manufacturers
	String validLowManuf, validMidManuf, validHighManuf;
	String invalidLowManuf, invalidHighManuf;

	// rooms
	RoomType validRoomHouse, validRoomKitchen, validRoomBedroom, validRoomBathroom, validRoomLounge;

	// power states
	PowerState validPowerStateOn, validPowerStateOff;

	// tempNow
	double validLowTempNow, validMidTempNow, validHighTempNow;
	double invalidLowTempNow, invalidHighTempNow;

	// tempTarget
	double validLowTempTarget, validMidTempTarget, validHighTempTarget;
	double invalidLowTempTarget, invalidHighTempTarget;

	// arraylists as containers for variables

	ArrayList<String> validNames;
	ArrayList<String> invalidNames;

	ArrayList<String> validManufs;
	ArrayList<String> invalidManufs;

	ArrayList<RoomType> validRoomTypes;

	ArrayList<PowerState> validPowerStates;

	ArrayList<Double> validTempNows;
	ArrayList<Double> invalidTempNows;

	ArrayList<Double> validTempTargets;
	ArrayList<Double> invalidTempTargets;

	// SmartRadiator device for testing
	SmartRadiator testSR;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {

		// initialize test data

		// names
		validLowName = "ABC";
		validMidName = "ABCDEABCDEAB";
		validHighName = "ABCDEABCDEABCDEABCDE";

		invalidLowName = "AB";
		invalidHighName = "ABCDEABCDEABCDEABCDEA";

		// manufs
		validLowManuf = "ABC";
		validMidManuf = "ABCDE";
		validHighManuf = "ABCDEABCDEABCDEABCDE";

		invalidLowManuf = "AB";
		invalidHighManuf = "ABCDEABCDEABCDEABCDEA";

		// room types
		validRoomHouse = RoomType.HOUSE;
		validRoomKitchen = RoomType.KITCHEN;
		validRoomBedroom = RoomType.BEDROOM;
		validRoomBathroom = RoomType.BATHROOM;
		validRoomLounge = RoomType.LOUNGE;

		// power states
		validPowerStateOn = PowerState.ON;
		validPowerStateOff = PowerState.OFF;

		// temp nows
		validLowTempNow = -10;
		validMidTempNow = (-10 + 30) / 2;
		validHighTempNow = 30;

		invalidLowTempNow = -11;
		invalidHighTempNow = 31;

		// temp targets
		validLowTempTarget = 5;
		validMidTempTarget = (5 + 26) / 2;
		validHighTempTarget = 26;

		invalidLowTempTarget = 4;
		invalidHighTempTarget = 27;

		// initialize array lists

		validNames = new ArrayList<String>(List.of(validLowName, validMidName, validHighName));
		invalidNames = new ArrayList<String>(List.of(invalidLowName, invalidHighName));

		validManufs = new ArrayList<String>(List.of(validLowManuf, validMidManuf, validHighManuf));
		invalidManufs = new ArrayList<String>(List.of(invalidLowManuf, invalidHighManuf));

		validRoomTypes = new ArrayList<RoomType>(
				List.of(validRoomHouse, validRoomKitchen, validRoomBedroom, validRoomBathroom, validRoomLounge));
		
		validPowerStates = new ArrayList<PowerState>(List.of(validPowerStateOn, validPowerStateOff));
		
		validTempNows = new ArrayList<Double>(List.of(validLowTempNow, validMidTempNow, validHighTempNow));
		invalidTempNows = new ArrayList<Double>(List.of(invalidLowTempNow, invalidHighTempNow));
		
		
		validTempTargets = new ArrayList<Double>(List.of(validLowTempTarget, validMidTempTarget));
		invalidTempTargets = new ArrayList<Double>(List.of(invalidLowTempTarget, invalidHighTempTarget));
	
		testSR = new SmartRadiator();
	}
	
	
	/**
	 * Test method for {@link smarthome.practice.SmartRadiator#SmartRadiator()}.
	 */
	@Test
	void testSmartRadiator() {
		testSR = new SmartRadiator();
		
		assertNotNull(testSR);
	}

	/**
	 * Test method for
	 * {@link smarthome.practice.SmartRadiator#setTempTarget(double)}.
	 */
	@Test
	void testSetTempTargetValid() {
		for (double tempTarget : validTempTargets) {
			testSR.setTempTarget(tempTarget);
			assertEquals(tempTarget, testSR.getTempTarget());
		}
		
	}
	
	/**
	 * Test method for
	 * {@link smarthome.practice.SmartRadiator#setTempTarget(double)}.
	 */
	@Test
	void testSetTempTargetInvalid() {
		for (double tempTarget : invalidTempTargets) {
			assertThrows(IllegalArgumentException.class, ()->{
				testSR.setTempTarget(tempTarget);
			});
		}
		
	}
	
	
	/**
	 * Test method for {@link smarthome.practice.SmartRadiator#setTempNow(double)}.
	 */
	@Test
	void testSetTempNowValid() {
		for (double tempTarget : validTempTargets) {
			for (double tempNow : validTempNows) {
				
				// reintitialize object so power state is not set
				testSR = new SmartRadiator();
				
				// set temp target, then temp now
				testSR.setTempTarget(tempTarget);
				testSR.setTempNow(tempNow);
				
				if (tempTarget > tempNow) {
					// expect powerState to be on
					assertEquals(testSR.getPowerState(), PowerState.ON);
				} else {
					// expect powerState to be off
					assertEquals(testSR.getPowerState(), PowerState.OFF);
				}
				
			}
			
		}
		
	}
	
	/**
	 * Test method for {@link smarthome.practice.SmartRadiator#setTempNow(double)}.
	 */
	@Test
	void testSetTempNowInvalid() {
		for (double tempTarget : validTempTargets) {
			for (double tempNow : invalidTempNows) {
				
				// reintitialize object so power state is not set
				testSR = new SmartRadiator();
				
				// set temp target, then temp now
				testSR.setTempTarget(tempTarget);
				
				assertThrows(IllegalArgumentException.class, ()->{

					testSR.setTempNow(tempNow);
				});
				
				
				
			}
			
		}
		
	}

	/**
	 * Test method for
	 * {@link smarthome.practice.SmartDevice#setName(java.lang.String)}.
	 */
	@Test
	void testSetNameValid() {
		for (String name : validNames) {
			testSR.setName(name);
			assertEquals(name, testSR.getName());
		}
		
		
	}
	/**
	 * Test method for
	 * {@link smarthome.practice.SmartDevice#setName(java.lang.String)}.
	 */
	@Test
	void testSetNameInvalid() {
		for (String name : invalidNames) {
			assertThrows(IllegalArgumentException.class, ()->{
				testSR.setName(name);
			});
		}
		
		
	}

	/**
	 * Test method for
	 * {@link smarthome.practice.SmartDevice#setManufacturer(java.lang.String)}.
	 */
	@Test
	void testSetManufacturerValid() {
		for (String manuf : validManufs) {
			testSR.setManufacturer(manuf);
			assertEquals(manuf, testSR.getManufacturer());
		}
	}
	
	/**
	 * Test method for
	 * {@link smarthome.practice.SmartDevice#setManufacturer(java.lang.String)}.
	 */
	@Test
	void testSetManufacturerInvalid() {
		for (String manuf : invalidManufs) {
			
			assertThrows(IllegalArgumentException.class, ()->{

				testSR.setManufacturer(manuf);
			});
			
		}
	}

	/**
	 * Test method for
	 * {@link smarthome.practice.SmartDevice#setRoom(smarthome.practice.RoomType)}.
	 */
	@Test
	void testSetRoom() {
		
		for (RoomType room : validRoomTypes) {
			testSR.setRoom(room);
			assertEquals(room, testSR.getRoom());
			
		}
	}

	/**
	 * Test method for
	 * {@link smarthome.practice.SmartDevice#setPowerState(smarthome.practice.PowerState)}.
	 */
	@Test
	void testSetPowerState() {
		for (PowerState ps : validPowerStates) {
			testSR.setPowerState(ps);
			assertEquals(ps, testSR.getPowerState());
		}
	}
	
	
	
	/**
	 * Test method for
	 * {@link smarthome.practice.SmartRadiator#SmartRadiator(java.lang.String, java.lang.String, smarthome.practice.RoomType, smarthome.practice.PowerState, double, double)}.
	 */
	@Test
	void testSmartRadiatorStringStringRoomTypePowerStateDoubleDouble() {
		
		for (String manuf : validManufs) {
			for (String name : validNames) {
				for (Double tempTarget : validTempTargets) {
					for (Double tempNow : validTempNows) {
						for (RoomType room: validRoomTypes) {
							for (PowerState powerState : validPowerStates) {
								// code here
								try {
									testSR = new SmartRadiator(name, manuf, room, powerState, tempTarget, tempNow);
								} catch (Exception e) {
									// initialization with constructor with valid args fails, test should fail
									fail();
								}
								
								
								
								
								
								
								
								
								
								
							}
							
							
							
						}
						
						
					}
					
					
				}
				
			}
			
			
		}
	}
	
	
	
	/**
	 * Test method for {@link smarthome.practice.SmartRadiator#status()}.
	 */
	@Test
	void testStatus() {
		// expected status data should be hardcoded as string literal rather than attacked programmatically
		
		String expectedStatus = "SR-RADIATORSTAT-BEDROOM-NOW:18.7-TARGET:21.5-ON";
		
		// initialize smart radiator which matches expected status parameters
		testSR = new SmartRadiator();
		testSR.setName("radiatorstat");
		testSR.setRoom(RoomType.BEDROOM);
		testSR.setTempTarget(21.5);
		testSR.setTempNow(18.7);
		
		String actualStatus = testSR.status();
		
		System.out.println(expectedStatus);
		System.out.println(actualStatus);
		
		assertEquals(expectedStatus, actualStatus);
		
	}

}
