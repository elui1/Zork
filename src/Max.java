import java.util.*;

public class Max {

    static HashMap<Integer, String> roomNames = new HashMap<>();
    static HashMap<Integer, String> roomContains = new HashMap<>();
    static HashMap<Integer, String> roomDirections = new HashMap<>();
    static int count = 0;
    static String direction="";

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
//        roomNames.put(1, "foyer");
//        roomNames.put(2, "front room");
//        roomNames.put(3, "library");
//        roomNames.put(4, "kitchen");
//        roomNames.put(5, "dining room");
//        roomNames.put(6, "vault");
//        roomNames.put(7, "parlor");
//        roomNames.put(8, "secret room");

        roomContains.put(1, "dead scorpion");
        roomContains.put(2, "piano");
        roomContains.put(3, "spiders");
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

        welcome();
        foyer();
        finalScore();

    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void welcome(){
        System.out.println("          *** Welcome to CASTLE ZORK ***");
        System.out.println("Search the castle rooms to find the hidden treasure!");
        System.out.println("----------------------------------------------------");
    }

    public static String getDirection(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Which direction will you take? (N,S,E,W, or Q to quit) ");
        return (sc.nextLine().toUpperCase());
    }

//    public static void room(int x){
//        System.out.println();
//        System.out.println("You have entered the "+roomNames.get(x));
//        System.out.println("This room contains: "+roomContains.get(x));
//        System.out.println("Door directions: "+roomDirections.get(x));
//        System.out.println();
//    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void foyer(){
        count++;
        System.out.println();
        System.out.println("You have entered the FOYER");
        System.out.println("This room contains: "+roomContains.get(1));
        System.out.println("Door directions: "+roomDirections.get(1));
        System.out.println();

        while (!direction.equals("Q")){
            direction = getDirection();
            switch (direction){
                case "N": frontRoom(); break;
                case "Q": break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }

    }

    public static void frontRoom() {
        count++;
        System.out.println();
        System.out.println("You have entered the FRONT ROOM");
        System.out.println("This room contains: " + roomContains.get(2));
        System.out.println("Door directions: " + roomDirections.get(2));
        System.out.println();

        while (!direction.equals("Q")) {
            direction = getDirection();
            switch (direction) {
                case "S": foyer(); break;
                case "W": library(); break;
                case "E": kitchen(); break;
                case "Q": break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }



    public static void library(){
        count++;
        System.out.println();
        System.out.println("You have entered the LIBRARY");
        System.out.println("This room contains: "+roomContains.get(3));
        System.out.println("Door directions: "+roomDirections.get(3));
        System.out.println();

        while (!direction.equals("Q")) {
            direction = getDirection();
            switch (direction) {
                case "E": frontRoom(); break;
                case "N": diningRoom(); break;
                case "Q": break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }

    public static void kitchen(){
        count++;
        System.out.println();
        System.out.println("You have entered the KITCHEN");
        System.out.println("This room contains: "+roomContains.get(4));
        System.out.println("Door directions: "+roomDirections.get(4));
        System.out.println();

        while (!direction.equals("Q")) {
            direction = getDirection();
            switch (direction) {
                case "W": frontRoom(); break;
                case "N": parlor(); break;
                case "Q": break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }

    public static void diningRoom(){
        count++;
        System.out.println();
        System.out.println("You have entered the DINING ROOM");
        System.out.println("This room contains: "+roomContains.get(5));
        System.out.println("Door directions: "+roomDirections.get(5));
        System.out.println();

        while (!direction.equals("Q")) {
            direction = getDirection();
            switch (direction) {
                case "S": library(); break;
                case "Q": break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }

    public static void vault(){
        count++;
        System.out.println();
        System.out.println("You have entered the VAULT");
        System.out.println("This room contains: "+roomContains.get(6));
        System.out.println("Door directions: "+roomDirections.get(6));
        System.out.println();

        while (!direction.equals("Q")) {
            direction = getDirection();
            switch (direction) {
                case "E": parlor(); break;
                //25% chance of ROOM 8



                case "Q": break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }

    public static void parlor(){
        count++;
        System.out.println();
        System.out.println("You have entered the PARLOR");
        System.out.println("This room contains: "+roomContains.get(7));
        System.out.println("Door directions: "+roomDirections.get(7));
        System.out.println();

        while (!direction.equals("Q")) {
            direction = getDirection();
            switch (direction) {
                case "W": vault(); break;
                case "S": kitchen(); break;
                case "Q": break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }

    public static void secretRoom(){
        count++;
        System.out.println();
        System.out.println("You have found the SECRET ROOM!");
        System.out.println("This room contains: "+roomContains.get(8));
        System.out.println("Door directions: "+roomDirections.get(8));
        System.out.println();

        while (!direction.equals("Q")) {
            direction = getDirection();
            switch (direction) {
                case "W": vault(); break;
                case "Q": break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }

    public static void finalScore(){
        System.out.println();
        System.out.println("You have left CASTLE ZORK");
        System.out.print("Number of rooms visited: "+count);
        // 1/4 random Ghost following
    }



}