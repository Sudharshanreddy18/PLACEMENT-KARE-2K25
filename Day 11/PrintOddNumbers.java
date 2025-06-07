import java.util.Scanner;

public class PrintOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (1-500): ");
        int userInput = sc.nextInt();

        if (userInput >= 1 && userInput <= 500) {
            System.out.println("Odd numbers between 1 and " + userInput + ":");
            for (int i = 1; i <= userInput; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("Please enter a valid number between 1 and 50.");
        }
        sc.close();
    }
}
