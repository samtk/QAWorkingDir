import java.util.ArrayList;

public class intermediateExercise {
	
	public static void main(String[] args) {
		
		System.out.println(blackjack(4,22));
		/**
		System.out.println(uniqueSum(2,1,2));
		System.out.println(tooHot(93,false));
		
		PeopleManager pm = new PeopleManager();
		ArrayList people = pm.makePeople();
		pm.printPeople(people);
		Person[] temp = {null,null,null};
		people.toArray(temp);
		System.out.println(pm.findPerson(temp, "Batman"));
		*/
		
		/**
		Car newcar = new Car("wow", true,false, "car",4, "white", 4);
		Car newcar1 = new Car("wow", true,false, "car",4, "black", 4);
		Car newcar2 = new Car("wow", true,false, "car",4, "red", 4);
		Garage garage = new Garage();
		garage.addVehicle(newcar);
		garage.addVehicle(newcar2);
		System.out.println(garage.calculateTotalBill());*/
		
	}
	
	public static int blackjack(int a, int b) {
		if(a >= b) {
			if(a < 22) {
				return a;
			}
			if(b < 22) {
				return b;
			}
		}
		if(a < b) {
			if(b < 22) {
				return b;
			}
			if(a < 22) {
				return a;
			}
		}
		return 0;
	}
	
	
	

	public static int uniqueSum(int a, int b, int c) {
		int total = 0;
		if( a != b) {
			if (a != c) {
				total += a;
			}
			if(b != c) {
				total += b;
			}
		}
		if(c != a) {
			if(c != b) {
				total += c;
			}
		}	
		return total;	
	}
	
	
	
	public static boolean tooHot(int temperature, boolean issummer) {
		
		int upper = 90;
		if(issummer) upper = 100;
		if(temperature >= 60 && temperature <= upper) {
			return true;
			
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
}
