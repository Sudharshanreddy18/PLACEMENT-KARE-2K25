

import java.util.HashSet;

public class UniqueCharacterChecker {
    public static void main(String[] args) {
        String input = "abcdefg";
        boolean result = hasAllUniqueCharacters(input);
        System.out.println("Does the string have all unique characters? " + result);
    }

    public static boolean hasAllUniqueCharacters(String str) {
        HashSet<Character> charSet = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (!charSet.add(c)) {
                return false;
            }
        }
        return true;
    }
}
