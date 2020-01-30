import java.util.*;

public class Kristyn {
    //initialize hashmap for roomlist and make available to all methods
    public static HashMap<String, String>
            roomslist = new HashMap<>();

    //initialize hashmap for directions and make available to all methods
    public static HashMap<String,Set<String>>
            roomdir = new HashMap<>();

    //initialize hashset for directions and make available to all methods
    public static Set<String> direction = new HashSet<String>();
    public static int secretRoomcounter = 0;
    public static int counter = 0;

    //public static String endgame();

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
        //Start Hashsets
        //foyer
        direction = new HashSet<>();
        direction.add("n");
        roomdir.put("Foyer",direction);

        //front
        direction = new HashSet<>();
        direction.add("w");
        direction.add("s");
        direction.add("e");
        roomdir.put("Front Room", direction);

        //library
        direction = new HashSet<>();
        direction.add("n");
        direction.add("e");
        roomdir.put("Library", direction);

        //Kitchen
        direction = new HashSet<>();
        direction.add("n");
        direction.add("w");
        roomdir.put("Kitchen", direction);

        //Dining Room
        direction = new HashSet<>();
        direction.add("s");
        roomdir.put("Dining Room", direction);

        //Vault
        direction = new HashSet<>();
        direction.add("e");
        roomdir.put("Vault", direction);

        //Parlor

        direction = new HashSet<>();
        direction.add("w");
        direction.add("s");
        roomdir.put("Parlor", direction);

        //Secret Room
        direction = new HashSet<>();
        direction.add("w");
        roomdir.put("Secret Room", direction);

        welcome();

    }

    public static void welcome() {
        System.out.println("Welcome to Zork");
        System.out.println("Try and find the pile of gold!");
        System.out.println();
        foyer();
    }

    public static void foyer() {
        counter++;
        System.out.println("Welcome to the Foyer");
        System.out.println("The items in this room include: " + roomslist.get("Foyer"));
        System.out.println("Possible directions is: " +roomdir.get("Foyer"));

        Scanner sc = new Scanner(System.in);
        String direction;// = sc.nextLine();
//            for(String key:roomslist.keySet()){
//                System.out.println(key);
//            }
        String quit = "c";
        while (!quit.equalsIgnoreCase("q")) {
            System.out.println("What direction do you go or press q to end game");
            direction = sc.next();
            if (direction.equalsIgnoreCase("q")) {
                break;
            } else {
                switch (direction) {
                    case "n":
                        front_room(); //calls the front room method;
                        quit = "q";
                        break;
                    default:
                        System.out.println("Not a valid direction.");
                        foyer();
                        break;
                }//end of switch
            }
        }

    }// end of while

    public static void front_room() {
        counter++;
        System.out.println("Welcome to the Front Room");
        System.out.println("The items in this room include: " + roomslist.get("Front Room"));
        //System.out.println("Possible directions are: s, w and e");
        System.out.println("Possible directions is: " +roomdir.get("Front Room"));

        Scanner sc = new Scanner(System.in);
        String direction;// = sc.nextLine();
//            for(String key:roomslist.keySet()){
//                System.out.println(key);
//            }
        String quit = "c";
        while (!quit.equalsIgnoreCase("q")) {
            System.out.println("What direction do you go or press q to end game");
            direction = sc.next();
            if (direction.equalsIgnoreCase("q")) {
                break;
            } else {
                switch (direction) {
                    case "e":
                        kitchen();
                        quit = "q";
                        break;
                    case "w":
                        library();
                        quit = "q";
                        break;
                    case "s":
                        foyer();
                        quit = "q";
                        break;
                    default:
                        System.out.println("Not a valid direction.");
                        foyer();
                        break;
                }//end of switch
            }
        }

    }//// end of while

    public static void kitchen() {
        counter++;
        System.out.println("Welcome to the Kitchen");
        System.out.println("The items in this room include: " + roomslist.get("Kitchen"));
        System.out.println("Possible directions is: " +roomdir.get("Kitchen"));

        Scanner sc = new Scanner(System.in);
        String direction;// = sc.nextLine();
//            for(String key:roomslist.keySet()){
//                System.out.println(key);
//            }
        String quit = "c";
        while (!quit.equalsIgnoreCase("q")) {
            System.out.println("What direction do you go or press q to end game");
            direction = sc.next();
            if (direction.equalsIgnoreCase("q")) {
                break;
            } else {
                switch (direction) {
                    case "n":
                        parlor();
                        quit = "q";
                        break;
                    case "w":
                        front_room();
                        quit = "q";
                        break;
                    default:
                        System.out.println("Not a valid direction.");
                        foyer();
                        break;
                }//end of switch
            }
        }


    }

    public static void library() {
        counter++;
        System.out.println("Welcome to the Library");
        System.out.println("The items in this room include: " + roomslist.get("Library"));
        System.out.println("Possible directions is: " +roomdir.get("Library"));

        Scanner sc = new Scanner(System.in);
        String direction;// = sc.nextLine();
//            for(String key:roomslist.keySet()){
//                System.out.println(key);
//            }
        String quit = "c";
        while (!quit.equalsIgnoreCase("q")) {
            System.out.println("What direction do you go or press q to end game");
            direction = sc.next();
            if (direction.equalsIgnoreCase("q")) {
                break;
            } else {
                switch (direction) {
                    case "n":
                        dining_room();
                        quit = "q";
                        break;
                    case "e":
                        front_room();
                        quit = "q";
                        break;
                    default:
                        System.out.println("Not a valid direction.");
                        foyer();
                        break;
                }//end of switch
            }
        }
    }

    public static void parlor() {
        counter++;
        System.out.println("Welcome to the Parlor");
        System.out.println("The items in this room include: " + roomslist.get("Parlor"));
        System.out.println("Possible directions is: " +roomdir.get("Parlor"));

        Scanner sc = new Scanner(System.in);
        String direction;// = sc.nextLine();
//            for(String key:roomslist.keySet()){
//                System.out.println(key);
//            }
        String quit = "c";
        while (!quit.equalsIgnoreCase("q")) {
            System.out.println("What direction do you go or press q to end game");
            //System.out.println("The possible directions are: w and s");
            direction = sc.next();
            if (direction.equalsIgnoreCase("q")) {
                break;
            } else {
                switch (direction) {
                    case "w":
                        vault();
                        quit = "q";
                        break;
                    case "s":
                        kitchen();
                        quit = "q";
                        break;
                    default:
                        System.out.println("Not a valid direction.");
                        foyer();
                        break;
                }//end of switch
            }
        }
    }

    public static void dining_room() {
        counter++;
        System.out.println("Welcome to the Dining Room");
        System.out.println("The items in this room include: " + roomslist.get("Dining Room"));
        System.out.println("Possible directions is: " +roomdir.get("Dining Room"));

        Scanner sc = new Scanner(System.in);
        String direction;// = sc.nextLine();
//            for(String key:roomslist.keySet()){
//                System.out.println(key);
//            }
        String quit = "c";
        while (!quit.equalsIgnoreCase("q")) {
            System.out.println("What direction do you go or press q to end game");
            direction = sc.next();
            if (direction.equalsIgnoreCase("q")) {
                break;
            } else {
                switch (direction) {
                    case "s":
                        library();
                        quit = "q";
                        break;
                    default:
                        System.out.println("Not a valid direction.");
                        foyer();
                        break;
                }//end of switch
            }
        }
    }

    public static void vault() {
        Random Random = new Random(System.currentTimeMillis());
        System.out.println("Welcome to the Vault");
        System.out.println("The items in this room include: " + roomslist.get("Vault"));
        System.out.println("Possible directions is: " +roomdir.get("Vault"));
        counter ++;
        Scanner sc = new Scanner(System.in);
        String direction;// = sc.nextLine();
//            for(String key:roomslist.keySet()){
//                System.out.println(key);
//            }
        String quit = "c";
        while (!quit.equalsIgnoreCase("q")) {
            System.out.println("What direction do you go or press q to end game");
            direction = sc.next();
            if (direction.equalsIgnoreCase("q")) {
                break;
            } else {
                switch (direction) {
                    case "e":
                        //should put user in secret room 25% of time
                        if (Random.nextInt(4) == 0) {
                            secret_room();
                        } else {
                            parlor();
                        }
                        quit = "q";
                        break;
                    default:
                        System.out.println("Not a valid direction.");
                        foyer();
                        break;
                }//end of switch
            }
        }
    }

    public static void secret_room() {
        counter++;
        System.out.println("Welcome to the Secret Room!");
        System.out.println("The items in this room include: " + roomslist.get("Secret Room"));
        System.out.println("Possible directions is: " +roomdir.get("Secret Room"));
            if(secretRoomcounter==0){
                System.out.println("You win the gold!");
                secretRoomcounter++;}
        Scanner sc = new Scanner(System.in);
        String direction;// = sc.nextLine();
//            for(String key:roomslist.keySet()){
//                System.out.println(key);
//            }
        String quit = "c";
        while (!quit.equalsIgnoreCase("q")) {
            System.out.println("What direction do you go or press q to end game");
            direction = sc.next();
            if (direction.equalsIgnoreCase("q")) {
                break;
            } else {
                switch (direction) {
                    case "w": parlor();
                        quit = "q";
                        break;
                    default:
                        System.out.println("Not a valid direction.");
                        foyer();
                        break;
                }//end of switch
            }
        }
    }

    //if()

    }
