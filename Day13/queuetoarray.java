import java.util.*;

public class queuetoarray {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        Integer[] array = queue.toArray(new Integer[0]);
        System.out.println("Elements in the array:");
        for (int num : array) {
            System.out.println(num);
        }
    }
}