package smarthome.practice;

public class SmartRadiator extends SmartDevice {

	// constants for business rules
	private static final double TEMPNOW_MINIMUM_VALUE = -10;
	private static final double TEMPNOW_MAXIMUM_VALUE = 30;

	private static final double TEMPTARGET_MINMIMUM_VALUE = 5;
	private static final double TEMPTARGET_MAXMIMUM_VALUE = 26;

	// user friendly device name
	private static final String DEVICE_CLASS_ABREVIATION = "SR";

	// instance vars

	private double tempNow;
	private double tempTarget;

	// getters and setters

	public double getTempNow() {
		return tempNow;
	}

	public void setTempNow(double tempNow) throws IllegalArgumentException {
		if (tempNow >= TEMPNOW_MINIMUM_VALUE && tempNow <= TEMPNOW_MAXIMUM_VALUE) {

			this.tempNow = tempNow;
			// logic to control powerState
			if (tempNow < this.getTempTarget()) {
				// if tempNow below tempTarget - setPowerState to on
				this.setPowerState(PowerState.ON);

			} else {
				// if matching temperature or below target temperature, turn off
				this.setPowerState(PowerState.OFF);
			}

		} else {
			throw new IllegalArgumentException("temp now must have min value -10 and max value 30");
		}

	}
	
	/**
	 * 
	 * @return
	 */
	public double getTempTarget() {
		return tempTarget;
	}
	
	/**
	 * sets the value of instance variable {@link #tempTarget} provided the value of parameter 
	 * tempTarget is between or equal to the values, otherwise throws an exception
	 * {@link #TEMPTARGET_MAXMIMUM_VALUE} and {@link #TEMPTARGET_MAXMIMUM_VALUE}
	 * @param tempTarget
	 * @throws IllegalArgumentException
	 */
	public void setTempTarget(double tempTarget) throws IllegalArgumentException {
		if (tempTarget >= TEMPTARGET_MINMIMUM_VALUE && tempTarget <= TEMPTARGET_MAXMIMUM_VALUE) {

			this.tempTarget = tempTarget;

		} else {
			throw new IllegalArgumentException("temp target must have min value 5 and max value 26");
		}
	}

	// constructors
	// default
	public SmartRadiator() {
		// TODO Auto-generated constructor stub
	}

	// with args
	/**
	 * 
	 * @param name
	 * @param manufacturer
	 * @param room
	 * @param powerState
	 * @param tempTarget
	 * @param tempNow
	 */
	public SmartRadiator(String name, String manufacturer, RoomType room, PowerState powerState, double tempTarget,
			double tempNow) throws IllegalArgumentException{
		super(name, manufacturer, room, powerState);
		setTempTarget(tempTarget);
		setTempNow(tempNow);
	}

	// methods

	@Override
	public void displayAll() {
		// TODO Auto-generated method stub
		super.displayAll();
		System.out.print("TEMPNOW\t\t: ");
		System.out.printf("%.1f", this.getTempNow());
		System.out.println();

		System.out.printf("TEMPTARGET\t: %.1f", this.getTempTarget());

		System.out.println();
	}

	@Override
	public String status() {
		// string to return declaration
		String statusToReturn = "";

		// access device type
		String deviceType;
		deviceType = SmartRadiator.DEVICE_CLASS_ABREVIATION;

		// access device name
		String deviceName;
		deviceName = this.getName().toUpperCase();

		// access device room
		String deviceRoom;
		deviceRoom = this.getRoom().toString();

		// access tempNow
		String tempNow;
		tempNow = String.valueOf(

				(double) Math.round(this.getTempNow() * 10) / 10

		);

		// access tempTarget
		String tempTarget;

		tempTarget = String.valueOf(

				(double) Math.round(this.getTempTarget() * 10) / 10

		);
		// access powerState
		String powerState;
		powerState = this.getPowerState().toString();

		// concatenate Strings and hyphenate where appropropriate
		
		statusToReturn = 
				deviceType + "-" + deviceName + "-" + deviceRoom + "-" + "NOW:"
						+ tempNow + "-" + "TARGET:" + tempTarget + "-" + powerState;

		return statusToReturn;
	}

}
