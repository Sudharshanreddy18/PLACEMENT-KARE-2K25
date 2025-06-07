

public class URLify {
    public static String urlify(String str) {
        return str.trim().replaceAll(" ", "%20");
    }

    public static void main(String[] args) {
        String input = "Mr John Smith    ";
        String output = urlify(input);
        System.out.println(output);
    }
}
