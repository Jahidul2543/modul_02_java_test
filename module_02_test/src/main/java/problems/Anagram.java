package problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        Anagram obj1=new Anagram();
        obj1.findAnagram("apple","elppa");
        obj1.findAnagram("pakistan","america");
    }

    // find whether this word is anagram or not
        static void findAnagram(String str1, String str2) {
            String s1 = str1.replaceAll("\\s", "");
            String s2 = str2.replaceAll("\\s", "");
            boolean status = true;
            if (s1.length() != s2.length()) {
                status = false;
            } else {
                char[] ArrayS1 = s1.toLowerCase().toCharArray();
                char[] ArrayS2 = s2.toLowerCase().toCharArray();
                Arrays.sort(ArrayS1);
                Arrays.sort(ArrayS2);
                status = Arrays.equals(ArrayS1, ArrayS2);
            }
            if (status) {
                System.out.println(s1 + " and " + s2 + " are anagrams");
            } else {
                System.out.println(s1 + " and " + s2 + " are not anagrams");
            }
        }
}
