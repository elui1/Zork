import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;

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

    public static String direction = "";
    public static boolean foundSecret;
    public static int counter = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to Zork!");
        foyer();

        Random rand = new Random();
        int ghost = rand.nextInt(4);

        if (ghost == 0) {
            System.out.println("You are being followed by a ghost");
        }

        System.out.println("You visited " + counter + " rooms");
    }

    public static String getDirection(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Which direction will you take? (N,S,E,W, or Q to quit) ");
        String direction = sc.next().toUpperCase();
        return direction;
    }

    public static void foyer() {
        counter++;
        System.out.println("You have entered the " + roomMap.get(1));
        System.out.println("This room contains " + roomObject.get(1));

        while (!direction.equals("Q")) {
            direction = getDirection();
            switch (direction) {
                case "N":
                    frontRoom();
                    break;
                case "Q":
                    break;
                default:
                    System.out.println("Invalid direction. Try again.");
                    break;
            }
        }
    }

    public static void frontRoom() {
        counter++;
        System.out.println("You have entered the " + roomMap.get(2));
        System.out.println("This room contains " + roomObject.get(2));

        while (!direction.equals("Q")) {
            direction = getDirection();
            switch (direction) {
                case "S":
                    foyer();
                    break;
                case "W":
                    library();
                    break;
                case "E":
                    kitchen();
                    break;
                case "Q":
                    break;
                default:
                    System.out.println("Invalid direction. Try again.");
                    break;
            }
        }
    }

    public static void library() {
        counter++;
        System.out.println("You have entered the " + roomMap.get(3));
        System.out.println("This room contains " + roomObject.get(3));

        while (!direction.equals("Q")) {
            direction = getDirection();
            switch (direction) {
                case "E":
                    frontRoom();
                    break;
                case "N":
                    diningRoom();
                    break;
                case "Q":
                    break;
                default:
                    System.out.println("Invalid direction. Try again.");
                    break;
            }
        }
    }

    public static void kitchen() {
        counter++;
        System.out.println("You have entered the " + roomMap.get(4));
        System.out.println("This room contains " + roomObject.get(4));

        while (!direction.equals("Q")) {
            direction = getDirection();
            switch (direction) {
                case "W":
                    frontRoom();
                    break;
                case "N":
                    parlor();
                    break;
                case "Q":
                    break;
                default:
                    System.out.println("Invalid direction. Try again.");
                    break;
            }
        }
    }

    public static void diningRoom() {
        counter++;
        System.out.println("You have entered the " + roomMap.get(5));
        System.out.println("This room contains " + roomObject.get(5));

        while (!direction.equals("Q")) {
            direction = getDirection();
            switch (direction) {
                case "S":
                    library();
                    break;
                case "Q":
                    break;
                default:
                    System.out.println("Invalid direction. Try again.");
                    break;
            }
        }
    }

    public static void vault() {
        counter++;
        System.out.println("You have entered the " + roomMap.get(6));
        System.out.println("This room contains " + roomObject.get(6));

        Random rand = new Random();
        int secret = rand.nextInt(4);

        while (!direction.equals("Q")) {
            direction = getDirection();

            if (foundSecret) {
                switch (direction) {
                    case "E":
                        System.out.print("Do you want to go to the secret room (y/n)? ");
                        Scanner sc = new Scanner(System.in);
                        String enter = sc.next();
                        if (enter.equals("y")) {
                            secretRoom();
                            break;
                        }
                        else {
                            parlor();
                            break;
                        }
                    case "Q":
                        break;
                    default:
                        System.out.println("Invalid direction. Try again.");
                        break;
                }
            }

            else {
                switch (direction) {
                    case "E":
                        if (secret == 0) {
                            secretRoom();
                            break;
                        } else {
                            parlor();
                            break;
                        }
                    case "Q":
                        break;
                    default:
                        System.out.println("Invalid direction. Try again.");
                        break;
                }
            }
        }
    }

    public static void parlor() {
        counter++;
        System.out.println("You have entered the " + roomMap.get(7));
        System.out.println("This room contains " + roomObject.get(7));

        while (!direction.equals("Q")) {
            direction = getDirection();
            switch (direction) {
                case "W":
                    vault();
                    break;
                case "S":
                    kitchen();
                    break;
                case "Q":
                    break;
                default:
                    System.out.println("Invalid direction. Try again.");
                    break;
            }
        }
    }

    public static void secretRoom() {
        counter++;
        foundSecret = true;
        System.out.println("You have entered the " + roomMap.get(8));
        System.out.println("This room contains " + roomObject.get(8));

        while (!direction.equals("Q")) {
            direction = getDirection();
            switch (direction) {
                case "W":
                    vault();
                    break;
                case "Q":
                    break;
                default:
                    System.out.println("Invalid direction. Try again.");
                    break;
            }
        }
    }
}

