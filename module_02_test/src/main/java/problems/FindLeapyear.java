
package problems;
import java.util.Scanner;
public class FindLeapyear {

    /**
     * All leap years are divisible by 4 except century years are divisible by 4 and 400
     * If century years are divisible by 4 but not divisible by 400 that will not be leap year
     *
     * */
    public static void main(String[] args) {
        findLeapyear(55);
    }

    private static void findLeapyear(int year) {
        year=2008;
        boolean isLeap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            }
            else
                isLeap = true;
        }
        else {
            isLeap = false;
        }

        if(isLeap==true)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");
    }
}

