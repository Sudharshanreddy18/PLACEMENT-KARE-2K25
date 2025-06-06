public class Modifier {

public String publictmessage = "I am Public access anywhere Accesible";
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
}