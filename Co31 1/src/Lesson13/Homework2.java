package Lesson13;

import java.util.Random;

public class Homework2 {


    public static char[] randomLetters(int length) {
    char [] letters = new char [length];
        Random random = new Random ();
        for (int i = 0; i < letters.length; i++) {
            letters [i] = (char) (random.nextInt(90 - 65)+65);
        }
        return letters;
    }


}