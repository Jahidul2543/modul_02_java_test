package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.List;

public class FindMaxValueFromaAnArray {
    public  int findMax(int[] arr){
       return Arrays.stream(arr).max().orElseThrow(IllegalArgumentException::new );
    }
    public static void main(String[] args) {

    }

}
