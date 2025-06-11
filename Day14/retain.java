import java.util.*;

public class retain {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("Sudharshan9922005301");
        set1.add("Pavithra9922005055");
        set1.add("Rishi9922005289");
        set1.add("Praneetha9922005298");

        Set<String> set2 = new HashSet<>();
        set2.add("Rishi9922005289");
        set2.add("Praneetha9922005298");
        set1.retainAll(set2);

        System.out.println(set1);
    }
}
