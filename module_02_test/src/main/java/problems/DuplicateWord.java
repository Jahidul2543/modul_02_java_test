package problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        DuplicateWord.findDuplicateWord(st);
    }
public static void findDuplicateWord(String inputString) {
	String words[]  =inputString.split(" ");
	
	Map<String, Integer> wordCount = new HashMap<String, Integer>();
	
	for(String word : words) {
		
		if(wordCount.containsKey(word)) {
			wordCount.put(word.toLowerCase(), wordCount.get(word)+1);
		}
		else {
			wordCount.put(word, 1);
		}
	}
	Set<String> wordInString =wordCount.keySet();
	for(String word :wordInString) {
		if(wordCount.get(word)>1) {
			System.out.println(word + " :"+ wordCount.get(word));
		}
	}
	
}
}
