import java.util.Scanner;

public class EvenChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        boolean isEven = isEven(number);
        System.out.println("Is the number even? " + isEven);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
