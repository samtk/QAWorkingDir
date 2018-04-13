
public abstract class Item {
	
	private static int id;
	private static int nextid;
	private boolean checkedOut;
	
	
	static {
		nextid = 1;
	}
	
	public Item() {
		id = nextid++;
		checkedOut = false;
	}
 
	public void changeCheckedOut(boolean check) {
		checkedOut = check;
	}
	
	public int getItemID() {
		return id;
	}
	
	public boolean isCheckedOut() {
		return checkedOut;
	}
	
	
	
	
}
