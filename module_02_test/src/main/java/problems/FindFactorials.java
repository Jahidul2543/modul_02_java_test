package problems;
import java.util.Scanner;
public class FindFactorials {
    /**
     * factorials of n n! = 1 * 2 * 3 * ......* n
     * */

    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the number  ");
                int n = scanner.nextInt();
                int result = factorial(n);
                System.out.println("The factorial of " + n + " is " + result);
            }

            public static int factorial(int n) {
                int result = 1;
                for (int i = 1; i <= n; i++) {
                    result = result * i;
                }
                return result;
            }
        }

