package problems;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) == s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        /**
         *If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
         * Palindrome. So write java code to check if a given String is Palindrome or not.
         *
         **/

    }
}
