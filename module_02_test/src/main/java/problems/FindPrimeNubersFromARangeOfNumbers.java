package problems;

import java.util.List;
import java.util.stream.Collectors;

public class FindPrimeNubersFromARangeOfNumbers {
    public boolean isPrime(int n) {
        if (n < 0) {
            return false;
        }
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public List<Integer> primeFromRange(List<Integer> numbers){
       return numbers.parallelStream().filter( s-> s > 0).filter(this::isPrime).collect(Collectors.toList());
    }

    public static void main(String[] args) {

    }
}
