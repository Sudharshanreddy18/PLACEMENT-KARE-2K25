import java.util.Scanner;

public class MinutesToHours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int minutes = sc.nextInt();
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        System.out.println(minutes + " minutes is " + hours + " hours and " + remainingMinutes + " minutes.");
    }
}
