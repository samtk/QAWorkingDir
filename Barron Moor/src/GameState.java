
public class GameState {
	
	private Player player;
	private Grid map;
	private Treasure[] items;
	
	
	
	public GameState() {
		player = new Player(1,1);
		map = new Grid();
		map.populateMap();
		createTreasures();
		
		
	}
	
	
	public String readCommand(String input) {
		if(input.equalsIgnoreCase("look")) {
			return map.getMapDescription(player.getPlayerXCoord(), player.getPlayerYCoord()) +'\n' + itemAtLocation();
			
		}
		else if(input.equalsIgnoreCase("north")) {
			if(player.getPlayerXCoord()-1 < 0) {
				return "Can't go north";
			}
			player.movePlayer(player.getPlayerXCoord()-1,player.getPlayerYCoord());
			return compass() +'\n' + itemAtLocation();
			
		}
		else if(input.equalsIgnoreCase("east")) {
			if(player.getPlayerYCoord()+1 > 9) {
				return "Can't go east";
			}
			player.movePlayer(player.getPlayerXCoord(),player.getPlayerYCoord()+1);
			return compass()+ '\n' +itemAtLocation();
		}
		else if(input.equalsIgnoreCase("south")) {
			if(player.getPlayerXCoord()+1 > 9) {
				return "Can't go south";
			}
			player.movePlayer(player.getPlayerXCoord()+1,player.getPlayerYCoord());
			return compass()+ '\n' +itemAtLocation();
			
		}
		else if(input.equalsIgnoreCase("west")) {
			if(player.getPlayerYCoord()-1 < 0) {
				return "Can't go west";
			}
			player.movePlayer(player.getPlayerXCoord(),player.getPlayerYCoord()-1);
			return compass()+ '\n' + itemAtLocation();
			
		}
		else if(input.equalsIgnoreCase("inventory")) {
			
		}
		else if(input.equalsIgnoreCase("commands")) {
			
		}
		else if(input.equalsIgnoreCase("use letter")) {
			return "The letter reads 'You Win! You must be very smart!'";
			
		}
		
		return "command not recognised";
		
	} 
	
	private void createTreasures() {
		items = new Treasure[1];		
		//items[0] = new Treasure(0,0,"flashlight", "useful in the dark");
		//items[1] = new Treasure(5,5,"key", "when something is locked");
		items[0] = new Treasure(6,8,"letter", "This might say something interesting. Try 'use letter'");

	}
	

	private String compass() {
		int distance = 0;
		int itemx = items[0].getXCoord();
		int itemy = items[0].getYCoord();
		int playerx = player.getPlayerXCoord();
		int playery = player.getPlayerYCoord();
		
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
		
		return "The dial reads " + distance + "m";
		 
	}
	
	private String itemAtLocation() {
		String msg = "";
		for(Treasure item : items) {
			if(item.getXCoord() == player.getPlayerXCoord() && item.getYCoord() == player.getPlayerYCoord()) {
				msg = "You see a " + items[0].getName() + ". " + items[0].getDescription() + "." ;
			}
		}
		
		return msg;
	}
	
	public void startMessage() {
		String msg = "Simple text adventure called \"The adventure of the barren moor\"\r\n" + 
				"\r\n" + 
				"In \"The adventure of the barren moor\" the player is in the middle of an infinite grey swamp. This grey swamp has few distinguishing characteristics, other than the fact that it is large and infinite and dreary. However, the player DOES have a magic compass that tells the player how far away the next feature of interest is.\r\n" + 
				"\r\n" + 
				"The player can go north,south,east,or west.\r\n" + 
				"\r\n" + 
				"Here is an example playthrough you might create\r\n" + 
				"\r\n" + 
				"You awaken to find yourself in a barren moor.  Try \"look\"";
		System.out.println(msg);
	}

	
	public boolean victory(String input) {
		return input.equals("The letter reads 'You Win! You must be very smart!'"); 
		
	}
	
	
	

}
