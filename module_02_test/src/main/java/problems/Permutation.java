package problems;

import java.util.List;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {
    public void permutation(String str, int l, int r, List<String> ans) {
        if (l == r) {
            ans.add(str);

        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permutation(str, l + 1, r, ans);
                str = swap(str, l, i);
            }
        }
    }

    private String swap(String str, int i, int j) {
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }


    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
    }
}
