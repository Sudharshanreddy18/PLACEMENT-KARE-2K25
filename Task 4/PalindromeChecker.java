

public class PalindromeChecker {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal, Panama";
        boolean isPalindrome = checkPalindrome(input);
        System.out.println("Is the input a palindrome? " + isPalindrome);
    }

    public static boolean checkPalindrome(String str) {
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
}
