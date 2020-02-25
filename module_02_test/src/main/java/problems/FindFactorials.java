package problems;

public class FindFactorials {
    public int factorial(int n) {
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }

    /**
     * factorials of n n! = 1 * 2 * 3 * ......* n
     */

    public static void main(String[] args) {
    }
}
