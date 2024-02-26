package nasa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlanetTest {

	// declare planet for testing
	Planet testPlanet;

	// test getsetname - min = 1 max = 99

	// valid test set

	String lowValidTestName, midValidTestName, highValidTestName;

	// invalid test set

	String lowInvalidTestName, highInvalidTestName;

	// test getsetorbitaldistance - min = 0

	// valid test set
	double lowValidTestOrbitalDistance, midValidTestOrbitalDistance, highValidTestOrbitalDistance;

	// invalid test set

	double lowInvalidTestOrbitalDistance, negativeInvalidTestOrbitalDistance;

	// get solar object type

	String expectedSolarObjectName;

	// declare test PlanetTypes
	PlanetType validTestTerrestrial, validTestGasGiant, validTestIce;

	// declare test angles

	double lowValidTestAngle, midValidTestAngle, highValidTestAngle;

	@BeforeEach
	void setUp() throws Exception {

		// initialize valid test name data
		lowValidTestName = "A";
		midValidTestName = "ABCDE";
		highValidTestName = "ABCDEFGHAS" + "ABCDEFGHAS" + "ABCDEFGHAS" + "ABCDEFGHAS" + "ABCDEFGHAS" + "ABCDEFGHAS"
				+ "ABCDEFGHAS" + "ABCDEFGHAS" + "ABCDEFGHAS" + "ABCDEFGHA";

		// initialize invalid test name data
		lowInvalidTestName = "";
		highInvalidTestName = "ABCDEFGHAS" + "ABCDEFGHAS" + "ABCDEFGHAS" + "ABCDEFGHAS" + "ABCDEFGHAS" + "ABCDEFGHAS"
				+ "ABCDEFGHAS" + "ABCDEFGHAS" + "ABCDEFGHAS" + "ABCDEFGHAS";

		// initialize valid test orbital distance data
		lowValidTestOrbitalDistance = 1;
		midValidTestOrbitalDistance = Double.MAX_VALUE / 2;
		highValidTestOrbitalDistance = Double.MAX_VALUE;

		// initialize invalid test orbital distance data
		lowInvalidTestOrbitalDistance = 0;
		negativeInvalidTestOrbitalDistance = -1;

		// expected SOLAR_OBJECT_NAME from getSOLAR_OBJECT_NAME on class Planet
		expectedSolarObjectName = "Planet";

		// initialize valid planet types
		validTestTerrestrial = PlanetType.TERRESTRIAL;
		validTestGasGiant = PlanetType.GAS_GIANT;
		validTestIce = PlanetType.ICE;

		// initialize valid test angles
		lowValidTestAngle = 0;
		midValidTestAngle = Double.MAX_VALUE / 2;
		highValidTestAngle = Double.MAX_VALUE;

		// initialize planet with default constructor
		testPlanet = new Planet();
	}

	@Test
	void testSetGetNameValidValues() {
		String[] validTestSet = { lowValidTestName, midValidTestName, highValidTestName };

		for (String testName : validTestSet) {
			testPlanet.setName(testName);
			assertEquals(testName, testPlanet.getName());
		}

	}

	@Test
	void testSetGetNameInvalidValues() {
		String[] invalidTestSet = { lowInvalidTestName, highInvalidTestName };
		for (String testName : invalidTestSet) {
			assertThrows(IllegalArgumentException.class, () -> {
				testPlanet.setName(testName);
			});
		}
	}

	@Test
	void testSetGetOrbitalDistanceValidValues() {
		double[] validTestSet = { lowValidTestOrbitalDistance, midValidTestOrbitalDistance,
				highValidTestOrbitalDistance };

		for (double testOrbitalDistance : validTestSet) {
			testPlanet.setOrbitalDistance(testOrbitalDistance);
			assertEquals(testOrbitalDistance, testPlanet.getOrbitalDistance());

		}
	}

	@Test
	void testSetGetOrbitalDistanceInvalidValues() {
		double[] invalidTestSet = { lowInvalidTestOrbitalDistance, negativeInvalidTestOrbitalDistance };

		for (double testOrbitalDistance : invalidTestSet) {
			assertThrows(IllegalArgumentException.class, () -> {
				testPlanet.setOrbitalDistance(testOrbitalDistance);
			});
		}
	}

	@Test
	void testGetSOLAR_OBJECT_NAME() {
		String actual = testPlanet.getSOLAR_OBJECT_NAME();
		expectedSolarObjectName = "Planet";

		assertEquals(expectedSolarObjectName, actual);

	}

	// constructor testing
	@Test
	void testDefaultConstructor() {

		Planet defaultPlanet = new Planet();
		assertNotNull(defaultPlanet);

	}

	@Test
	void testConstructorWithArgsValidValuesStringDoubleDoublePlanetTypeAllValid() {

		// declare and initialize valid arrays of test data

		String[] validTestNames = { lowValidTestName, midValidTestName, highValidTestName };

		double[] validTestOrbitalDistances = { lowValidTestOrbitalDistance, midValidTestOrbitalDistance,
				highValidTestOrbitalDistance };

		double[] validTestAngles = { lowValidTestAngle, midValidTestAngle, highValidTestAngle };

		PlanetType[] validPlanetTypes = { validTestGasGiant, validTestIce, validTestTerrestrial };

		// nested loop to test all permutations of test data with constructor
		for (int nameController = 0; nameController < validTestNames.length; nameController++) {
			String name = validTestNames[nameController];

			for (int orbitalDistanceController = 0; orbitalDistanceController < validTestOrbitalDistances.length; orbitalDistanceController++) {
				double orbitalDistance = validTestOrbitalDistances[orbitalDistanceController];

				for (int angleController = 0; angleController < validTestAngles.length; angleController++) {
					double angle = validTestAngles[angleController];

					for (int planetTypeController = 0; planetTypeController < validPlanetTypes.length; planetTypeController++) {
						PlanetType planetType = validPlanetTypes[planetTypeController];

						// declare and initialize loopedTestPlanet
						Planet loopedTestPlanet = new Planet(name, orbitalDistance, angle, planetType);

						// console output
						loopedTestPlanet.displayAll();

						// assert loopedTestPlanet has been initialized
						assertNotNull(loopedTestPlanet);

						// assertion statements to compare planet variables to constructor input
						// variables
						assertEquals(name, loopedTestPlanet.getName());
						assertEquals(orbitalDistance, loopedTestPlanet.getOrbitalDistance());
						assertEquals(angle, loopedTestPlanet.getAngle());
						assertEquals(planetType, loopedTestPlanet.getPlanetType());

						// teardown loopedTestPlanet to prevent impact on further testing
						loopedTestPlanet = null;

					}

				}

			}

		}

	}

	@Test
	void testConstructorWithArgsValidValuesStringDoubleDoublePlanetTypeNameInvalidRestValid() {

		String[] invalidTestNames = { lowInvalidTestName, highInvalidTestName };

		double[] validTestOrbitalDistances = { lowValidTestOrbitalDistance, midValidTestOrbitalDistance,
				highValidTestOrbitalDistance };

		double[] validTestAngles = { lowValidTestAngle, midValidTestAngle, highValidTestAngle };

		PlanetType[] validPlanetTypes = { validTestGasGiant, validTestIce, validTestTerrestrial };
		
		

		for (int nameController = 0; nameController < invalidTestNames.length; nameController++) {
			String name = invalidTestNames[nameController];

			for (int orbitalDistanceController = 0; orbitalDistanceController < validTestOrbitalDistances.length; orbitalDistanceController++) {
				double orbitalDistance = validTestOrbitalDistances[orbitalDistanceController];

				for (int angleController = 0; angleController < validTestAngles.length; angleController++) {
					double angle = validTestAngles[angleController];

					for (int planetTypeController = 0; planetTypeController < validPlanetTypes.length; planetTypeController++) {
						PlanetType planetType = validPlanetTypes[planetTypeController];
						
						// test an exception is thrown in each case
						assertThrows(IllegalArgumentException.class, () -> {
							
							Planet loopedTestPlanet = new Planet(name, orbitalDistance, angle, planetType);
							
							

						});
						
						// test constructor call leads to failed assignment
						Planet evaluatesNullPlanet = null;
						
						// and test error message is correct
						String expectedErrorMessage = "Name length must be between 0 and 100 characters";
						String actualErrorMessage = null;
						
						try {
							evaluatesNullPlanet = new Planet(name, orbitalDistance, angle, planetType);
						} catch(Exception e) {
							actualErrorMessage = e.getMessage();
							
						}
						
						assertNull(evaluatesNullPlanet);
						
						assertEquals(expectedErrorMessage, actualErrorMessage);
						

					}

				}

			}

		}

	}

	@Test
	void testAddGetMoonsValid() {
//		fail("not yet implemented");
	}

}
