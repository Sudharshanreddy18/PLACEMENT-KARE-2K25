import java.util.*;
public class Queue_4 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i <= 10; i++) {
            q.add(i);
        }
        Iterator<Integer> itr = q.iterator();
        while (itr.hasNext()){
        if (q.peek()%2 == 0){
            System.out.println(q.poll());
        }
        else q.poll();
    }
}
}