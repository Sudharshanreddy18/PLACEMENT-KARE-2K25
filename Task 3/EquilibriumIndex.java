import java.util.Scanner;

public class EquilibriumIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the elements of the array separated by spaces: ");
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        int[] arr = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            arr[i] = Integer.parseInt(inputArray[i]);
        }

        int equilibriumIndex = findEquilibriumIndex(arr);
        System.out.println("Equilibrium Index: " + equilibriumIndex);
    }

    public static int findEquilibriumIndex(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i];
            if (leftSum == totalSum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1; // No equilibrium index found
    }
}
