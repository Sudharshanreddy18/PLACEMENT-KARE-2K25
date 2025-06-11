import java.util.*;
public class queque {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        String[] input = {"a", "b", "c", "d"};
        for (String str : input) {
            queue.offer(str);
        }
        while (!queue.isEmpty()) {
            String element = queue.poll();
            System.out.print(element + " " + element + " ");
        }
        System.out.println("null");
    }
}