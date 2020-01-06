package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindMaxValueFromaAnArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[] decMax = {788,987,5667,55,45,43,67};


        //finds the highest value
        double max = decMax[0];

        for (int counter = 1; counter < decMax.length; counter++)
        {
            if (decMax[counter] > max)
            {
                max = decMax[counter];
                System.out.println("The highest value is " + max);
            }

        }
    }
}


