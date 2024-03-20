package sustain;

import java.util.ArrayList;
import java.util.List;

public class GameStart {

	public static void main(String[] args) {

		GameManager gameManager = new GameManager(2, 2);

		// handle game start

		// create areas and regions
		// will eventually handle this stuff with a config file but for now we hardcode

		gameManager.createGameBoard();

//		gameManager.getGameBoard().displayOrderedAreaList();

		// handles player configuration and registration
		gameManager.gamePlayersConfigFast();
		
//		gameManager.gamePlayersConfig();
		
		
		// testing development menu
		
		fastSetUpGameManagerForDevelopmentTesting(gameManager);
		

		gameManager.playGame();
		
		 
		

	}
	
	public static void fastSetUpGameManagerForDevelopmentTesting(GameManager gameManager) {

		Player playerToSet = gameManager.getPlayerList().get(0);
		playerToSet.setBalance(1000);
		
		List<BoardArea> boardAreas = gameManager.getGameBoard().getOrderedAreaList();
		List<Region> boardRegions = gameManager.getGameBoard().getRegionList();
		
		for (BoardArea boardArea : boardAreas) {
			if (boardArea.getClass() == PurchasableArea.class) {
				PurchasableArea pa = (PurchasableArea) boardArea;
				pa.setOwner(playerToSet);
				
			}
		}
		
//		for(Region region: boardRegions) {
//			if(region.getName().equalsIgnoreCase("start") || region.getName().equalsIgnoreCase("Protests")) {
//				
//			} else {
//				region.setOwner(playerToSet);
//			}
//		}
		
		
	}

}
