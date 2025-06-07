import java.util.HashSet;
import java.util.Scanner;

public class CountDistinctElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements separated by spaces:");
        String input = sc.nextLine();
        String[] elements = input.split(" ");
        HashSet<Integer> distinctElements = new HashSet<>();
        for (String element : elements) {
            distinctElements.add(Integer.parseInt(element));
        }
        System.out.println("Count of distinct elements: " + distinctElements.size());
        sc.close();
    }
}
