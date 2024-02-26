package smarthome.practice;

import java.util.ArrayList;

public class DeviceSearch {

	public static ArrayList<SmartDevice> searchByRoom(RoomType roomSearchKey, ArrayList<SmartDevice> devicesToSearch) {
		ArrayList<SmartDevice> devicesMatchingSearchKey = new ArrayList<>();

		for (SmartDevice sd : devicesToSearch) {
			if (sd.getRoom() == roomSearchKey) {
				devicesMatchingSearchKey.add(sd);
			}

		}

		return devicesMatchingSearchKey;
	}

	public static  ArrayList<SmartDevice> searchByTemp(double lowerBound, double upperBound,
			ArrayList<SmartDevice> devicesToSearch) {
		ArrayList<SmartDevice> devicesMatchingSearchKey = new ArrayList<>();

		for (SmartDevice sd : devicesToSearch) {
			if(sd.getClass() == SmartRadiator.class) {
				SmartRadiator radiator = (SmartRadiator) sd;
				double tempNow = radiator.getTempNow();
				if (tempNow <= upperBound && tempNow >= lowerBound) {
					devicesMatchingSearchKey.add(sd);
				}
			}
			
			

		}

		return devicesMatchingSearchKey;

	}

	public static void displayAllInArrayList(ArrayList<SmartDevice> devicesToDisplay) {

		for (SmartDevice sd : devicesToDisplay) {

			sd.displayAll(); 
			System.out.println();
		}

	}


}
