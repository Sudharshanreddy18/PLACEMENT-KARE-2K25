import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeaderElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the array separated by spaces:");
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        int[] arr = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            arr[i] = Integer.parseInt(inputArray[i]);
        }
        List<Integer> leaders = findLeaders(arr);
        System.out.println("Leader elements: " + leaders);
    }
    public static List<Integer> findLeaders(int[] arr) {
        List<Integer> leaders = new ArrayList<>();
        int maxFromRight = arr[arr.length - 1];
        leaders.add(maxFromRight);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                leaders.add(maxFromRight);
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = leaders.size() - 1; i >= 0; i--) {
            result.add(leaders.get(i));
        }
        return result;
    }
}
