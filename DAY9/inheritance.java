// single level inheritance
class math{
    void formula(){
        System.out.println("(A+B)^2 = A^2 + 2AB + B^2");
    }
}
class chemistry extends math {

    void display() {
        System.out.println("nothing");
    }

    void physics() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
// class botany{

// }
// class zoology extends botany {
// }
public class inheritance {
    public static void main(String[] args) {
        chemistry ch = new chemistry();
        ch.formula();
        ch.display();
    }
}
