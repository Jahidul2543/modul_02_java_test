package problems;

public class FibonacciSeries {
    public static void main(String[] args) {
        int i = fibonacciSeries(100);
        System.out.println("i = " + i);
    }

    private static int fibonacciSeries(int n) {
        int first = 0;
        int second = 1;
        int sum = 0;
        if (n == 0) {
            return first;
        }
        for (int i = 2; i <= n; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }
        return second;


        /**
         * Write a function to find fibonacciSerie of 100
         * */
    }

}
