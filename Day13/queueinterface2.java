import java.util.PriorityQueue;
public class queueinterface2 {
    public static void main(String[] args) {
        PriorityQueue<Integer>queue=new PriorityQueue<>();
        queue.add(9);
        queue.offer(6);
        System.out.println(queue);
        System.out.println("The remove element is:" +queue.remove());
        System.out.println("The head element is:" +queue.element());
    }
}
