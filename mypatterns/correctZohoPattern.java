package mypatterns;

public class correctZohoPattern {
    public static void main(String[] args) {
        int n = 5;
        int x = n;
        int z = 0;

        for (int i = n; i >= 1; i--) {
            int num = x;
            int m = n;

            // Print leading spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" \t");
            }

            // Print numbers
            for (int j = n; j >= i; j--) {
                System.out.print(num + "\t");
                if (j == n) {
                    z = num;
                }
                num = num - m;
                m--;
            }

            x = z + i - 1;
            System.out.println();
        }
    }
}



