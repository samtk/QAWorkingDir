import java.util.ArrayList;

public class PeopleManager {

	public Person findPerson(Person[] people, String name) {
		for(Person p : people) {
			if(p.getName().equals(name)) {
				return p;
			}
		}
		return null;
	}
	
	
	public void printPeople(ArrayList<Person> people) {
		for(Person guy : people) {
			System.out.println(guy.toString());
		}
	}
	
	
	public ArrayList<Person> makePeople(){
		ArrayList<Person> people = new ArrayList<Person>();
		
		Person sam = new Person("Sam", "Cloud Engineer", 22);
		Person james = new Person("James", "Game programmer", 27);
		Person batman = new Person("Batman", "Super hero", 35); 
		people.add(sam);
		people.add(james);
		people.add(batman);
		
		return people;
	} 
	
	
	
}
