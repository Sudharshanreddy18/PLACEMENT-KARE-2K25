interface hr{
    int a = 10;
    void display();
}
interface finance{
    void budget();
}
interface operations{
    void SOP();
}
class Legal_Office{
    void Law(){
    System.out.println("Indian Law");
}
class office implements hr, finance, operations {
    //class office extends Legal_Office implements hr, finance, operations {
    public void display() {
        System.out.println("This ia a data member "+a);
    }
    
    public void budget() {
        System.out.println("Budget from finance");
    }
    
    public void SOP() {
        System.out.println("Standing operating procedure from operations");
    }
}





public class mutlti {
    public static void main(String[] args) {
        office o = new office();
        o.display();
        o.budget();
        o.SOP();
    }
}
