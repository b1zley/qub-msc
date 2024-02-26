package nasa;

public class ManMadeProbe extends SolarObject {
	
	private static final String SOLAR_OBJECT_NAME = "Man Made Probe";
	
	
	//instance vars
	
	private String missionStatement;
	private int yearOfLaunch;
	
	// getters and setters
	public String getMissionStatement() {
		return missionStatement;
	}
	public void setMissionStatement(String missionStatement) {
		this.missionStatement = missionStatement;
	}
	public int getYearOfLaunch() {
		return yearOfLaunch;
	}
	public void setYearOfLaunch(int yearOfLaunch) {
		this.yearOfLaunch = yearOfLaunch;
	}
	
	//constructors 
	public ManMadeProbe() {
		
	}
	public ManMadeProbe(String name, double orbitalDistance, double angle, String missionStatement, int yearOfLaunch) {
		
		super(name, orbitalDistance, angle);
		
		setMissionStatement(missionStatement);
		setYearOfLaunch(yearOfLaunch);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getSOLAR_OBJECT_NAME() {
		// TODO Auto-generated method stub
		return SOLAR_OBJECT_NAME;
	}
	
	
	
	
	
	

}
