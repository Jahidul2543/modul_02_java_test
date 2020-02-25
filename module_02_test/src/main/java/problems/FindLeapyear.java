package problems;

public class FindLeapyear {

    /**
     * All leap years are divisible by 4 except century years are divisible by 4 and 400
     * If century years are divisible by 4 but not divisible by 400 that will not be leap year
     */
    public static void main(String[] args) {
    }

    private static boolean findLeapyear(int year) {
        return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));


    }
}
