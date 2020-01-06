package problems;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {
    public static void main(String[] args) {
    	FibonacciSeries.fibonacciSeries(100); 
    }

    private static void fibonacciSeries(int n) {

    /**
     * Write a function to find fibonacciSerie of 100
     * */
    	
    	int n1 =0;
    	int n2 = 1;
    	
    	for (int i = 1; i<= n ; i++) {
    		System.out.println(n1 +" ");
    		int sum = n1+n2;
    		n1= n2;
    		n2 =sum;
    		
    	}
    	
    	
    }

}
