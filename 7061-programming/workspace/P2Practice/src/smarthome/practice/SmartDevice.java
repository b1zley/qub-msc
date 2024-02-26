/**
 * 
 */
package smarthome.practice;

/**
 * 
 */
public abstract class SmartDevice {

	// constants for business rules
	private static final int NAME_MINIMUM_LENGTH_BOUNDARY = 3;
	private static final int NAME_MAXIMUM_LENGTH_BOUNDARY = 20;

	private static final int MANUFACTURER_MINIMUM_LENGTH_BOUNDARY = 3;
	private static final int MANUFACTURER_MAXIMUM_LENGTH_BOUNDARY = 20;

	// instance vars
	private String name;
	private String manufacturer;
	private RoomType room;
	private PowerState powerState;

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) throws IllegalArgumentException {
		if (name.length() >= NAME_MINIMUM_LENGTH_BOUNDARY && name.length() <= NAME_MAXIMUM_LENGTH_BOUNDARY) {

			this.name = name;

		} else {
			throw new IllegalArgumentException("name length must be have length min value 3 and max value 20");
		}
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) throws IllegalArgumentException{
		
		if (manufacturer.length() >= MANUFACTURER_MINIMUM_LENGTH_BOUNDARY 
				&& manufacturer.length() <= MANUFACTURER_MAXIMUM_LENGTH_BOUNDARY) {

			this.manufacturer = manufacturer;
		} else {
			throw new IllegalArgumentException("manufacturer length must have length min value 3 and max value 20");
		}
	}

	public RoomType getRoom() {
		return room;
	}

	public void setRoom(RoomType room) {
		this.room = room;
	}

	public PowerState getPowerState() {
		return powerState;
	}

	public void setPowerState(PowerState powerState) {
		this.powerState = powerState;
	}

	// constructors
	/**
	 * 
	 */
	public SmartDevice() {
	}
	
	
	public SmartDevice(String name, String manufacturer, RoomType room, PowerState powerState) {
		setName(name);
		setManufacturer(manufacturer);
		setRoom(room);
		setPowerState(powerState);
	}
	
	// methods
	public void displayAll() {
		System.out.println("NAME\t\t: " + this.getName());
		System.out.println("MANUFACTURER\t: " + this.getManufacturer());
		System.out.println("ROOM\t\t: " + this.getRoom());
		System.out.println("POWERSTATE\t: " + this.getPowerState());
	}
	
	public abstract String status();
	
	

}
