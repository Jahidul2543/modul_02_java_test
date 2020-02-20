package problems;

public class InvertString {
    public static String invert(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    /**
     * Invert a String without using String default reverse() method
     */


    public static void main(String[] args) {

    }
}
