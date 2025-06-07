public class DiamondBorder {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        int space = n - 1;

        // Upper part of the diamond
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            space--;
            System.out.print("*");
            for (int j = 1; j < (i - 1) * 2; j++) {
                if (i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            if (i != 1) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the diamond
        space = 1;
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            space++;
            System.out.print("*");
            for (int j = 1; j < (i - 1) * 2; j++) {
                if (i == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            if (i != 1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
