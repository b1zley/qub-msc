package nasa;

public class Moon extends SolarObject {
	
	// static constant user-friendly name
		private static final String SOLAR_OBJECT_NAME = "Moon";
		
		// constructors
		public Moon() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Moon(String name, double orbitalDistance, double angle) {
			super(name, orbitalDistance, angle);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String getSOLAR_OBJECT_NAME() {
			// TODO Auto-generated method stub
			return SOLAR_OBJECT_NAME;
		}
		
		
		
		
		

}
