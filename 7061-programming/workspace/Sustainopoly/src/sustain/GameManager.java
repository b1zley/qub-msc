package sustain;

import java.nio.file.spi.FileSystemProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class GameManager {
	private static final int MIN_PLAYERS = 2;
	private static final int MAX_PLAYERS = 4;

	private static final int STARTING_RESOURCES = 1500;

	private static final int STARTING_POSITION = 0;
	private static final int STARTING_DEVELOPMENT = 0;

	private static final int PASS_GO_PAY = 200;

	private static final int MAX_REGIONLESS_DEV = 2;
	private static final int MAX_REGION_OWNED_DEV = 5;

	private static final PlayerBalanceComparatorDesc PLAYER_BALANCE_COMPARATOR = new PlayerBalanceComparatorDesc();

	// need to randomize this arraylist!
	private List<Player> playerList;
	private int currentPlayer;
	private Board gameBoard;

	private Dice dice1;
	private Dice dice2;

	public void displayPlayerList() {
		for (Player player : playerList) {
			System.out.println(player.toString());
		}
	}

	protected void gamePlayersConfig() {

		System.out.println("Welcome to the game - baby");

		int numberOfPlayers = getNumberOfPlayersFromUser();

		System.out.println("You have selected " + numberOfPlayers + " players");

		for (int i = 1; i <= numberOfPlayers; i++) {
			String playerName = getPlayerNameFromUser(i);
			Player playerToAdd = new Player(playerName, STARTING_RESOURCES, STARTING_POSITION);
			playerList.add(playerToAdd);
		}
		System.out.println("Current player list:");
		this.displayPlayerList();

		System.out.println("Randomizing turn order...");
		this.randomizePlayerListOrder();

		this.displayPlayerList();

	}

	/**
	 * handy test method for quickly handling player set up
	 *
	 */
	protected void gamePlayersConfigFast() {
		System.out.println("Welcome to the game - baby");

		int numberOfPlayers = 3;
		System.out.println("You have selected " + numberOfPlayers + " players");

		for (int i = 1; i <= numberOfPlayers; i++) {
			String playerName = "name " + i;
			Player playerToAdd = new Player(playerName, STARTING_RESOURCES, STARTING_POSITION);
			playerList.add(playerToAdd);
		}

	}

	private void randomizePlayerListOrder() {
		Collections.shuffle(playerList);

	}

	private String getPlayerNameFromUser(int i) {

		Scanner sc = new Scanner(System.in);
		String playerName;
		boolean playerNameAccepted;

		do {
			System.out.println("Input player name for player " + i + "!");
			playerName = sc.nextLine();

			if (playerNameAlreadyInList(playerName)) {
				playerNameAccepted = false;
				System.out.println("Player name already in list!");
				continue;
			}
			
			if (playerName.length() <= 0) {
				playerNameAccepted = false;
				System.out.println("Too short, enter a longer name!");
				continue;
			}

			System.out.println("You input : " + playerName + " ...is this correct? (y to accept)");

			String userAcceptPlayerNameInput = sc.nextLine();

			if (userAcceptPlayerNameInput.equalsIgnoreCase("y")) {
				playerNameAccepted = true;
			} else {
				playerNameAccepted = false;
			}
			
		

		} while (!playerNameAccepted);

		return playerName;
	}

	private boolean playerNameAlreadyInList(String playerName) {

		for (Player player : playerList) {

			if (player.getName().equalsIgnoreCase(playerName)) {
				return true;
			}
		}

		return false;
	}

	/**
	 * function which prompts the user to input an int for selecting the number of
	 * players who should play the board game
	 * 
	 * @return - selected and confirmed number of players
	 */
	private static int getNumberOfPlayersFromUser() {
		Scanner sc = new Scanner(System.in);

		int numberOfPlayersInput;

		do {
			System.out.println(
					"Please select the number of players for this game (" + MIN_PLAYERS + "-" + MAX_PLAYERS + ")");

			try {
				numberOfPlayersInput = Integer.valueOf(sc.nextLine());
				;
			} catch (Exception e) {
				numberOfPlayersInput = -1000;
			}

			if (numberOfPlayersInput < MIN_PLAYERS || numberOfPlayersInput > MAX_PLAYERS) {
				System.out.println("invalid input!");
			}

		} while (numberOfPlayersInput < MIN_PLAYERS || numberOfPlayersInput > MAX_PLAYERS);

		while (true) {
			System.out.println("You selected : " + numberOfPlayersInput + " - is this ok? - y or n");
			String userInput = sc.nextLine();

			if (userInput.equalsIgnoreCase("y")) {
				System.out.println("Starting game with : " + numberOfPlayersInput + " players");
				break;
			} else if (userInput.equalsIgnoreCase("n")) {
				System.out.println("Restarting selection");
				return getNumberOfPlayersFromUser();
			} else {
				System.out.println("invalid input detected");

			}
		}

		return numberOfPlayersInput;
	}

	public GameManager(List<Player> playerList, int currentPlayer, Board gameBoard, Dice dice1, Dice dice2) {
		super();

		// need to randomize those order
		this.playerList = playerList;
		this.currentPlayer = currentPlayer;
		this.gameBoard = gameBoard;
		this.dice1 = dice1;
		this.dice2 = dice2;
	}

	public GameManager() {
		this.playerList = new ArrayList<Player>();
	}

	public GameManager(int dice1Sides, int dice2Sides) {
		this.playerList = new ArrayList<Player>();
		this.dice1 = new Dice(dice1Sides);
		this.dice2 = new Dice(dice2Sides);
	}

	public List<Player> getPlayerList() {
		return playerList;
	}

	public void setPlayerList(List<Player> playerList) {
		this.playerList = playerList;
	}

	public int getCurrentPlayer() {
		return currentPlayer;
	}

	public void setCurrentPlayer(int currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

	public Board getGameBoard() {
		return gameBoard;
	}

	public void setGameBoard(Board gameBoard) {
		this.gameBoard = gameBoard;
	}

	public static int getMinPlayers() {
		return MIN_PLAYERS;
	}

	public static int getMaxPlayers() {
		return MAX_PLAYERS;
	}

	public static int getStartingResources() {
		return STARTING_RESOURCES;
	}

	public void createGameBoard() {

		/// eventually handle via a file parse - quite complex - do later
		// handle each region and constituent areas

		Region start = new Region();

		BoardArea startArea = new NeutralArea("World Climate Change Summit", start);

		start.setName("Start");
		start.setAreasWithinRegion(List.of(startArea));
		start.setOwner(null);

		// call with default constructor
		Region northAmerica = new Region();

		// name, development level at game start, purchase cost, rent/dev level, owner
		BoardArea rockyMountains = new PurchasableArea("Rocky Mountains", STARTING_DEVELOPMENT, 100,
				List.of(6, 30, 90, 270, 400, 550), null, northAmerica);
		BoardArea grandCanyon = new PurchasableArea("Grand Canyon", STARTING_DEVELOPMENT, 100,
				List.of(6, 30, 90, 270, 400, 550), null, northAmerica);
		BoardArea yellowStoneNationalPark = new PurchasableArea("Yellowstone National Park", STARTING_DEVELOPMENT, 120,
				List.of(8, 40, 100, 300, 450, 600), null, northAmerica);

		northAmerica.setName("North America");
		northAmerica.setAreasWithinRegion(List.of(rockyMountains, grandCanyon, yellowStoneNationalPark));
		northAmerica.setOwner(null);

		// next region - south america

		Region southAmerica = new Region();

		BoardArea galapagos = new PurchasableArea("Galapagos Islands", STARTING_DEVELOPMENT, 140,
				List.of(10, 50, 150, 450, 625, 750), null, southAmerica);
		BoardArea amazon = new PurchasableArea("Amazon Rainforest", STARTING_DEVELOPMENT, 160,
				List.of(12, 60, 180, 500, 700, 900), null, southAmerica);

		southAmerica.setName("South America");
		southAmerica.setAreasWithinRegion(List.of(galapagos, amazon));
		southAmerica.setOwner(null);

		// next region - 1 location region - "do nothing square"

		Region doNothing = new Region();

		BoardArea justStopOil = new NeutralArea("Just Stop Oil Protest", doNothing);

		doNothing.setName("Protests");
		doNothing.setAreasWithinRegion(List.of(justStopOil));
		doNothing.setOwner(null);

		// next region - africa

		Region africa = new Region();

		BoardArea serengeti = new PurchasableArea("Serengeti National Park", STARTING_DEVELOPMENT, 220,
				List.of(18, 90, 250, 700, 875, 1050), null, africa);
		BoardArea kalahari = new PurchasableArea("Kalahari Desert", STARTING_DEVELOPMENT, 220,
				List.of(18, 90, 250, 700, 875, 1050), null, africa);
		BoardArea congo = new PurchasableArea("Congo Basin Rainforest", STARTING_DEVELOPMENT, 240,
				List.of(20, 100, 300, 750, 925, 1100), null, africa);

		africa.setName("Africa");
		africa.setAreasWithinRegion(List.of(serengeti, kalahari, congo));
		africa.setOwner(null);

		// next region - europe

		Region europe = new Region();

		BoardArea scottishHigh = new PurchasableArea("Scottish Highlands", STARTING_DEVELOPMENT, 260,
				List.of(22, 110, 330, 800, 975, 1150), null, europe);
		BoardArea spanishPyrenees = new PurchasableArea("Spanish Pyrenees", STARTING_DEVELOPMENT, 280,
				List.of(24, 120, 360, 850, 1025, 1200), null, europe);

		europe.setName("Europe");
		europe.setAreasWithinRegion(List.of(scottishHigh, spanishPyrenees));
		europe.setOwner(null);

		Board board = new Board(List.of(start, northAmerica, southAmerica, doNothing, africa, europe));

		this.setGameBoard(board);
	}

	public void playGame() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Starting game...");

		// hard code for now
		boolean gameEndConditionReached = false;

		do {

			Player currentPlayerObject = this.getPlayerList().get(currentPlayer);
			System.out.println("Current player : " + currentPlayerObject.getName());

			// display current position
			System.out.println("Current Area: ");
			displayPositionOfPlayer(currentPlayerObject);

			// handle burndown of unsustainable devs
			progressBurnDowns(currentPlayerObject);

			// prompt player for dice roll
			boolean doesPlayerWantToRoll = promptUserDiceRoll();

			// break out of loop and end game
			if (!doesPlayerWantToRoll) {
				triggerBankruptcy(currentPlayerObject);
				break;
			}

			// execute dice roll (conditionally)
			int diceRoll = rollDice();

			// move player
			movePlayer(currentPlayerObject, diceRoll);

			// display new position
			System.out.println("New Current Area: ");
			displayPositionOfPlayer(currentPlayerObject);

			// check if neutral or not neutral

			BoardArea currentArea = getCurrentArea(currentPlayerObject);

			boolean areaIsNeutral = false;
			if (currentArea.getClass() == NeutralArea.class) {
				areaIsNeutral = true;
			}

			// check ownership status

			Player owner = getOwnerOfPlayerCurrentLocation(currentPlayerObject);

			// if neutral - dont interact with purchasing options
			// if purchasable - interact with purchasing options

			if (areaIsNeutral) {
				System.out.println("This is a neutral area - take a breather here!");
				System.out.println();
			} else if (owner == null) {
				System.out.println("No player owns this location...");
				System.out.println();
				boolean purchaseAccepted = offerPurchase(currentPlayerObject);
				if (purchaseAccepted) {
					purchaseLocation(currentPlayerObject, (PurchasableArea) currentArea);
				}

			} else if (owner.equals(currentPlayerObject)) {
				System.out.println("You own this square - you're chillin");
				PurchasableArea pa = (PurchasableArea) currentArea;
				printDevelopmentLevelStrings(pa);
				System.out.println();
			} else {
				System.out.println("You gotta pay rent g");
				System.out.println();
				PurchasableArea purchasableCurrentArea = (PurchasableArea) currentArea;
				printDevelopmentLevelStrings(purchasableCurrentArea);
				boolean paymentAccepted = payPlayer(owner, currentPlayerObject, purchasableCurrentArea);
				if (!paymentAccepted) {
					triggerBankruptcy(currentPlayerObject);
					break;
				}
			}

			// offer development

			List<Region> regionsOwnedByCurrentPlayer = getOwnedRegions(currentPlayerObject);
			List<PurchasableArea> areasOwnedByCurrentPlayer = getOwnedAreas(currentPlayerObject);

			if (areasOwnedByCurrentPlayer.size() == 0) {
				System.out.println("bro you dont own shit, no dev for you");

			} else if (regionsOwnedByCurrentPlayer.size() == 0) {
				System.out.println("No full regions owned - development only allowing minor development!");
				System.out.println("Development Menu: ");
				offerUserDevelopmentMenu(currentPlayerObject);

			} else {
				System.out.println(
						"Full region owned - allowing major developments in that region and minor in any other owned areas");
				System.out.println("Development Menu: ");
				offerUserDevelopmentMenu(currentPlayerObject);
			}

			// end turn

			System.out.println("Press enter to advance to the next turn!");
			sc.nextLine();

			changeTurnToNextPlayer();

		} while (!gameEndConditionReached);

		triggerGameEnd();

	}

	private void progressBurnDowns(Player playerObject) {
		List<PurchasableArea> areas = this.getOwnedAreas(playerObject);

		for (PurchasableArea area : areas) {

			PurchasableArea pa = (PurchasableArea) area;
			if (pa.getSustainableDevelopment() == SustainabilityType.UNSUSTAINABLE) {

				if (pa.progressBurnDown()) {
					System.out.println("Development at : " + pa.toString() + "deteriorated...");
					System.out.println("Now " + pa.getBurnDown() + " turns remaining");
					if (pa.getBurnDown() == 0) {
						System.out.println("Now this area no longer charges rent!");
					}
				}

			}

		}

	}

	private void offerUserDevelopmentMenu(Player currentPlayerObject) {
		Scanner sc = new Scanner(System.in);

		// no longer necessary
//		List<PurchasableArea> ownedAreaList = new ArrayList<PurchasableArea>();

//		for (Region region : regionsOwnedByCurrentPlayer) {
//			List<BoardArea> areasWithinRegion = region.getAreasWithinRegion();
//
//			for (BoardArea boardArea : areasWithinRegion) {
//
//				PurchasableArea convertedPurchasableArea = (PurchasableArea) boardArea;
//				ownedAreaList.add(convertedPurchasableArea);
//			}
//
//		}

		// get owned areas
		List<PurchasableArea> ownedAreaList = getOwnedAreas(currentPlayerObject);

		// get developableAreas

		List<PurchasableArea> developableAreas = new ArrayList<PurchasableArea>();

		for (PurchasableArea purchasableArea : ownedAreaList) {

			if (purchasableArea.getDevelopmentLevel() < MAX_REGIONLESS_DEV
					|| (purchasableArea.getRegion().getOwner().equals(currentPlayerObject)
							&& purchasableArea.getDevelopmentLevel() < MAX_REGION_OWNED_DEV)) {

				developableAreas.add(purchasableArea);
			}

		}

		// if no areas developable - print that and return from function
		if(developableAreas.size() == 0) {
			System.out.println("No areas developable, insufficient balance!");
			return;
		} 
		
		
		int userInputInt;
		do {
			System.out.println("Select an area to develop:");
			System.out.println();
			for (int i = 0; i < developableAreas.size(); i++) {
				PurchasableArea currentArea = ownedAreaList.get(i);
				StringBuilder sb = new StringBuilder();
				sb.append(i);
				sb.append(". ");
				sb.append(currentArea.getName());
				sb.append("\n");

				sb.append("Current development : ");
				sb.append(currentArea.getDevelopmentLevel());
				sb.append("\n");

				sb.append("Development Cost : ");
				sb.append(currentArea.getRentDevLevel().get(currentArea.getDevelopmentLevel()));
				sb.append("\n");

				sb.append("Development Sustainability : ");
				sb.append(currentArea.getSustainableDevelopment());
				sb.append("\n");

				System.out.println(sb.toString());
			}
			String userInput = sc.nextLine();
			if(userInput.equals("n")) {
				System.out.println("Not developing any area!");
				break;
			}
			
			try {
				userInputInt = Integer.valueOf(userInput);
			} catch (Exception e) {
				userInputInt = -1000;
				continue;
			}

			try {
				System.out
						.println("You selected : " + userInput + " - " + ownedAreaList.get(userInputInt).getName());

			} catch (Exception e) {
				System.out.println("Invalid selection!");
				userInputInt = -1000;
				continue;
			}

			PurchasableArea areaToDevelop = ownedAreaList.get(userInputInt);

			if (currentPlayerObject.getBalance() < areaToDevelop.getRentDevLevel()
					.get(areaToDevelop.getDevelopmentLevel())) {
				// too little balance to develop!
				System.out.println("Insufficient balance to afford development");
				System.out.println("Your balance : " + currentPlayerObject.getBalance() + " Cost : "
						+ areaToDevelop.getRentDevLevel().get(areaToDevelop.getDevelopmentLevel()));
				userInputInt = -1000;
				continue;
			}

			developArea(areaToDevelop);

		} while (userInputInt == -1000);

	}

	private List<PurchasableArea> getOwnedAreas(Player currentPlayerObject) {

		List<PurchasableArea> ownedAreas = new ArrayList<PurchasableArea>();

		List<BoardArea> boardAreas = gameBoard.getOrderedAreaList();

		for (BoardArea boardArea : boardAreas) {

			if (boardArea.getClass() == PurchasableArea.class) {

				PurchasableArea currentArea = (PurchasableArea) boardArea;

				if (currentArea.getOwner().equals(currentPlayerObject)) {
					ownedAreas.add(currentArea);
				}

			}
		}

		return ownedAreas;
	}

	private void developArea(PurchasableArea areaToDevelop) {

		// handle setting development type from user
		if (areaToDevelop.getDevelopmentLevel() == 0) {

			Scanner sc = new Scanner(System.in);
			int userInputInt = -1000;
			while (userInputInt == -1000) {

				System.out.println("Would you like to develop this area sustainable or unsustainble?");
				System.out.println("1 for sustainable, 2 for unsustainable...");
				try {

					userInputInt = Integer.valueOf(sc.nextLine());
				} catch (Exception e) {
					userInputInt = -1000;
				}

				if (userInputInt != 1 && userInputInt != 2) {
					userInputInt = -1000;
				}

				if (userInputInt == -1000) {
					System.out.println("Invalid input!");
				}
			}

			if (userInputInt == 1) {
				// set development type to sustainable
				areaToDevelop.setSustainableDevelopment(SustainabilityType.SUSTAINABLE);
			} else if (userInputInt == 2) {
				// set development type to unsustainable
				areaToDevelop.setSustainableDevelopment(SustainabilityType.UNSUSTAINABLE);
			}

			System.out.println("Sustainability type set to : " + areaToDevelop.getSustainableDevelopment());

		}

		// fetch area owner
		Player owner = areaToDevelop.getOwner();

		int currentDevCost = areaToDevelop.getRentDevLevel().get(areaToDevelop.getDevelopmentLevel());

		chargePlayer(owner, currentDevCost);

		int currentDevelopmentLevel = areaToDevelop.getDevelopmentLevel();

		areaToDevelop.setDevelopmentLevel(currentDevelopmentLevel + 1);

		System.out.println("Successfully increased development level from  " + currentDevelopmentLevel + " to "
				+ (currentDevelopmentLevel + 1));
		
		printDevelopmentLevelStrings(areaToDevelop);
	}

	private void printDevelopmentLevelStrings(PurchasableArea pa) {
		System.out.println("Developments on "+ pa.getName() +" :");

		List<String> developments = pa.getDevelopmentLevelStrings();
		
		if(developments.size() > 0 ) {
			for (String development : developments ) {
				System.out.println(development);
			}
		} else {
			System.out.println("No developments in this area");
		}
		
	}

	private List<Region> getOwnedRegions(Player currentPlayerObject) {

		List<Region> allRegions = this.gameBoard.getRegionList();
		List<Region> ownedRegions = new ArrayList<Region>();

		for (Region region : allRegions) {
			if (region.getOwner() != null && region.getOwner().equals(currentPlayerObject)) {
				ownedRegions.add(region);
			}

		}
		return ownedRegions;
	}

	private void triggerBankruptcy(Player currentPlayerObject) {
		System.out.println("PLAYER : " + currentPlayerObject.getName() + " BANKRUPT!");
		currentPlayerObject.setBalance(-1000);

	}

	/**
	 * return true if player decides to purchase the current area return false if
	 * purchase cannot proceed due to insufficient funds or player choice
	 * 
	 * @param currentPlayerObject
	 * @return
	 */
	private boolean offerPurchase(Player currentPlayerObject) {
		// not sure i like parameterising, but it definitely makes the programming a bit
		// easier
		Scanner sc = new Scanner(System.in);
		PurchasableArea currentArea = (PurchasableArea) getCurrentArea(currentPlayerObject);

		int purchaseCost = currentArea.getPurchasePrice();

		if (purchaseCost > currentPlayerObject.getBalance()) {
			System.out.println("Whoops - you cannot currently afford this area!");
			return false;
		}

		while (true) {
			System.out.println(
					"Would you like to purchase the current location for " + purchaseCost + " price? - y or n");

			String userInput = sc.nextLine();

			if (userInput.equalsIgnoreCase("y")) {
				return true;
			} else if (userInput.equalsIgnoreCase("n")) {
				return false;
			} else {
				continue;
			}

		}

	}

	private void purchaseLocation(Player currentPlayerObject, PurchasableArea currentArea) {
		chargePlayer(currentPlayerObject, currentArea.getPurchasePrice());
		currentArea.setOwner(currentPlayerObject);
		System.out.println(
				"You successfully purchased " + currentArea.getName() + " for " + currentArea.getPurchasePrice());
		Region regionOfPurchase = currentArea.getRegion();

		List<BoardArea> areasWithinRegion = regionOfPurchase.getAreasWithinRegion();

		for (BoardArea boardArea : areasWithinRegion) {
			PurchasableArea pa = (PurchasableArea) boardArea;

			if (pa.getOwner() == null || !pa.getOwner().equals(currentPlayerObject)) {
				return;
			}

		}

		regionOfPurchase.setOwner(currentPlayerObject);

	}

	private BoardArea getCurrentArea(Player currentPlayerObject) {

		int currentLocationIndex = currentPlayerObject.getCurrentArea();

		BoardArea currentArea = gameBoard.getOrderedAreaList().get(currentLocationIndex);

		return currentArea;
	}

	private Player getOwnerOfPlayerCurrentLocation(Player currentPlayerObject) {

		BoardArea currentArea = getCurrentArea(currentPlayerObject);

		if (currentArea.getClass() == PurchasableArea.class) {
			PurchasableArea currentAreaPurch = (PurchasableArea) currentArea;
			Player owner = currentAreaPurch.getOwner();
			return owner;
		}

		return null;
	}

	private void displayPositionOfPlayer(Player currentPlayerObject) {

		BoardArea currentBoardArea = getCurrentArea(currentPlayerObject);
		System.out.println(currentBoardArea.toString());

	}

	private void movePlayer(Player currentPlayerObject, int diceRoll) {

		int maxBoardIndex = this.getGameBoard().getOrderedAreaList().size() - 1;

		int adjustedPositionInt = diceRoll + currentPlayerObject.getCurrentArea();

		if (adjustedPositionInt > maxBoardIndex) {
			adjustedPositionInt -= (maxBoardIndex + 1);
			payPlayer(currentPlayerObject, PASS_GO_PAY);
		}

		currentPlayerObject.setCurrentArea(adjustedPositionInt);
		System.out.println("Moving you " + diceRoll + " spaces...");
		System.out.println();

	}

	private void triggerGameEnd() {
		System.out.println("Ending game...");

		Collections.sort(this.getPlayerList(), PLAYER_BALANCE_COMPARATOR);
		System.out.println(this.getPlayerList().get(0).getName() + " IS THE WINNER!!!");

		System.out.println("Full scoreboard: ");

		for (int i = 0; i < playerList.size(); i++) {
			Player currentPlayer = playerList.get(i);
			System.out.println((i + 1) + "." + currentPlayer.getName() + " - BALANCE : " + currentPlayer.getBalance());
		}

	}

	private boolean promptUserDiceRoll() {
		Scanner sc = new Scanner(System.in);
		String userInput;
		boolean userResponse;

		while (true) {

			System.out.println("Would you like to roll dice? - y or n");

			userInput = sc.nextLine();

			if (userInput.equalsIgnoreCase("y")) {
				userResponse = true;
				break;
			} else if (userInput.equalsIgnoreCase("n")) {

				while (true) {

					System.out.println("Are you sure? This will terminate the game! y to continue - n to quit game");
					userInput = sc.nextLine();
					if (userInput.equalsIgnoreCase("y")) {
						userResponse = true;
						break;
					} else if (userInput.equalsIgnoreCase("n")) {
						userResponse = false;
						break;
					} else {
						continue;
					}

				}

				if (userResponse == true) {
					continue;
				} else {
					break;
				}

			} else {
				continue;
			}
		}
		return userResponse;
	}

	public int rollDice() {
		int roll1 = this.dice1.roll();
		int roll2 = this.dice2.roll();

		System.out.println("Rolling dice...");
		System.out.println("Dice 1 : " + dice1.getNumberOfSides() + " sided die... you rolled : " + roll1);
		System.out.println("Dice 2 : " + dice2.getNumberOfSides() + " sided die... you rolled : " + roll2);
		System.out.println("For a total of " + (roll1 + roll2));
		System.out.println();

		return (roll1 + roll2);
	}

	private void changeTurnToNextPlayer() {
		System.out.println("Starting next player turn...");
		System.out.println();
		currentPlayer++;

		if (currentPlayer >= playerList.size()) {
			currentPlayer = 0;
		}

	}

	private void payPlayer(Player recipient, int amount) {
		int balanceToSet = recipient.getBalance() + amount;
		System.out.println("Paying " + recipient.getName() + " " + amount);
		System.out.println("New balance : " + balanceToSet);
		recipient.setBalance(balanceToSet);
	}

	private boolean payPlayer(Player recipient, Player payer, PurchasableArea currentArea) {

		int amount = currentArea.getCurrentRent();

		if (!chargePlayer(payer, amount)) {
			return false;
		}

		payPlayer(recipient, amount);
		return true;
	}

	/**
	 * returns true if payment was successful returns false if payment was
	 * unsuccessful
	 * 
	 * @param playerToCharge
	 * @param amount
	 * @return
	 */
	private boolean chargePlayer(Player playerToCharge, int amount) {
		int balanceToSet = playerToCharge.getBalance() - amount;
		if (balanceToSet < 0) {
			System.out.println("BANKRUPTCY TRIGGERED FOR " + playerToCharge.getName());
			return false;
		}

		playerToCharge.setBalance(balanceToSet);
		System.out.println("New balance set at " + balanceToSet + " for " + playerToCharge.getName());
		return true;

	}

}
