package smarthome.practice;

import java.util.ArrayList;

public class SmartDeviceTestUtil {

	public SmartDeviceTestUtil() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		SmartRadiator sr1 = new SmartRadiator();
		
		sr1.setManufacturer("testmanufacturer");
		sr1.setName("testName");
		sr1.setPowerState(PowerState.OFF);
		sr1.setRoom(RoomType.BEDROOM);
		sr1.setTempTarget(25.12312321312);
		sr1.setTempNow(20.123123213);
		
		
		System.out.println(sr1.status());
		
		
		SmartRadiator sr2 = new SmartRadiator("testName2", "testManu", RoomType.KITCHEN, PowerState.ON, 25.666, -9.666);
		
		System.out.println(sr2.status());

		SmartTV sTV1 = new SmartTV("stvname", "stvManu", RoomType.LOUNGE, PowerState.ON);
		
		
		ArrayList<SmartDevice> sDArray = new ArrayList<SmartDevice>();
		sDArray.add(sr1);
		sDArray.add(sr2);
		sDArray.add(sTV1);
		
		DeviceSearch.displayAllInArrayList(sDArray);
		
		ArrayList<SmartDevice> tempNow20To21 = DeviceSearch.searchByTemp(20, 21, sDArray);
		System.out.println("devices with temp 20 to 21");
		DeviceSearch.displayAllInArrayList(tempNow20To21);
		
		
		
		
		
		
		
		
		
	}

}
