import java.util.*;

public class Max {

    static HashMap<Integer, String> roomNames = new HashMap<>();
    static HashMap<Integer, String> roomContains = new HashMap<>();
    static HashMap<Integer, String> roomDirections = new HashMap<>();
    static int count = 0;
    static String direction="";
    static boolean foundSecret = false;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {

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

    public static int randomNumber(int x){
        Random rand = new Random();
        return rand.nextInt(x);
    }

    public static void finalScore(){
        System.out.println();
        System.out.println("You have left CASTLE ZORK");
        System.out.println("Number of rooms visited: "+count);

        // 1/4 random Ghost following
        int ghost = randomNumber(4);
        if(ghost==0){
            System.out.println("Look over your shoulder! A wandering ghost follows you out of the castle");
        } else {
            System.out.println("The coast is clear, you managed to escape the castle alone");
        }

    }

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

        if(foundSecret) {
            while (!direction.equals("Q")) {
                direction = getDirection();
                switch (direction) {
                    case "E":
                        System.out.print("Do you want to re-enter the secret room (Y/N)? ");
                        Scanner sc = new Scanner(System.in);
                        String enter = sc.next();
                        if (enter.equalsIgnoreCase("Y")) {
                            secretRoom();
                            break;
                        }
                        else if(enter.equalsIgnoreCase("N")) {
                            parlor();
                            break;
                        }
                        else {
                            System.out.println("Invalid input. You choose not to enter the secret room");
                            parlor();
                            break;
                        }
                    case "Q":
                        break;
                    default:
                        System.out.println("Invalid input");
                        break;
                }
            }
        } else {
            while (!direction.equals("Q")) {
                direction = getDirection();
                switch (direction) {
                    case "E":
                        int findSecret = randomNumber(4);
                        if (findSecret == 0) {
                            secretRoom();
                            break;
                        } else {
                            parlor();
                            break;
                        }
                    case "Q":
                        break;
                    default:
                        System.out.println("Invalid input");
                        break;
                }
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
        foundSecret = true;
        System.out.println();
        System.out.println("You have found the **SECRET ROOM!**");
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

}