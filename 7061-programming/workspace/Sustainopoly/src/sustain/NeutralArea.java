package sustain;

public class NeutralArea extends BoardArea {

	public NeutralArea(String name, Region region) {
		super(name, region);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		String newLine = "\n";
		
		sb.append("area : " + this.getName());
		sb.append(newLine);
		
		sb.append("region : " + this.getRegion().getName());
		sb.append(newLine);
		
		return sb.toString();
	}
	
	
	
	
	

}
