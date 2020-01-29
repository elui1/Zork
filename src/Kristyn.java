import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;


public class Kristyn {
//initialize hashmap for roomlist and make available to all methods
    public static HashMap<String, String>
            roomslist = new HashMap<>();

//initialize hashmap for directions and make available to all methods
    public static HashMap<Integer, HashSet>
            roomdir = new HashMap<>();

//initialize hashset for directions and make available to all methods
    public static HashSet<String> direction = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//add items to all lists
        roomslist.put("Foyer", "Dead Scorpion");
        roomslist.put("Front Room", "Piano");
        roomslist.put("Library", "Spiders");
        roomslist.put("Kitchen", "Bats");
        roomslist.put("Dining Room", "Empty Box");
        roomslist.put("Vault", "Walking Skeleton");
        roomslist.put("Parlor", "Treasure Chest");
        roomslist.put("Secret Room", "Piles of Gold");
        roomdir.put(1, direction);
        roomdir.put(2, direction);
        roomdir.put(3, direction);
        roomdir.put(4, direction);
        roomdir.put(5, direction);
        roomdir.put(6, direction);
        roomdir.put(7, direction);
        roomdir.put(8, direction);

        direction.add("n");
        direction.add("s");
        direction.add("e");
        direction.add("w");
        welcome();

    }
    public static void welcome() {
        System.out.println("Welcome to Zork");
        System.out.println("Try and find the pile of gold!");
        System.out.println();
        foyer();
    }

        public static void foyer() {

            System.out.println("Welcome to the Foyer");
            System.out.println("The items in this room include: " + roomslist.get("Foyer"));

            Scanner sc = new Scanner(System.in);
            String direction;// = sc.nextLine();
//            for(String key:roomslist.keySet()){
//                System.out.println(key);
//            }
            String quit = "c";
            while(!quit.equalsIgnoreCase("q")) {
                System.out.println("What direction do you go or press q to end game");
                direction = sc.next();
                if (direction.equalsIgnoreCase("q")){
                  break;
                }
                else{
                    switch (direction) {
                        case "n":
                            System.out.println("Go to front room"); //front_room ();
                            quit="q";
                            break;
                        default:
                            System.out.println("Not a valid direction.");
                            foyer();
                            break;
                    }//end of switch
                }}

            }// end of while
        }

 /*   public static void front_room() {
        //welcome to foyer....this is in foyer...then printstatement below
        System.out.println("What direction do you go?: ");
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();


        switch (direction) {
            case "n":
                incorrect();
                break;
            case "s":
                monthName = "April, June, September, November";
                break;
            case "e":
                kitchen();
                break;
            case "w":
                library();
                break;
            case "default":
                break;

        }

   }}*/