import java.util.HashSet;

public class SubstringCounter {
    public static void main(String[] args) {
        String input = "ababa";
        countSubstrings(input);
    }

    public static void countSubstrings(String str) {
        HashSet<String> substrings = new HashSet<>();
        int n = str.length();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    substrings.add(str.substring(i, j + 1));
                }
            }
        }

        for (String substring : substrings) {
            System.out.println(substring);
        }
    }
}
