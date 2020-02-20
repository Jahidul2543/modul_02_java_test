package problems;

public class FibonacciSeries {
    public static void main(String[] args) {
        int i = fibonacciSeries(100);
        System.out.println("i = " + i);
    }

    private static int fibonacciSeries(int n) {
        int first = 1;
        int second = 1;
        int sum = 1;
        for (int i = 1; i < n; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }
        return sum;


        /**
         * Write a function to find fibonacciSerie of 100
         * */
    }

}
