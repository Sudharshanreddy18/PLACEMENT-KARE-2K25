import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        // Input array elements from user
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int sum = 0;

        // Calculate sum of array elements
        for (int i = 0; i < n; i++) {
            sum = sum + numbers[i];
        }

        System.out.println("Sum of array elements: " + sum);

        sc.close();
    }
}