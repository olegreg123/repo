package Lesson11;

import java.util.Scanner;

public class Lesson11 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in); // включаем приём данных с клавиатуры
        System.out.println("Input your Name"); // приглашаем пользователя
        String name = scanner.next(); // получение данных с клавиатуры от пользователя
        System.out.println("Input your Last Name"); // приглашаем пользователя
        String lastname = scanner.next(); // получение данных с клавиатуры от пользователя
        System.out.println("Input your age"); // приглашаем пользователя
        byte age = scanner.nextByte(); // получение данных с клавиатуры от пользователя
        //выводим полученные данные на экран
        System.out.println("Your name " + name);
        System.out.println("Your lastname " + lastname);
        System.out.println("Your age is " + age);
        scanner.close();


    }

}

