public class hi {
    Node head;

    // Doubly linked list node class
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // Method to add a node at the end
    void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    public static void main(String[] args) {
        hi list = new hi();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        // You can add code here to print the list if needed
    }
}
