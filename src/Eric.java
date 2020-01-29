import java.util.HashMap;

public class Eric {
    public static HashMap<Integer, String> roomMap;
    static {
        roomMap = new HashMap<>();
        roomMap.put(1, "foyer");
        roomMap.put(2, "front room");
        roomMap.put(3, "library");
        roomMap.put(4, "kitchen");
        roomMap.put(5, "dining room");
        roomMap.put(6, "vault");
        roomMap.put(7, "parlor");
        roomMap.put(8, "secret room");

    }
    public static void main(String[] args) {
        System.out.println("Welcome to Zork!");
        foyer();
    }

    public static void foyer() {
        System.out.println("You are in the foyer.");
        System.out.print("What direction would you like? ");
        //System.out.println(roomMap.get(1));
    }
}
