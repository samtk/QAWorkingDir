import java.util.HashMap;

public class QALibrary implements Library{
	
	private HashMap<Integer, Item> itemMap = new HashMap<Integer, Item>();
	private HashMap<Integer, Person> customerMap = new HashMap<Integer, Person>();

	public void checkOut(Item book) {
		itemMap.get(book.getItemID()).changeCheckedOut(true);
	}

	public void checkIn(Item book) {
		itemMap.get(book.getItemID()).changeCheckedOut(false);
		
	}

	public void addItem(Item book) {
		itemMap.put(book.getItemID(), book);		
	}

	public void removeItem(Item book) {
		itemMap.remove(book.getItemID());
		
	}

	public void updateItem(int id, Item book) {
		itemMap.put(id, book);
		
	}

	public void registerPerson(Person name) {
		customerMap.put(name.getID(), name);
	}

	public void deletePerson(Person name) {
		customerMap.remove(name.getID()); 
	}

	public void updatePerson(int id, Person name) {
		customerMap.put(id, name);
		
	}
	
	

}
