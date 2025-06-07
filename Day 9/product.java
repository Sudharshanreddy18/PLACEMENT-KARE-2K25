public class product {
    private String name;
    private double price;            //Att
    private int quantity;

    public product(String name, double price, int quantity) {
        // Const
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }

    public static void main(String[] args) {
        //Main
        product p = new product("Iphone 16 Pro Max", 150000, 1);
        p.display();
    }
}
9