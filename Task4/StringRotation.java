

public class StringRotation {
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "deabc";
        
        boolean result = isRotation(str1, str2);
        System.out.println("Is rotation: " + result);
    }

    public static boolean isRotation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        String concatenated = str1 + str1;
        return concatenated.contains(str2);
    }
}
