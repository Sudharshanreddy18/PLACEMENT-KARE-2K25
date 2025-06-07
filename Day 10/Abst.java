abstract class service{
    int a = 10;
    void settings(){
        System.out.println(a);
    }
    abstract void profile();
}
class pavi extends service {
    void profile() {
        System.out.println("I love You");
    }
}
public class Abst {
    public static void main(String[] args) {
        pavi p = new pavi();
        p.settings();
        p.profile();
    }
}
