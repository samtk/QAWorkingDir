
public class Treasure {
	
	private int ycoord;
	private int xcoord;
	
	private String name;
	private String description;
	
	public Treasure(int xcoord, int ycoord, String name, String description){
		this.ycoord = ycoord;
		this.xcoord = xcoord;
		this.name = name;
		this.description = description;
	}
	
	public int getXCoord() {
		return this.xcoord;
	}
	
	public int getYCoord() {
		return this.ycoord;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}

}
