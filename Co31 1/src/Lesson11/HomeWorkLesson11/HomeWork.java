package Lesson11.HomeWorkLesson11;
import java.util.Scanner;
public class HomeWork {
    public static void main(String[] args) {

        weg();
    }

    public static void weg() {
// Задача 1
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите мили");
        int tempF = scanner.nextInt();
        System.out.println("Это " + (tempF * 1.6) + " км ");
        scanner.close();


        // Задача 2
        int sumOfArray[] = {14, 56, 9, 17, 5, 13};
        int sum = 0;
        for (int i = 0; i < sumOfArray.length; i++) {
           sum = sum + sumOfArray[i];
        }
        System.out.println(sum);

       // Задача 3

        for (int i = sumOfArray.length - 1; i >= 0; i--)  {
            System.out.println(sumOfArray [i] + " ");

        }

    }


}


