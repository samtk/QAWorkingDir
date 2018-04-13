import java.util.ArrayList;
import java.util.Scanner;

public class GameState {
	
	private Player player; //the player character
	private Grid map;  //contains map descriptions of locations
	private ArrayList<Treasure> items; 
	private boolean haveWon = false;
	
	
	
	public GameState() {
		items = new ArrayList<Treasure>();	
		player = new Player(1,1);
		map = new Grid();
		map.populateMap();
		setUpTreasures();
		player.pickUp(new Treasure(1,1,"compass", "This will show you the way!"));
	}
	 
	
	public void startGame() {
		Scanner sc = new Scanner(System.in);
		startMessage();
		String input = sc.nextLine();
		System.out.println(readCommand(input));
		System.out.println("You notice a small watch-like device in your left hand. It has hands like a watch, but the hands don't seem to tell time");
		System.out.println("try 'north', 'south', 'east' or 'west'");
		
		while(true) {
			input = sc.nextLine();
			String response = readCommand(input);
			System.out.println(response);
			if(haveWon) break;
		}
		sc.close();
	}
	
	public String readCommand(String input) { 
		switch(input.toLowerCase()) { 
			case("look"):
				return map.getMapDescription(player.getPlayerXCoord(), player.getPlayerYCoord()) +'\n' + itemAtLocation();
			case("north"):
				if(player.getPlayerYCoord()-1 < 0) {
					map.printGrid(player.getPlayerXCoord(), player.getPlayerYCoord());
					return "Can't go north";
				}
				player.movePlayer(player.getPlayerXCoord(),player.getPlayerYCoord()-1);
				map.printGrid(player.getPlayerXCoord(), player.getPlayerYCoord());
				return compass() +'\n' + itemAtLocation();
			case("east"):
				if(player.getPlayerXCoord()+1 > 9) { 
					map.printGrid(player.getPlayerXCoord(), player.getPlayerYCoord());
					return "Can't go east";
				}
				player.movePlayer(player.getPlayerXCoord()+1,player.getPlayerYCoord());
				map.printGrid(player.getPlayerXCoord(), player.getPlayerYCoord());
				return compass()+ '\n' +itemAtLocation();
			case("south"):
				if(player.getPlayerYCoord()+1 > 9) {
					map.printGrid(player.getPlayerXCoord(), player.getPlayerYCoord());
					return "Can't go south";
				}
				player.movePlayer(player.getPlayerXCoord(),player.getPlayerYCoord()+1);
				map.printGrid(player.getPlayerXCoord(), player.getPlayerYCoord());
				return compass()+ '\n' +itemAtLocation();
			case("west"):
				if(player.getPlayerXCoord()-1 < 0) {
					map.printGrid(player.getPlayerXCoord(), player.getPlayerYCoord());
					return "Can't go west";
				}
				player.movePlayer(player.getPlayerXCoord()-1,player.getPlayerYCoord());
				map.printGrid(player.getPlayerXCoord(), player.getPlayerYCoord());
				return compass()+ '\n' + itemAtLocation();
			case("compass"):
				return compass();
			case("use letter"):
				if(items.get(0).getXCoord() == player.getPlayerXCoord() && items.get(0).getYCoord() == player.getPlayerYCoord()) {
					haveWon = true;
					return "The letter reads 'You Win! You must be very smart!'";
				}
				return "command not recognised";
			case("inventory"):
				return player.printInventory();  
			case("help"):
				return helpCommand();
			default:
				return "command not recognised";
				     
		}  
	} 
	
	
	/**
	 * sets up the game with the required treasures
	 */
	private void setUpTreasures() {	
		//items[0] = new Treasure(0,0,"flashlight", "useful in the dark");
		//items[1] = new Treasure(5,5,"key", "when something is locked");
		//items.add(new Treasure(1,1,"compass", "This will show you the way!"));
		items.add(new Treasure(6,8,"letter", "This might say something interesting. Try 'use letter'"));

	}
	

	/**
	 * 
	 * @returns a String describing how far away player is from feature 
	 */
	private String compass() {
		double distance = 0;
		int itemx = items.get(0).getXCoord();
		int itemy = items.get(0).getYCoord();
		int playerx = player.getPlayerXCoord();
		int playery = player.getPlayerYCoord();
			
		distance = Math.hypot((itemx-playerx), (itemy - playery));
		
		/**
		if(itemx >= playerx) {
			distance += itemx - playerx;
		}
		else {
			distance += playerx - itemx;
		}
		
		if(itemy >= playery) {
			distance += itemy - playery;
		}
		else {
			distance += playery - itemy;
		}
		*/
		return "The dial reads " + distance + "m";
	}
	
	/**
	 * checks if there is an item at the player location
	 * @return a custom string with the item name and item description if there is one
	 */
	private String itemAtLocation() {
		String msg = "";
		for(Treasure item : items) {
			if(item.getXCoord() == player.getPlayerXCoord() && item.getYCoord() == player.getPlayerYCoord()) {
				msg = "You see a " + item.getName() + ". " + item.getDescription() + "." ;
			}
		}
		
		return msg;
	}
	
	/**
	 * Message printed out to player at start of the game
	 */
	public void startMessage() {
		String msg = "Simple text adventure called \"The adventure of the barren moor\"\r\n" + 
				"You awaken to find yourself in a barren moor.  Try \"look\"";
		System.out.println(msg);
	}
	
	public String helpCommand() {
		return "try commands: 'Look', 'North', 'West', 'South', 'East', 'inventory'";
	}
	
	public void givePlayerItem(int index) { 
		player.pickUp(items.get(index));
		items.remove(index);
		
	}
	
	public void removeItem(String name) {
		for(int i = 0; i < items.size(); i ++) {
			if(items.get(i).getName().equals(name)) {
				items.remove(i);
			}
		}
	}
	
	

	
	
	

	
	
	
	
	

}
