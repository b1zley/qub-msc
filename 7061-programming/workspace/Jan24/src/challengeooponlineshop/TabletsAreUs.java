/**
 * 
 */
package challengeooponlineshop;

import java.util.ArrayList;

public class TabletsAreUs {
	public static void main(String[] args) {
// simulating a few tablets
		Tablet t1 = new Tablet("Apple", "iPad", 338.94, false, 10.2,
				"10.2 inch Retina display A10 Fusion chip Up to 10 hours of battery life");
		Tablet t2 = new Tablet("Apple", "iPad Air", 449.00, false, 10.5,
				"10.5 inch 10.5-inch Retina display with ProMotion, True Tone and wide colour, Up to 20 hours of battery life ");
		Tablet t3 = new Tablet("Google", "Fire", 79.99, true, 8, "8 inch display 10 hours of battery life");
		Tablet t4 = new Tablet("Samsung", "Galazy Tab", 180.00, true, 10.1,
				"10.1 inch Entertainment for All: Designed with the whole family in mind, the Galaxy Tab A has what it takes to keep everyone happy. 5 hours battery. ");
		Tablet t5 = new Tablet("Vankyo", "MatrixPad", 69.99, true, 7,
				"7-inch display Full-Featured Android Tablet with Eye Care for Kids Up to 4 hours of battery life");
// adding to an arraylist

		ArrayList<Tablet> stockedTablets = new ArrayList<Tablet>();

		stockedTablets.add(t1);
		stockedTablets.add(t2);
		stockedTablets.add(t3);
		stockedTablets.add(t4);
		stockedTablets.add(t5);
// show all in stock
		for (Tablet tablet : stockedTablets) {
			tablet.allDetails();
			System.out.println();
		}
// exercising a few searches

// 1. all screen sizes > 10 inches in size
		System.out.println("Screen greater than 10 \n");
		int screenSizeTarget = 10;
		ArrayList<Tablet> tabletsScreenGreaterThan10 = searchByScreenSize(stockedTablets, screenSizeTarget);

		for (Tablet tablet : tabletsScreenGreaterThan10) {
			tablet.allDetails();
			System.out.println();
		}

// 2. all Apple products (over priced!)

		System.out.println("Apple as manufacturer\n");
		String manufacturerTarget = "Apple";

		ArrayList<Tablet> tabletsAppleManufacturer = searchByManufacturer(stockedTablets, manufacturerTarget);
		for (Tablet tablet : tabletsAppleManufacturer) {
			tablet.allDetails();
			System.out.println();
		}

// 3. all Android tablets

		System.out.println("Android tablets\n");

		boolean isAndroidTarget = true;

		ArrayList<Tablet> androidTablets = searchByIsAndroid(stockedTablets, isAndroidTarget);
		for (Tablet tablet : androidTablets) {
			tablet.allDetails();
			System.out.println();
		}

// 4. note search .. e.g. by key word search (note this is casesensitive)
		System.out.println("Tablets containing note\n");

		String noteKeyWordInputTarget = "Eye Care";
		ArrayList<Tablet> tabletsContainingKeyWordInNotes = searchByNoteKeyWord(stockedTablets, noteKeyWordInputTarget);
		for (Tablet tablet : tabletsContainingKeyWordInNotes) {
			tablet.allDetails();
			System.out.println();
		}

	}

// create all the searches as methods here (make them all static)
	public static ArrayList<Tablet> searchByScreenSize(ArrayList<Tablet> searchedList, double screenSizeTarget) {
		ArrayList<Tablet> targetTablets = new ArrayList<Tablet>();

		// do stuff
		for (int i = 0; i < searchedList.size(); i++) {
			if (searchedList.get(i).getSize() > screenSizeTarget) {
				targetTablets.add(searchedList.get(i));
			}
		}

		// stop doing stuff
		return targetTablets;

	}

	public static ArrayList<Tablet> searchByManufacturer(ArrayList<Tablet> searchedList, String manufacturer) {
		ArrayList<Tablet> targetTablets = new ArrayList<Tablet>();

		for (int i = 0; i < searchedList.size(); i++) {
			if (searchedList.get(i).getManufacturer().equals(manufacturer)) {
				targetTablets.add(searchedList.get(i));
			}
		}

		return targetTablets;
	}

	public static ArrayList<Tablet> searchByIsAndroid(ArrayList<Tablet> searchedList, boolean isAndroidTarget) {
		ArrayList<Tablet> targetTablets = new ArrayList<Tablet>();

		for (int i = 0; i < searchedList.size(); i++) {
			if (searchedList.get(i).isAndroid() == isAndroidTarget) {
				targetTablets.add(searchedList.get(i));
			}
		}

		return targetTablets;
	}

	public static ArrayList<Tablet> searchByNoteKeyWord(ArrayList<Tablet> searchedList, String keyWordTarget) {
		ArrayList<Tablet> targetTablets = new ArrayList<Tablet>();

		for (int i = 0; i < searchedList.size(); i++) {
			if (searchedList.get(i).getNotes().contains(keyWordTarget)) {
				targetTablets.add(searchedList.get(i));
			}
		}

		return targetTablets;
	}

}
