package problems;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {
    public static void main(String[] args) {
        fibonacciSeries(100);
    }

    private static void fibonacciSeries(int n) {

    /**
     * Write a function to find fibonacciSerie of 100
     * */
        int maxNumber = 100;
        int pNumber = 0;
        int nNumber = 1;

        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");

        for (int i = 1; i <= maxNumber; ++i)
        {
            System.out.print(pNumber+" ");
            int sum = pNumber + nNumber;
            pNumber = nNumber;
            nNumber = sum;
        }

    }

}


