
public class Runner {

	public static void main(String[] args) {
		
	}
	
	public static void lcs(String word1, String word2) {
		String lastseq = "";
		String seq = "";
		char[] w1 = word1.toCharArray();
		char[] w2 = word2.toCharArray();
		for(int i = 0; i < word1.length(); i++) {
			
			for(int j = 0; j < word2.length(); j++) {
				if(w1[i] == w2[i]) {
					seq += w1[i];
				}
				else {
					if(seq.length() > lastseq.length()) {
						
					}
				}
				
			}
		}
	}

}















































