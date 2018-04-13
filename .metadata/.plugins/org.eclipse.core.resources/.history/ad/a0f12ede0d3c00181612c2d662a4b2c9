import java.util.ArrayList;

public class intermediateExercise {
	
	public static void main(String[] args) {
		/**
		System.out.println(blackjack(22,22));
		System.out.println(uniqueSum(2,1,2));
		System.out.println(tooHot(93,false));
		
		PeopleManager pm = new PeopleManager();
		ArrayList people = pm.makePeople();
		pm.printPeople(people);
		Person[] temp = {null,null,null};
		people.toArray(temp);
		System.out.println(pm.findPerson(temp, "Batman"));
		*/
		
		Car newcar = new Car("wow", true,false, "car",4, "white", 4);
		Car newcar1 = new Car("wow", true,false, "car",4, "black", 4);
		Car newcar2 = new Car("wow", true,false, "car",4, "red", 4);
		//System.out.println(newcar.getColor());
		Garage garage = new Garage();
		garage.addVehicle(newcar);
		garage.addVehicle(newcar2);
		//System.out.println(garage.getVehicle(0));
		//System.out.println(garage.getVehicle(0).getColor());
		//garage.removeVehicle(0);
		System.out.println(garage.calculateTotalBill());
		
	}
	
	public static int blackjack(int a, int b) {
		if(a>21) {
			if(b>21) {
				return 0;
			}
			return b;
		}
		if(b > 21) {
			if(a<21) {
				return 0;
			}
			return a;
		}
		if(a>=b) return a;
		return b;
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
