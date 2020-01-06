package problems;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindPrimeNubersFromARangeOfNumbers {
        public  static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number till which the prime numbers are to be calculated: ");
            int input = scanner.nextInt();
            List<Integer> primes = new ArrayList();

            for (int i = 2; i < input; i++) {
                boolean isPrimeNumber = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrimeNumber = false;
                        break;
                    }
                }
                if (isPrimeNumber) {
                    primes.add(i);
                }
            }
            System.out.println("The number of prime is: " + primes.size() + ", and they are: " + primes.toString());
        }
    }
