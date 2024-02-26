package insurance.practice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestMotor {
	
	//test data
	
	// surnames
	String validLowSurname, validMidSurname, validHighSurname;
	String invalidLowSurname, invalidHighSurname;
	
	// ages
	int validLowAge, validMidAge, validHighAge;
	int invalidLowAge, invalidHighAge, invalidNegativeAge;
	
	// motor types
	MotorType validMotorTypeCar, validMotorTypeBus, validMotorTypeTaxi;
	
	// arraylists for test data
	
	ArrayList<String> validSurnames;
	ArrayList<String> invalidSurnames;
	
	ArrayList<Integer> validAges;
	ArrayList<Integer> invalidAges;
	
	ArrayList<MotorType> validMotorTypes;
	
	// declare Motor object
	Motor testMotor;

	@BeforeEach
	void setUp() throws Exception {
		//initialize test data
		
		// surname
		validLowSurname = "ABC";
		validMidSurname = "ABCDEFGH";
		validHighSurname = "ABCDEFGHIJKLMNOPQRST";
		
		invalidLowSurname = "AB";
		invalidHighSurname = "ABCDEFGHIJKLMNOPQRSTU";
		
		//age
		validLowAge = 18;
		validMidAge = (18 + 50) / 2;
		validHighAge = 50;
		
		invalidLowAge = 17;
		invalidHighAge = 51;
		invalidNegativeAge = -1;
		
		// motor type
		validMotorTypeCar = MotorType.CAR;
		validMotorTypeBus = MotorType.BUS;
		validMotorTypeTaxi = MotorType.TAXI;
		
		//arraylists as containers for test data
		validSurnames = new ArrayList<String>(List.of(validLowSurname, validMidSurname, validHighSurname));
		invalidSurnames = new ArrayList<String>(List.of(invalidLowSurname, invalidHighSurname));
		
		validAges = new ArrayList<Integer>(List.of(validLowAge, validMidAge, validHighAge));
		invalidAges = new ArrayList<Integer>(List.of(invalidLowAge, invalidHighAge, invalidNegativeAge));
		
		validMotorTypes = new ArrayList<MotorType>(List.of(validMotorTypeCar, validMotorTypeBus, validMotorTypeTaxi));
		
		// testMotor
		// initialize using default constructor so all instance vars default, can set as req
		testMotor = new Motor();
		
		
	}
	
	@Test
	void testMotor() {
		Motor defaultConstructorMotor = new Motor();
		assertNotNull(defaultConstructorMotor);
		
	}
	
	
	@Test
	void testSetSurnameValid() {
		
		for (String surname : validSurnames) {
			testMotor.setSurname(surname);
			assertEquals(surname, testMotor.getSurname());
		}
	}
	@Test
	void testSetSurnameInvalid() {
		for (String surname : invalidSurnames) {
			
			assertThrows(IllegalArgumentException.class, ()->{
				testMotor.setSurname(surname);
			});
			
		}
	}

	@Test
	void testSetAgeValid() {
		
		for (int age : validAges) {
			testMotor.setAge(age);
			assertEquals(age, testMotor.getAge());
		}
	}
	
	@Test
	void testSetAgeInvalid() {
		for (int age : invalidAges) {
			assertThrows(IllegalArgumentException.class, ()->{
				testMotor.setAge(age);
			});
		}
	}
	
	@Test
	void testSetMotorType() {
		for (MotorType motorType : validMotorTypes) {
			testMotor.setMotorType(motorType);
			assertEquals(motorType, testMotor.getMotorType());
		}
	}
	
	
	
	@Test
	void testGenerateMotorPolicyID() {
		// generateMotorPolicyID() can only be called on Motor object with all
		// other instance vars initialized, other wise throws Exception
		
		// therefore, must initialize a Motor object first using default constructor
		// then set all instance vars using setters methods
		
		// constructor with args would be faster but would create circular dependency
		// in testing
		
		// constructor args depends on genPolicy working 
		// and genPolicy depends on constructor args working
		
		// better to test sequentially like this
		
		for (String surname : validSurnames) {
			for (int age : validAges) {
				for (MotorType motorType : validMotorTypes) {
					// declare and initialize using default constructor in scope of assert
					Motor loopedTestMotor = new Motor();
					
					// call setters
					loopedTestMotor.setAge(age);
					loopedTestMotor.setMotorType(motorType);
					loopedTestMotor.setSurname(surname);
					
					// now can call generateMotorPolicyID()
					try {
						loopedTestMotor.generateMotorPolicyID();
						
						// capture motor policy id in variable
						String actualMotorPolicyID = loopedTestMotor.getMotorPolicyID();
						
						
						// now must write code for programatic comparison between arraylist valid variables and expected values
						// expected surname component
						String surnameSubString = surname.substring(0, 3);
						
						// expected timestamp component
						// time stamp number
						int year = Calendar.getInstance().get(Calendar.YEAR);
						int month = Calendar.getInstance().get(Calendar.MONTH) +1;
						// sum of the year and month
						int timeStamp = year+month;
						
						// expected parity
						int expectedParity;
						if (timeStamp % 2 == 0) {
							expectedParity = 0;
						} else {
							expectedParity = 1;
						}
						
						String expectedMotorPolicyID = surnameSubString + timeStamp + expectedParity;
						
						assertEquals(expectedMotorPolicyID, actualMotorPolicyID);

						
					} catch (Exception e) {
						// if generate motor policy id throws exception with valid instance vars
						// test should fail
						fail();
					}
					
					
					
				}
				
				
			}
			
		}
		
	}

	

	

	

	@Test
	void testMotorStringIntMotorType() {
		
		for (int age : validAges) {
			for (String surname : validSurnames) {
				for (MotorType motorType : validMotorTypes) {
					try {

						Motor testLoopedMotor = new Motor(surname, age, motorType);
						// programmatic assert statments for basic getters
						assertEquals(age, testLoopedMotor.getAge());
						assertEquals(surname, testLoopedMotor.getSurname());
						assertEquals(motorType, testLoopedMotor.getMotorType());
						
						
						// more complex assertion here for getting motor policy id
						// now must write code for programatic comparison between arraylist valid variables and expected values
						// expected surname component
						String surnameSubString = surname.substring(0, 3);
						
						// expected timestamp component
						// time stamp number
						int year = Calendar.getInstance().get(Calendar.YEAR);
						int month = Calendar.getInstance().get(Calendar.MONTH) +1;
						// sum of the year and month
						int timeStamp = year+month;
						
						// expected parity
						int expectedParity;
						if (timeStamp % 2 == 0) {
							expectedParity = 0;
						} else {
							expectedParity = 1;
						}
						
						String expectedMotorPolicyID = surnameSubString + timeStamp + expectedParity;
						
						
						// assert statement
						assertEquals(expectedMotorPolicyID, testLoopedMotor.getMotorPolicyID());
						
						
					} catch (Exception e) {
						fail();
					}
					
					
					
					
					
				}
				
				
			}
			
		}
		
	}
	
	
	@Test
	void testMotorStringIntMotorTypeInvalidSurname() { 
		for (String surname : invalidSurnames) {
			for (int age : validAges) {
				for (MotorType motorType : validMotorTypes) {
					
					IllegalArgumentException e = assertThrows(IllegalArgumentException.class, ()->{
						Motor failedTestMotor = new Motor(surname, age, motorType);
						
					});
					
					assertEquals("surname argument length must have minimum value 3 and maximum value 20", e.getMessage());
					
				}
			}
		}
	}
	
	
	@Test
	void testMotorStringIntMotorTypeInvalidAge() { 
		for (String surname : validSurnames) {
			for (int age : invalidAges) {
				for (MotorType motorType : validMotorTypes) {
					
					IllegalArgumentException e = assertThrows(IllegalArgumentException.class, ()->{
						Motor failedTestMotor = new Motor(surname, age, motorType);
						
					});
					
					assertEquals("age must have min value 18 and max value 50", e.getMessage());
					
				}
			}
		}
	}

	
	
	
	

	

	

}
