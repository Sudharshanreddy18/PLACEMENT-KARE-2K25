import java.util.HashMap;

public class SmallestWindow {
    public static void main(String[] args) {
        String str = "ADOBECODEBANC";
        String pattern = "ABC";
        System.out.println("Smallest window: " + findSmallestWindow(str, pattern));
    }

    public static String findSmallestWindow(String str, String pattern) {
        if (str.length() < pattern.length()) {
            return "";
        }

        HashMap<Character, Integer> patternMap = new HashMap<>();
        for (char c : pattern.toCharArray()) {
            patternMap.put(c, patternMap.getOrDefault(c, 0) + 1);
        }

        int start = 0, minLength = Integer.MAX_VALUE, minStart = 0, count = 0;
        HashMap<Character, Integer> strMap = new HashMap<>();

        for (int end = 0; end < str.length(); end++) {
            char endChar = str.charAt(end);
            strMap.put(endChar, strMap.getOrDefault(endChar, 0) + 1);

            if (patternMap.containsKey(endChar) && strMap.get(endChar).intValue() <= patternMap.get(endChar).intValue()) {
                count++;
            }

            while (count == pattern.length()) {
                if (minLength > end - start + 1) {
                    minLength = end - start + 1;
                    minStart = start;
                }

                char startChar = str.charAt(start);
                strMap.put(startChar, strMap.get(startChar) - 1);
                if (patternMap.containsKey(startChar) && strMap.get(startChar).intValue() < patternMap.get(startChar).intValue()) {
                    count--;
                }
                start++;
            }
        }

        return minLength == Integer.MAX_VALUE ? "" : str.substring(minStart, minStart + minLength);
    }
}
