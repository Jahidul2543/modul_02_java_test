package problems;

public class FindLeapyear {

    /**
     * All leap years are divisible by 4 except century years are divisible by 4 and 400
     * If century years are divisible by 4 but not divisible by 400 that will not be leap year
     *
     * */
    public static void main(String[] args) {
        findLeapyear(100);
    }

    private static void findLeapyear(int year) {


        
        if(year%4==0)
        {
            System.out.println("Leap Year");
        }
        else if(year%4==0 && year%400!=0)
        {
            System.out.println("Not a Leap Year");
        }
        else
        {
            System.out.println(" Leap Year");
        }

    }
}
