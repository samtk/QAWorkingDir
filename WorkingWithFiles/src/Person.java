
public class Person {
	private String name, occupation;
	private int age;
	
	Person(String name, String occupation, int age){
		this.age = age;
		this.name = name;
		this.occupation = occupation;
	}
	
	public String toString() {
		return this.name + "," + this.occupation + "," + this.age;
	}
	
	
	
}