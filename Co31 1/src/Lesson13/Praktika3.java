package Lesson13;

import java.util.Scanner;

public class Praktika3 {
    public static void main(String[] args) {



Scanner scanner = new Scanner(System.in);
        System.out.println("What do you have? - have, bio, or rest?");
String w = scanner.nextLine();
        String respond  = garbage(w);

        System.out.println(respond);
    }

    public static String garbage (String g) {

switch (g) {
    case "paper":
        return "blau";
    case "bio":
        return "braun";
    case "rest":
        return "black";
    default:
        return "back home!";
}

    }

    /////////////////////////////////////////
}
