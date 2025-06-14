
import java.util.HashMap;
import java.util.Map;


public class Players {
    public static void main(String[] args) {
        Map <Integer, String> player = new HashMap<>();
        Map <Integer, String> jersey = new HashMap<>();

        player.put(69,"Iliyas" );
        player.put(98,"Rishi" );
        player.put(71,"VigneshSpanda" );
        player.put(16,"Saathwik" );
    //     jersey.putAll(player);
    //     jersey.putIfAbsent(17, "var");

    //     System.out.println("Player and Jersey"+ player);
    //     System.out.println("Player and Jersey" + jersey);
            // System.out.println(player.getOrDefault(69, "Iliyas"));
            // player.remove(69);
            // player.remove(77, "Iliyas");
            // System.out.println(player);
            System.out.println(player.containsKey(69));
            System.out.println(player.containsValue("Kanna"));
            System.out.println(player.keySet());
            System.out.println(player.values());
    }
}
