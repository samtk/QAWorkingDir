
public class Parameter {
	
	public void main() {
		//itteration(3);
	}
	
	public int parameter(int a, int b, boolean bool) {
		if((a == 0 && b != 0)) return b;
		if (a == 0 && b != 0) return a;
		if(bool) return a + b;
		else return a * b;
	}
	
	public void itteration(int i) {
		for (; i < 10; i++) {
			System.out.println(parameter(i,5, true));
		}
		
	}
	
	

}
