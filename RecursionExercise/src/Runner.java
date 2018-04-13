
public class Runner {

	public static void main(String[] args) {

		System.out.println(addHyphen("zzzzzz"));
	    System.out.println(addHyphen("hello"));
		System.out.println(addHyphen("oozzzaaauusadkjjaaaldfioo"));
		
		
	}
	
	
	
	public static String addHyphen(String word) {
		if(word.length() == 1) return word;
		String w1 = addHyphen(word.substring(0, word.length()/2));
		String w2 = addHyphen(word.substring(word.length()/2, word.length()));
		if(w1.substring(w1.length()-1, w1.length()).equals(w2.substring(0,1))) {
			return w1 + "-" + w2;
		}
		return w1+w2;
	}

}
