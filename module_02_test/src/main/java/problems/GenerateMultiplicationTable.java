package problems;

public class GenerateMultiplicationTable {
    public static void main(String[] args) {
        int size = 9;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " x "+i+" = " + i*j);
                System.out.print("    ");
            }
            System.out.println();

        }

    }
}
