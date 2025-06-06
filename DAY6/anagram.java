import java.lang.reflect.Array;
import java.util.Scanner;

public class anagram {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first String: ");
    String str1 = sc.nextLine();
    System.out.print("Enter second String: ");
    String str2 = sc.nextLine();
    if (str1.length() == str2.length()) {
      Array.sort(arr1);
      Array.sort(arr2);
    }
    char[] arr1 = str1.toCharArray();
    char[] arr2 = str2.toCharArray();

    sc.close();
  }
}

