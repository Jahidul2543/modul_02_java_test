package problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
    	String s1= "ARMY";
    	String s2= "MARY";
    	Anagram.findAnagram(s1, s2);
    	System.out.println("Both String are Anagram" + " "+Anagram.findAnagram(s1, s2));
    	
    	
    }
    public static  boolean findAnagram(String word1 ,String word2){
    	char [] fromString1= word1.toCharArray();
    	char [] fromString2= word2.toCharArray();
    	
    	Arrays.sort(fromString1);
    	Arrays.sort(fromString2);
    	
    	
    	return Arrays.equals(fromString1, fromString2);
    }
}
