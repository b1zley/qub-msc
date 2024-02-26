package insurance.practice;

import java.util.ArrayList;
import java.util.List;

public class MotorTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Motor testMotor = new Motor();
		testMotor.setAge(20);
		testMotor.setMotorType(MotorType.CAR);
		testMotor.setSurname("TESTSURNAME");
		try {
			testMotor.generateMotorPolicyID();

		} catch (Exception e) {

		}

		System.out.println(testMotor.getMotorPolicyID());

		testMotor.displayAll();
		try {

			Motor testMotor2 = new Motor("twoSurname", 25, MotorType.BUS);
			testMotor2.displayAll();

			ArrayList<Policy> testMotors = new ArrayList<Policy>();

			testMotors.add(testMotor);
			testMotors.add(testMotor2);

			System.out.println("display all method");
			PolicySearch.displayAllInPolicyArrayList(testMotors);

			System.out.println("find policies with age between 18 and 23");

			ArrayList<Policy> policiesWithAge18to23 = PolicySearch.searchByAge(18, 23, testMotors);

			PolicySearch.displayAllInPolicyArrayList(policiesWithAge18to23);

			ArrayList<Motor> motorsArrayList = new ArrayList<Motor>(List.of(testMotor, testMotor2));

			System.out.println("find policies with motor type = BUS");
			ArrayList<Motor> policiesMatchingMotorType = PolicySearch.searchForAllByMotorPolicyType(MotorType.BUS,
					motorsArrayList);

			PolicySearch.displayAllInMotorArrayList(policiesMatchingMotorType);
		} catch (Exception e) {
			
		}
		

	}

}
