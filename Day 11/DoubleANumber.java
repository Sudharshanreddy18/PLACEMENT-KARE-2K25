// Double a Number

import java.util.Scanner;

public class DoubleANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        int doubled = number * 2;
        System.out.println("The double of " + number + " is " + doubled);
        sc.close();
    }
}
