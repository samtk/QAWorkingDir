import java.util.ArrayList;

public class Player {
	
	private ArrayList<Treasure> inventory;
	private int xcoord;
	private int ycoord; 
	
	public Player(int xcoord, int ycoord) {
		this.xcoord = xcoord;
		this.ycoord = ycoord;
				
		
	}
	
	public int getPlayerXCoord() {
		return xcoord;
	}
	
	public int getPlayerYCoord() {
		return ycoord;
	}
	
	public String look() {
		return "";
	}
	
	public void pickUp() {
		
	}
	
	public void use(String item) {
		
	}
	
	public void movePlayer(int xcoord, int ycoord) {
		this.xcoord = xcoord;
		this.ycoord = ycoord;
		
	}
	
	
	public String checkInventory() {
		return "";
	}

}
