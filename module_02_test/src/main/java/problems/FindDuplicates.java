package problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {
    public void removeDuplicates(int[] arr) {
        int j = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.add(i)) {
                arr[j++] = arr[i];
            }
        }

    }


    /**
     * Write Code To Filter Duplicate Elements From An Array?
     */


    public static void main(String[] args) {

    }
}
