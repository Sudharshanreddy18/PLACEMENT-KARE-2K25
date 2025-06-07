import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class KthLargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();
        Integer[] array = new Integer[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        System.out.println("Enter the value of K:");
        int k = scanner.nextInt();
        
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("The " + k + "th largest element is: " + array[k - 1]);
        
        scanner.close();
    }
}
