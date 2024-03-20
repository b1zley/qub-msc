package sustain;

import java.util.ArrayList;
import java.util.List;

public class Region {
	
	private String name;
	private List<BoardArea> areasWithinRegion;
	private Player owner; // can be null
	
	public Region() {
		
	}

	public Region(String name, List<BoardArea> areasWithinRegion, Player owner) {
		super();
		this.name = name;
		this.areasWithinRegion = areasWithinRegion;
		this.owner = owner;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<BoardArea> getAreasWithinRegion() {
		return areasWithinRegion;
	}

	public void setAreasWithinRegion(List<BoardArea> areasWithinRegion) {
		this.areasWithinRegion = areasWithinRegion;
	}

	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player owner) {
		this.owner = owner;
	}
	
	
	/**
	 * utility method for showing areas within a region
	 */
	public void displayAreasWithinRegion() {
		System.out.println("Areas within : " + this.getName());
		for(BoardArea boardArea : areasWithinRegion) {
			System.out.println(boardArea.toString());
		}
	}

	@Override
	public String toString() {
		return "Region [name=" + name + ", areasWithinRegion=" + areasWithinRegion + ", owner=" + owner + "]";
	}
	
	
	
	
	
	
}
