package problems;

public class Palindrome {
    public static void main(String[] args) {
        /**
         *If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
         * Palindrome. So write java code to check if a given String is Palindrome or not.
         *
         **/
        Palindrome obj1=new Palindrome();
        System.out.println(obj1.isPalindrome("mom"));
    }

    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
