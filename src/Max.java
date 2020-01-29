import java.util.*;

public class Max {

    static HashMap<Integer, String> roomNames = new HashMap<>();
    static HashMap<Integer, String> roomContains = new HashMap<>();
    static HashMap<Integer, String> roomDirections = new HashMap<>();

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        roomNames.put(1, "foyer");
        roomNames.put(2, "front room");
        roomNames.put(3, "library");
        roomNames.put(4, "kitchen");
        roomNames.put(5, "dining room");
        roomNames.put(6, "vault");
        roomNames.put(7, "parlor");
        roomNames.put(8, "secret room");

        roomContains.put(1, "dead scorpion");
        roomContains.put(2, "piano");
        roomContains.put(3, "spider");
        roomContains.put(4, "bats");
        roomContains.put(5, "dust, empty box");
        roomContains.put(6, "3 walking skeletons");
        roomContains.put(7, "treasure chest");
        roomContains.put(8, "piles of gold");

        roomDirections.put(1, "North");
        roomDirections.put(2, "South, West, or East");
        roomDirections.put(3, "East or North");
        roomDirections.put(4, "West or North");
        roomDirections.put(5, "South");
        roomDirections.put(6, "East");
        roomDirections.put(7, "West or South");
        roomDirections.put(8, "West");

        Scanner sc = new Scanner(System.in);
//////////////////////////////////////////////////////////////////////////

        welcome();
        foyer();
//        room(1);
//        String direction = getDirection();
//        switch (direction){
//            case "N": room(1);
//            case "S": room(2);
//            case "E": room(6);
//            case "W": room(4);
//
//            default:
//                System.out.println("Invalid input");
//                getDirection();
//        }


    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void welcome(){
        System.out.println("Welcome to CASTLE ZORK");
        System.out.println("Search the castle rooms to find the hidden treasure!");
        System.out.println();
        //System.out.println("Press ENTER to the castle and begin");
    }

    public static String getDirection(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Which direction will you take? (N,S,E,W, or Q to quit) ");
        return sc.next();
    }

    public static void room(int x){
        System.out.println();
        System.out.println("You have entered the "+roomNames.get(x));
        System.out.println("This room contains: "+roomContains.get(x));
        System.out.println("Door directions: "+roomDirections.get(x));
        System.out.println();
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void foyer(){
        System.out.println();
        System.out.println("You have entered the foyer.");
        System.out.println("This room contains: "+roomContains.get(1));
        System.out.println("Door directions: "+roomDirections.get(1));
        System.out.println();

        String direction = getDirection();
        switch (direction){
            case "N": frontRoom();
            default:
                System.out.println("Invalid input");
                getDirection();
        }
    }

    public static void frontRoom(){
        System.out.println();
        System.out.println("You have entered the front room.");
        System.out.println("This room contains: "+roomContains.get(2));
        System.out.println("Door directions: "+roomDirections.get(2));
        System.out.println();

        String direction = getDirection();
        switch (direction) {
            case "S": foyer();
            case "W": library();
            case "E": kitchen();
            default:
                System.out.println("Invalid input");
                getDirection();
        }
    }

    public static void library(){
        System.out.println();
        System.out.println("You have entered the library.");
        System.out.println("This room contains: "+roomContains.get(3));
        System.out.println("Door directions: "+roomDirections.get(3));
        System.out.println();

        String direction = getDirection();
        switch (direction) {
            case "E": frontRoom();
            case "N": diningRoom();
            default:
                System.out.println("Invalid input");
                getDirection();
        }
    }

    public static void kitchen(){
        System.out.println();
        System.out.println("You have entered the kitchen.");
        System.out.println("This room contains: "+roomContains.get(4));
        System.out.println("Door directions: "+roomDirections.get(4));
        System.out.println();
    }

    public static void diningRoom(){
        System.out.println();
        System.out.println("You have entered the dining room.");
        System.out.println("This room contains: "+roomContains.get(5));
        System.out.println("Door directions: "+roomDirections.get(5));
        System.out.println();
    }



}