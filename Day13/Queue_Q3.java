\import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Q3 {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();
        q.offer(1);
        q.offer(2);
        q.offer(20);
        q.offer(69);
        Object arr[] = q.toArray();
        for (Object a :arr){
            System.out.println(a);
        }
    
    }
    
}