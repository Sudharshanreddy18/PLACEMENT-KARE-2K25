

public class CharacterCounter {
    public static void main(String[] args) {
        String inputString = "Hello, World!";
        char characterToCount = 'o';
        int count = countCharacterOccurrences(inputString, characterToCount);
        System.out.println("The character '" + characterToCount + "' occurs " + count + " times.");
    }

    public static int countCharacterOccurrences(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
