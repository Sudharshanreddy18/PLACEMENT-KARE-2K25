import java.util.Arrays;
import java.util.Scanner;

public class RearrangeArrayAlternately {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        rearrange(arr, n);
        System.out.println("Rearranged array: " + Arrays.toString(arr));
    }
    public static void rearrange(int[] arr, int n) {
        Arrays.sort(arr);
        int[] result = new int[n];
        int left = 0, right = n - 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result[i] = arr[right--];
            } else {
                result[i] = arr[left++];
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = result[i];
        }
    }
}
