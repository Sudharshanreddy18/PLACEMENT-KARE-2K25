import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input First Array
        int size1 = sc.nextInt();
        if (size1 <= 0) {
            System.out.println("Invalid Array Size.");
            return;
        }

        int[] arr1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input Second Array
        int size2 = sc.nextInt();
        if (size2 <= 0) {
            System.out.println("Invalid Array Size.");
            return;
        }

        int[] arr2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Brute-force sum of same-position values
        int maxLength = Math.max(size1, size2);
        for (int i = 0; i < maxLength; i++) {
            int val1 = (i < size1) ? arr1[i] : 0;
            int val2 = (i < size2) ? arr2[i] : 0;
            System.out.print((val1 + val2) + " ");
        }

        
    }
}