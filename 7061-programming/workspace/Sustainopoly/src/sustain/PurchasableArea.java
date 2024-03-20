package sustain;

import java.util.ArrayList;
import java.util.List;

public class PurchasableArea extends BoardArea {
	private int developmentLevel;
	private int purchasePrice;
	private List<Integer> rentDevLevel;
	private static final List<Integer> UPGRADE_COSTS = new ArrayList<Integer>(List.of(50, 100, 150, 200, 250));
	private Player owner;
	private int burnDown = 2;

	private static final double UNSUSTAINABLE_PROFIT_MULTIPLER = 2;
	private SustainabilityType sustainableDevelopmentType = SustainabilityType.NOT_SET;
	
	protected boolean progressBurnDown() {
		if(burnDown > 0) {
			this.burnDown--;
			return true;
		} else {

			return false;
		}
		
		
		
		
	}
	

	private static final List<String> SUSTAINABLE_DEVELOPMENTS = 
			new ArrayList<String>(List.of(
					"Establish eco-friendly hiking trails with interpretive signs highlighting the importance of mountain ecosystems.",
					"Establish wind farms to harness renewable energy while minimizing impact on habitats. ",
					"Integrate solar energy with energy storage systems to provide reliable and resilient power supply for communities.",
					"Collaborate with local communities to create responsible ecotourism ventures, supporting livelihoods while preserving habitats.",
					"Establish national parks in the area – ensuring the area’s natural beauty will be protected for generations"
					));
	
	private static final List<String> UNSUSTAINABLE_DEVELOPMENTS = 
			new ArrayList<String>(List.of(
					"Allow overfishing/overfarming causing depletion of animal levels and damaging ecosystems.",
					"Construct luxury chalets and golf courses, disrupting mountain ecosystems and natural landscapes.",
					"Permit large-scale logging operations without reforestation efforts, causing deforestation and habitat fragmentation.",
					"Allow mining activities for minerals like coal or rare earth metals, resulting in habitat destruction and water pollution.",
					"Introduce fracking operations for natural gas extraction, risking water contamination and seismic instability in mountain regions."
					));
	
	
	
	

	public PurchasableArea(String name, int developmentLevel, int purchasePrice, List<Integer> rentDevLevel,
			Player owner, Region region) {
		super(name, region);
		this.developmentLevel = developmentLevel;
		this.purchasePrice = purchasePrice;
		this.rentDevLevel = rentDevLevel;
		this.owner = owner;
	}

	public int getDevelopmentLevel() {
		return developmentLevel;
	}

	public void setDevelopmentLevel(int developmentLevel) {
		this.developmentLevel = developmentLevel;
	}

	public int getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(int purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public List<Integer> getRentDevLevel() {
		return rentDevLevel;
	}

	public void setRentDevLevel(List<Integer> rentDevLevel) {
		this.rentDevLevel = rentDevLevel;
	}

	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player owner) {
		this.owner = owner;
	}

	public static List<Integer> getUpgradeCosts() {
		return UPGRADE_COSTS;
	}

	public int getCostToDevelop() {
		int devLevel = this.getDevelopmentLevel();

		int currentUpgradeCost = getUpgradeCosts().get(devLevel);
		return currentUpgradeCost;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		String newLine = "\n";

		sb.append("area: " + this.getName());
		sb.append(newLine);

		sb.append("owner: " + this.getOwner());
		sb.append(newLine);

		sb.append("devlevel : " + this.developmentLevel);
		sb.append(newLine);

		sb.append("region : " + this.getRegion().getName());
		sb.append(newLine);

		return sb.toString();
	}

	public SustainabilityType getSustainableDevelopment() {
		return sustainableDevelopmentType;
	}

	public void setSustainableDevelopment(SustainabilityType sustainableDevelopment) {
		this.sustainableDevelopmentType = sustainableDevelopment;
	}

	public static double getUnsustainableProfitMultipler() {
		return UNSUSTAINABLE_PROFIT_MULTIPLER;
	}

	public static List<String> getUnsustainableDevelopments() {
		return UNSUSTAINABLE_DEVELOPMENTS;
	}

	public static List<String> getSustainableDevelopments() {
		return SUSTAINABLE_DEVELOPMENTS;
	}

	public int getBurnDown() {
		return burnDown;
	}

	public void setBurnDown(int burnDown) {
		this.burnDown = burnDown;
	}

	public int getCurrentRent() {
		int toReturn = 0;
		
		if(this.getSustainableDevelopment() == SustainabilityType.UNSUSTAINABLE) {

			toReturn = (int) (this.getRentDevLevel().get(developmentLevel) * UNSUSTAINABLE_PROFIT_MULTIPLER);
			return toReturn;
		} else {
			return this.getRentDevLevel().get(developmentLevel);
		}
		
		
	}
	
	
	public List<String> getDevelopmentLevelStrings() {
		
		List<String> developmentStrings = new ArrayList<String>();
		
		if(this.getSustainableDevelopment() == SustainabilityType.UNSUSTAINABLE) {
			for(int i = 0 ; i < this.getDevelopmentLevel(); i++) {
				String dev = UNSUSTAINABLE_DEVELOPMENTS.get(i);
				
				developmentStrings.add(dev);
			}
			
		} else {
			for(int i = 0 ; i < this.getDevelopmentLevel(); i++) {
				String dev = SUSTAINABLE_DEVELOPMENTS.get(i);
				
				developmentStrings.add(dev);
			}
			
		}
		
		
		return developmentStrings;
	}
	
	

	
	
}
