import java.util.HashMap;
import java.util.Scanner;

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
        Scanner input = new Scanner(System.in);
        foyer(input);

    }

    public static void foyer(Scanner input) {
        System.out.println("You are in the " + roomMap.get(1));
        System.out.print("What direction do you want to go (N, S, E, W)? ");
        String direction = input.next();
        switch (direction) {
            case "N":
                System.out.println("N");
                frontRoom(direction);
            default:
                System.out.println("GG");
                break;
        }
    }

    public static void frontRoom(Scanner input) {

    }
}
