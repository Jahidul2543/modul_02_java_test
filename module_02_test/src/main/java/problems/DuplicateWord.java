package problems;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void duplicateWord(String s) {
        if (s == null) {
            throw new IllegalArgumentException();
        }
        s = s.replace('.', ' ');
        String[] split = s.split("\\s+");
        int totalLength = 0;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < split.length; i++) {
            s = split[i];
            totalLength += s.length();
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        System.out.println("map = " + map);
        System.out.println("totalLength = " + totalLength);
    }

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        duplicateWord(st);

    }

}
