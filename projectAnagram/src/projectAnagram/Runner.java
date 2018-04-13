package projectAnagram;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Runner {

	public static void main(String[] args) {
		
		String filename = "C:\\Users\\Admin\\Desktop\\words.txt";
		System.out.println(mostAnagrams("qwe","asd",filename));
		

	}
	
	
	
	private static ArrayList<String> fileReader(String filename) {
		String line = null;
	    ArrayList<String> records = new ArrayList<String>();
		try {
			BufferedReader bf = new BufferedReader(new FileReader(filename));
			while((line=bf.readLine()) != null) {
				records.add(line);
			}
			bf.close();
			System.out.println("Read success");
		} 
		catch(IOException io) {
			io.printStackTrace();
		}
		return records;	
	}
	
	
	
	private static String sortString(String word) {
		String tempword = "";
		char[] split = word.toCharArray();
		Arrays.sort(split);
		for(char c : split) {
			tempword += c;
		}
		return tempword;
	}
	
	
	private static HashMap<String, Integer> makeAnagramHashMap(String filename){
		
		HashMap<String, Integer> anagrams = new HashMap<String, Integer>();
		for(String word : fileReader(filename)) {
			word = sortString(word);
			if(!anagrams.containsKey(word)) {
				anagrams.put(word, 0);
			}
			else {
				int num = anagrams.get(word) + 1;
				anagrams.put(word, num);
			}
		}
		
		return anagrams;
	}
	
	public static String mostAnagrams(String word1, String word2, String filename) {
		HashMap<String, Integer> anagrams = makeAnagramHashMap(filename);
		
		if(anagrams.containsKey(sortString(word1))) {
			if(anagrams.containsKey(sortString(word2))) {
				System.out.println("got here");
				int w1 = anagrams.get(sortString(word1));
				int w2 = anagrams.get(sortString(word2));
				if(w1 > w2) return word1;
				if(w2 > w1) return word2;
				if(w2 == w1) {
					if(word1.length() > word2.length()) return word1;
					if(word2.length() > word1.length()) return word2;
					if(word2.length() == word1.length()) return word1 +" " +word2;
				}
			}
			return word1;
		}
		if(anagrams.containsKey(sortString(word2))) {
			return word2;
		}
		
		return "";
	}
	
	

}
