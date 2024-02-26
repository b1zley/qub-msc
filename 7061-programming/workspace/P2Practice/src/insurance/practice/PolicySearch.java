package insurance.practice;

import java.util.ArrayList;

public class PolicySearch {

	public static ArrayList<Policy> searchByAge(int ageLowerBound, int ageUpperBound,
			ArrayList<Policy> policiesToSearch) throws IllegalArgumentException {

		if (ageLowerBound >= ageUpperBound) {
			throw new IllegalArgumentException("age lower bound must be below age upper bound");
		}

		ArrayList<Policy> policiesMatchingSearchKey = new ArrayList<>();

		for (Policy policy : policiesToSearch) {
			int age = policy.getAge();
			if (age >= ageLowerBound && age <= ageUpperBound) {

				policiesMatchingSearchKey.add(policy);

			}

		}

		return policiesMatchingSearchKey;
	}

	public static ArrayList<Motor> searchForAllByMotorPolicyType(MotorType motorTypeSearchKey,
			ArrayList<Motor> motorPoliciesToSearch) {
		ArrayList<Motor> policiesMatchingSearchKey = new ArrayList<Motor>();

		for (Motor motor : motorPoliciesToSearch) {
			if (motor.getMotorType() == motorTypeSearchKey) {
				policiesMatchingSearchKey.add(motor);
			}

		}

		return policiesMatchingSearchKey;
	}

	public static void displayAllInPolicyArrayList(ArrayList<Policy> policiesToShow) {

		for (Policy policy : policiesToShow) {

			policy.displayAll();
			System.out.println();

		}
	}

	public static void displayAllInMotorArrayList(ArrayList<Motor> policiesToShow) {

		for (Policy policy : policiesToShow) {

			policy.displayAll();
			System.out.println();

		}
	}

}
