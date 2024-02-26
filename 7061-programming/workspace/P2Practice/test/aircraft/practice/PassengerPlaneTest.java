package aircraft.practice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PassengerPlaneTest {

	// tests to implement
	
	// setGetType
	// setGetWingspan
	// setGetPower
	
	// ping
	
	// default constructor
	// constructor with args
	
	// test data
	
	// type
	String validLowTestType, validMidTestType, validHighTestType;
	String invalidLowTestType, invalidHighTestType;
	
	
	// wingspan
	int validLowWingspan, validMidWingspan, validHighWingspan;
	int invalidLowWingspan, invalidHighWingspan, invalidNegativeWingspan;
	
	// power
	PowerType validPowerTypeFixed, validPowerTypeProp, validPowerTypeRotor;
	
	// countryCode
	CountryCode validCountryCodeUK, validCountryCodeFR, validCountryCodeUS;
	
	
	// PassengerPlane object
	PassengerPlane testPassengerPlane;
	
	// arraylists for test data
	
	// type
	ArrayList<String> validTestTypeArrayList;
	ArrayList<String> invalidTestTypeArrayList;
	
	// wingspan
	ArrayList<Integer> validWingspanArrayList;
	ArrayList<Integer> invalidWingspanArrayList;
	
	// power
	ArrayList<PowerType> validPowerTypeArrayList;
	
	// countrycode
	ArrayList<CountryCode> validCountryCodeArrayList;
	
	
	
	@BeforeEach
	void setUp() throws Exception {
		
		// initialize test data
		// valid type data
		validLowTestType = "ABC";
		validMidTestType = "ABCDEFGH";
		validHighTestType = "ABCDEFGHIJKLMNO";
		
		// invalid type data
		invalidLowTestType = "AB";
		invalidHighTestType = "ABCDEFGHIJKLMNOP";
		
		// valid wingspan data
		validLowWingspan = 25;
		validMidWingspan = (25 + 50) /2;
		validHighWingspan = 50;
		
		// invalid wingspan data
		invalidLowWingspan = 24;
		invalidHighWingspan = 51;
		invalidNegativeWingspan = -1;
		
		// valid PowerType
		validPowerTypeFixed = PowerType.FIXED;
		validPowerTypeProp = PowerType.PROP;
		validPowerTypeRotor = PowerType.ROTOR;
		
		// valid CountryCode
		validCountryCodeFR = CountryCode.FR;
		validCountryCodeUK = CountryCode.UK;
		validCountryCodeUS = CountryCode.US;
		
		// PassengerPlane object with default constructor
		testPassengerPlane = new PassengerPlane();
		
		
		//initialize arrayLists
		
		// type
		validTestTypeArrayList = new ArrayList<String>((List.of(validLowTestType, validMidTestType, validHighTestType)));
		invalidTestTypeArrayList = new ArrayList<String>(List.of(invalidLowTestType, invalidHighTestType));
		
		//wingspan
		validWingspanArrayList = new ArrayList<Integer>(List.of(validLowWingspan, validMidWingspan, validHighWingspan));
		invalidWingspanArrayList = new ArrayList<Integer>(List.of(invalidLowWingspan, invalidHighWingspan, invalidNegativeWingspan));
		
		//powertype	
		validPowerTypeArrayList = new ArrayList<PowerType>(List.of(validPowerTypeFixed, validPowerTypeProp, validPowerTypeRotor));
	
		//country code
		validCountryCodeArrayList = new ArrayList<CountryCode>(List.of(validCountryCodeFR, validCountryCodeUK, validCountryCodeUS));
		
	}
	
	
	@Test
	void testSetGetTypeValid() {
		String [] validTypeTest = {
				validLowTestType, validMidTestType, validHighTestType
		};
		
		for (int typeController = 0 ; typeController < validTypeTest.length ; typeController++) {
			String type = validTypeTest[typeController];
			testPassengerPlane.setType(type);
			assertEquals(type, testPassengerPlane.getType());
			
		}
		
		
	}
	
	@Test
	void testSetGetTypeInvalid() {
		String [] invalidTypeTest = {
				invalidLowTestType, invalidHighTestType
		};
		
		for (int typeController = 0 ; typeController  < invalidTypeTest.length; typeController++) {
			String type = invalidTypeTest[typeController];
			
			IllegalArgumentException e = assertThrows(IllegalArgumentException.class, ()-> {
				testPassengerPlane.setType(type);
			});
			
			assertEquals("Type length must be 3 - 15 characters", e.getMessage());
		}
		
	}
	
	
	@Test
	void testSetGetWingspanValid() {
		
		int [] validWingspanTest = {
			validLowWingspan, validMidWingspan, validHighWingspan	
		};
		
		for (int wingspanController = 0 ; wingspanController < validWingspanTest.length; wingspanController++) {
			int wingspan = validWingspanTest[wingspanController];
			testPassengerPlane.setWingspan(wingspan);
			assertEquals(wingspan, testPassengerPlane.getWingspan());
		}
			
	}
	
	@Test
	void testSetGetWingspanInvalid() {
		int [] invalidWingspanTest = {
			invalidLowWingspan, invalidHighWingspan, invalidNegativeWingspan	
		};
		
		for (int wingspanController = 0 ; wingspanController < invalidWingspanTest.length; wingspanController++) {
			int wingspan = invalidWingspanTest[wingspanController];
			IllegalArgumentException e = assertThrows(IllegalArgumentException.class, ()->{
				testPassengerPlane.setWingspan(wingspan);
			});
			
			assertEquals("wingspan must be between 25 and 50 inclusive", e.getMessage());
		}
		
	}
	
	
	@Test
	void testSetGetPowerValid() {
		PowerType [] validPowerTypeTest = {
			validPowerTypeFixed, validPowerTypeProp, validPowerTypeRotor	
		};
		
		for (int powerTypeController = 0 ; powerTypeController < validPowerTypeTest.length; powerTypeController++ ) {
			PowerType powerType = validPowerTypeTest[powerTypeController];
			testPassengerPlane.setPower(powerType);
			assertEquals(powerType, testPassengerPlane.getPower());
		}
		
	}
	
	@Test
	void testSetGetCountryCodeValid() {
		CountryCode []  validCountryCodeTest = {
				validCountryCodeUK, validCountryCodeFR, validCountryCodeUS
		};
		
		for ( int countryCodeController = 0 ; countryCodeController < validCountryCodeTest.length;  countryCodeController++) {
			CountryCode countryCode = validCountryCodeTest[countryCodeController];
			testPassengerPlane.setCountryCode(countryCode);
			assertEquals(countryCode, testPassengerPlane.getCountryCode());
			
		}
	}
	
	// to do
	@Test
	void testPing() {
		for (int inputWingspan : validWingspanArrayList) {
			for(CountryCode inputCountryCode : validCountryCodeArrayList) {
				for (PowerType inputPower : validPowerTypeArrayList) {
					for (String inputTypeName : validTestTypeArrayList) {
						
						
						String classCode = "PP"; // always PP for this class
						
						
						// declare and initialize passenger plane object to call ping method on 
						PassengerPlane testPP = new PassengerPlane(inputTypeName, inputWingspan, inputPower, inputCountryCode);
						String actualPingReturnValue = testPP.ping();
						
						// evaluates to "PP-CC1CC2-POWER-NAME"
						String expectedPingReturnValue = 
								classCode + "-" + (int) inputCountryCode.toString().charAt(0) + (int) inputCountryCode.toString().charAt(1)
								+ "-" + inputPower.toString() + "-" + inputWingspan + "-" + inputTypeName;
						
						
						assertEquals(expectedPingReturnValue, actualPingReturnValue);
						
						System.out.println("EXPECTED");
						System.out.println(expectedPingReturnValue);
						
						System.out.println("ACTUAL");
						System.out.println(actualPingReturnValue);
						if( actualPingReturnValue.equals(expectedPingReturnValue)) {
							
							System.out.println("test passed");
						} else {
							System.out.println("test failed");
						}
						
					}
				}
			}
		}
	}
	
	
	
	
	
	void testDefaultConstructor() {
		PassengerPlane testPP = new PassengerPlane();
		assertNotNull(testPP);
	}
	
	@Test
	void testConstructorArgsStringIntPowerTypeCountryCodeValid() {
		
		// initialize arrays for each of the parameters to be tested
		String [] validTypeTest = {
				validLowTestType, validMidTestType, validHighTestType
		};
		
		int [] validWingspanTest = {
				validLowWingspan, validMidWingspan, validHighWingspan	
			};
		
		PowerType [] validPowerTypeTest = {
				validPowerTypeFixed, validPowerTypeProp, validPowerTypeRotor	
			};
		CountryCode []  validCountryCodeTest = {
				validCountryCodeUK, validCountryCodeFR, validCountryCodeUS
		};
		
		
		for (int typeControl = 0 ; typeControl < validTypeTest.length ; typeControl++) {
			String type = validTypeTest[typeControl];
			
			for (int wingspanControl = 0 ; wingspanControl < validWingspanTest.length ; wingspanControl++) {
				int wingspan = validWingspanTest[wingspanControl];
				
				for (int powerControl = 0 ; powerControl < validPowerTypeTest.length ; powerControl++) {
					PowerType power = validPowerTypeTest[powerControl];
					
					for (int countryControl = 0 ; countryControl < validCountryCodeTest.length ; countryControl++) {
						CountryCode countryCode = validCountryCodeTest[countryControl];
						
						
						try {
							
							PassengerPlane loopedTestPP = new PassengerPlane(type, wingspan, power, countryCode);
							assertNotNull(loopedTestPP);
							
							assertEquals(type, loopedTestPP.getType());
							assertEquals(wingspan, loopedTestPP.getWingspan());
							assertEquals(power, loopedTestPP.getPower());
							assertEquals(countryCode, loopedTestPP.getCountryCode());
							
							
							
						} catch(Exception e) {
							fail();
						}
						
						
						
						
						
						
					}
					
				}
				
				
			}
			
			
		}
		
		
	}
	@Test
	void testConstructorArgsStringIntPowerTypeCountryCodeInvalidWingspanRestValid() {
		int counter = 1;
		for (String type : validTestTypeArrayList) {
			
			// wingspan only invalid values
			for (int wingspan : invalidWingspanArrayList) {
				
				for ( PowerType powerType : validPowerTypeArrayList) {
					
					for (CountryCode countryCode : validCountryCodeArrayList) {
						
						System.out.println("TEST:" + counter);
						System.out.println(type);
						System.out.println(wingspan);
						System.out.println(powerType);
						System.out.println(countryCode);
						IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> {
							PassengerPlane testLoopedPP = new PassengerPlane(type, wingspan, powerType, countryCode);
						});
						
						assertEquals("wingspan must be between 25 and 50 inclusive", e.getMessage());
						
						if(e.getMessage().equals("wingspan must be between 25 and 50 inclusive")) {
							System.out.println("test passed");
						} else {
							System.out.println("test failed");
						}
						
						System.out.println();
						
						
						counter++;
					}
				}
			}
		}
	}
	



	

}
