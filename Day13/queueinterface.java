    import java.util.PriorityQueue;
    import java.util.Queue;
    public class queueinterface {
        public static void main(String[] args) {
            Queue<Integer> queue = new PriorityQueue<>();    //Integer in between brackets
            queue.offer(4);
            queue.offer(69);
            queue.offer(143);
            queue.add(96);
            queue.add(20);
            System.out.println(queue);
            System.out.println("The removed element is:" +queue.poll());
            System.out.println(queue);
            System.out.println("The head is:" +queue.peek());
        }
    }
