// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         // Read array size
//         int N = sc.nextInt();
        
//         // Validate array size (must be greater than 0)
//         if (N <= 0) {
//             System.out.println("Invalid Array Size.");
//             return;
//         }
        
//         // Read array elements
//         int[] arr = new int[N];
//         for (int i = 0; i < N; i++) {
//             arr[i] = sc.nextInt();
//         }
        
//         // Read key value
//         int K = sc.nextInt();
        
//         // Validate key value (must be greater than 0)
//         if (K <= 0) {
//             System.out.println("Invalid Key Value!");
//             return;
//         }
        
//         // Find pairs that sum to K
//         boolean pairFound = false;
//         for (int i = 0; i < N; i++) {
//             for (int j = i + 1; j < N; j++) {
//                 if (arr[i] + arr[j] == K) {
//                     System.out.println(arr[i] + " " + arr[j]);
//                     pairFound = true;
//                 }
//             }
//         }
        
//         // If no pairs are found, print the message
//         if (!pairFound) {
//             System.out.println("PAIRS are not available which are Equal to Given Key Value");
//         }
        
//         sc.close();
//     }
// }
import java.util.Scanner;

public class main {
    public static main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read array size
        int N = sc.nextInt();
        
        // Validate array size (must be between 1 and 10)
        if (N < 1 || N > 10) {
            System.out.println("Invalid Array Size.");
            return;
        }
        
        // Read array elements
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Read key value (index)
        int K = sc.nextInt();
        
        // Validate key value (must be between 0 and N-1)
        if (K < 0 || K >= N) {
            System.out.println("Invalid Key Value.");
            return;
        }
        
        // Calculate sum up to index K
        int sum = 0;
        for (int i = 0; i <= K; i++) {
            sum += arr[i];
        }
        
        // Print the sum
        System.out.println(sum);
        
        sc.close();
    }
}