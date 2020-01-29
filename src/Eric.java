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

    public static HashMap<Integer, String> roomObject;

    static {
        roomObject = new HashMap<>();
        roomObject.put(1, "dead scorpion");
        roomObject.put(2, "piano");
        roomObject.put(3, "spiders");
        roomObject.put(4, "bats");
        roomObject.put(5, "dust empty box");
        roomObject.put(6, "3 walking skeletons");
        roomObject.put(7, "treasure chest");
        roomObject.put(8, "piles of gold");
    }
    //public static Scanner input = new Scanner(System.in);
    public static String direction = "";

    public static void main(String[] args) {
        System.out.println("Welcome to Zork!");
        foyer();

    }

    public static String getDirection(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Which direction will you take? (N,S,E,W, or Q to quit) ");
        String direction = sc.next();
        return direction;
    }

    public static void foyer() {
        System.out.println("You have entered the " + roomMap.get(1));
        System.out.println("This room contains " + roomObject.get(1));
        while (!direction.equalsIgnoreCase("Q")) {
            direction = getDirection();
            switch (direction) {
                case "N":
                    frontRoom();
                    break;
                default:
                    System.out.println("Invalid direction. Try again.");
                    break;
            }
        }
    }

    public static void frontRoom() {
        System.out.println("You have entered the " + roomMap.get(2));
        System.out.println("This room contains " + roomObject.get(2));
        //String direction = getDirection();
        while (!direction.equalsIgnoreCase("Q")) {
            String direction = getDirection();
            switch (direction) {
                case "S":
                    foyer();
                    break;
//                case "W":
//                    library();
//                    break;
//                case "E":
//                    kitchen();
//                    break;
                default:
                    System.out.println("Invalid direction. Try again.");
                    break;
            }
            //direction = getDirection();
        }


    public static void library() {
        System.out.println("You have entered the " + roomMap.get(3));
        System.out.println("This room contains " + roomObject.get(3));
        String direction = getDirection();
        //while (!direction.equalsIgnoreCase("Q")) {
            switch (direction) {
                case "E":
                    frontRoom();
                    break;
                case "N":
                    diningRoom();
                    break;
                default:
                    System.out.println("Invalid direction. Try again.");
                    break;
            }
           // direction = getDirection();
        }


    public static void kitchen() {
        System.out.println("You have entered the " + roomMap.get(4));
        System.out.println("This room contains " + roomObject.get(4));
        String direction = getDirection();
//        while (!direction.equalsIgnoreCase("Q")) {
            switch (direction) {
                case "W":
                    frontRoom();
                    break;
                case "N":
                    parlor();
                    break;
                default:
                    System.out.println("Invalid direction. Try again.");
                    break;
            }
          //  direction = getDirection();
        }


    public static void diningRoom() {
        System.out.println("You have entered the " + roomMap.get(5));
        System.out.println("This room contains " + roomObject.get(5));
        String direction = getDirection();
        //while (!direction.equalsIgnoreCase("Q")) {
            switch (direction) {
                case "S":
                    library();
                    break;
                default:
                    System.out.println("Invalid direction. Try again.");
                    break;
            }
           // direction = getDirection();
        }


    public static void vault() {
        System.out.println("You have entered the " + roomMap.get(6));
        System.out.println("This room contains " + roomObject.get(6));
        String direction = getDirection();
        //while (!direction.equalsIgnoreCase("Q")) {
            switch (direction) {
                case "E":
                    parlor();
                    break;
                default:
                    System.out.println("Invalid direction. Try again.");
                    break;
            }
            //direction = getDirection();
        }


    public static void parlor() {
        System.out.println("You have entered the " + roomMap.get(7));
        System.out.println("This room contains " + roomObject.get(7));
        String direction = getDirection();
        //while (!direction.equalsIgnoreCase("Q")) {
            switch (direction) {
                case "W":
                    vault();
                    break;
                case "S":
                    kitchen();
                    break;
                default:
                    System.out.println("Invalid direction. Try again.");
                    break;
            }
          //  direction = getDirection();
        }


    public static void secretRoom() {
        System.out.println("You have entered the " + roomMap.get(8));
        System.out.println("This room contains " + roomObject.get(8));
        String direction = getDirection();
        //while (!direction.equalsIgnoreCase("Q")) {
            switch (direction) {
                case "W":
                    vault();
                    break;
                default:
                    System.out.println("Invalid direction. Try again.");
                    break;
            }
           // direction = getDirection();
        }
    }

