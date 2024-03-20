package sustain;

import java.util.ArrayList;
import java.util.List;

public class Board {
	private List<Region> regionList;
	
	/**
	 * populate orderedAreaList based on regionList ordering
	 */
	private List<BoardArea> orderedAreaList;

	public Board(List<Region> regionList) {
		super();
		this.regionList = regionList;
		this.orderedAreaList = generateOrderedAreaList();
	}
	
	
	
	
	
	public List<Region> getRegionList() {
		return regionList;
	}
	public void setRegionList(List<Region> regionList) {
		this.regionList = regionList;
	}
	public List<BoardArea> getOrderedAreaList() {
		return orderedAreaList;
	}
	public void setOrderedAreaList(List<BoardArea> orderedAreaList) {
		this.orderedAreaList = orderedAreaList;
	}





	private ArrayList<BoardArea> generateOrderedAreaList() {
		
		ArrayList<BoardArea> orderedAreaList = new ArrayList<BoardArea>();
		
		for(Region region : this.regionList) {
			List<BoardArea> areasInRegion = region.getAreasWithinRegion();
			
			for(BoardArea areaInRegion : areasInRegion) {
				orderedAreaList.add(areaInRegion);
			}
		}
		
		return orderedAreaList;
		
	}
	
	
	public void displayOrderedAreaList() {
		for(BoardArea ba : orderedAreaList) {
			System.out.println(ba.toString());
		}
	}
	
	
	
}
