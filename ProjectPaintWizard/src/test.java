
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(numCheap(600));

	}
	
	public static int cheapoArea() {
		return 20*10;
	}
	
	public static int joesArea() {
		return 15*10;
	}

	public static int duluxourousArea() {
		return 10*20;
	}
	
	public static int numCheap(int area) {
		int num =  (area/cheapoArea())-1;
		if(area%cheapoArea() == 0) num+=1;
		return num;
	}
	
	public static int numJoe(int area) {
		return 0;
	}
	
	public static int numDulux(int area) {
		return 0;
	}

}
