// import java.util.Scanner;

// public class FindMissingNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the numbers separated by spaces: ");
//         String input = sc.nextLine();
//         String[] inputArray = input.split(" ");
//         int n = inputArray.length + 1;
//         boolean[] present = new boolean[n + 1];
//         for (String num : inputArray) {
//             present[Integer.parseInt(num)] = true;
//         }
//         for (int i = 1; i <= n; i++) {
//             if (!present[i]) {
//                 System.out.println("Missing number: " + i);
//                 break;
//             }
//         }
//         sc.close();
//     }
// }
// /// second method
// /// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

// public class FindMissingNumber {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter numbers separated by spaces (e.g., 1 2 3 5):");
//         String input = scanner.nextLine();
//         String[] inputArray = input.split(" ");
//         List<Integer> numbers = new ArrayList<>();

//         for (String num : inputArray) {
//             numbers.add(Integer.parseInt(num));
//         }

//         int n = numbers.size() + 1;
//         List<Integer> missingNumbers = new ArrayList<>();

//         for (int i = 1; i <= n; i++) {
//             if (!numbers.contains(i)) {
//                 missingNumbers.add(i);
//             }
//         }

//         System.out.println("Missing numbers: " + missingNumbers);
//         scanner.close();
//     }
// }
