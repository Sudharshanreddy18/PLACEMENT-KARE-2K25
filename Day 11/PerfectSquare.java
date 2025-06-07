import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        boolean isPerfectSquare = isPerfectSquare(number);
        System.out.println("Is " + number + " a perfect square? " + isPerfectSquare);
    }

    public static boolean isPerfectSquare(int num) {
        if (num < 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(num);
        return (sqrt * sqrt) == num;
    }
}
