public class StringProcessor {
    public static void main(String[] args) {
        String input = "Hello, World! 123";
        String result = convertString(input);
        System.out.println(result);
    }

    public static String convertString(String input) {
        return input.toLowerCase().replaceAll("[^a-z]", "");
    }
}
