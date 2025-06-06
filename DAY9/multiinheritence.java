// multi level inheritance
class math{
    void formula(){
        System.out.println("(A+B)^2 = A^2 + 2AB + B^2");
    }
}
class chemistry extends math {

    void display() {
        System.out.println("nothing");
    }
}
class physics extends math{
    void show(){
        System.out.println("access");
    }

    physics() {
    }
}
public class multiinheritence {
    public static void main(String[] args) {
        //chemistry ch = new chemistry();
        physics ch = new physics();
        ch.display();
        ch.formula();
        ch.show();
    }
}
