

import java.util.HashMap;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            if (charIndexMap.containsKey(s.charAt(i))) {
                start = Math.max(start, charIndexMap.get(s.charAt(i)) + 1);
            }
            charIndexMap.put(s.charAt(i), i);
            maxLength = Math.max(maxLength, i - start + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        int result = lengthOfLongestSubstring(input);
        System.out.println("Length of the longest substring without repeating characters: " + result);
    }
}
