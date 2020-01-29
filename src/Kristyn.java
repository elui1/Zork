import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;


public class Kristyn {
    public static HashMap<String, String>
            roomslist = new HashMap<>();


    public static HashMap<Integer, String>
            roomdir = new HashMap<>();


    public static Set<String> direction = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
        roomdir.put(6, "Vault");
        roomdir.put(7, "Parlor");
        roomdir.put(8, "Secret Room");

        direction.add("n");
        direction.add("s");
        direction.add("e");
        direction.add("w");


    }

    public static String foyer() {
        System.out.println("What direction do you go?: ");
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();


        int month = (answer);
        String monthName = " ";
        switch (month) {
            case 31:
                monthName = "January, March, May, July, August, October, and December";
                break;
            case 30:
                monthName = "April, June, September, November";
                break;
            case 28:
                monthName = "February";
                break;
            case 0:
                monthName = "Unknown";
                break;

        }
        System.out.println(monthName);

    }
}