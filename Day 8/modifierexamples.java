class Defaultclass {
    String defaultmessage = "I am default access within the package";
}
public class modifierexamples {
    public String publictmessage = "I am Public access anywhere accesible";
    private String privatetmessage = "I am private access within the class";
    private void displayprivate() {
        System.out.println(privatetmessage);
    }
    Defaultclass dc = new Defaultclass();
    public void displayall() {
        System.out.println(dc.defaultmessage);
        System.out.println(publictmessage);
        displayprivate();
    }
    public static void main(String[] args) {
        modifierexamples access = new modifierexamples();
        access.displayall();
    }
}