import java.util.*;
class order {
    String OrderID;
    String CustomerName;
    public order(String OrderID, String CustomerName) {
        this.OrderID = OrderID;
        this.CustomerName = CustomerName;
    }
}
public class fooddeliveryapp {
    public static void main(String[] args) {
        Queue<order> orderqueue = new LinkedList<>();
        orderqueue.add(new order("ORD101", "Sai Kumar"));
        orderqueue.add(new order("ORD102", "Iliyas"));
        orderqueue.add(new order("ORD103", "Rana Saketh"));
        orderqueue.add(new order("ORD104", "Anantha Sai"));
        while (!orderqueue.isEmpty()) {
            order currentOrder = orderqueue.poll();
            System.out.println("Processing Order ID: " + currentOrder.OrderID + ", Customer Name: " + currentOrder.CustomerName);
            for (int i = 0; i < 3; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Order processing interrupted");
                }
                System.out.println("Order ID: " + currentOrder.OrderID + " is being processed...");
            }
            }
        }
}