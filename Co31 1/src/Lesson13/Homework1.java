package Lesson13;

import java.util.Random;

public class Homework1 {
    // Напишите метод, который имитирует бросание игрового кубика. На вход методу подается число бросков, на выходе метод возвращает результаты всех бросков.
    public static void main(String[] args) {
    int [] result =    throwCube(10);
    for (int element : result)
        System.out.print(element+ " , ");


    }




    public static int [] throwCube (int numberOf) {
        int [] result = new int[numberOf];
        Random random = new Random();
        for (int i = 0; i < result.length; i++) {
            result [i] = random.nextInt(1, 7);
        }
        return result;


    }
}