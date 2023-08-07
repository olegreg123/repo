package Lesson11.Praktikum;
import java.util.Scanner;
public class Letters {
    public static void main(String[] args) {
    //    Реализуйте метод, который получает на вход строку на английском языке и сообщает количество гласных букв в ней.

    // a, e, i, o, u, y - это гласные буквы
    // Шаг 1. Подключаем сканнер
    // Шаг 2. Получить от пользователя строку
    // Шаг 3. Пишем метод, который принимает эту строку на вход
    // Шаг 4. Пройти циклом по всей строке charAt(index) и подсчитать количество гласных

       Scanner scanner = new Scanner(System.in);
        System.out.println("Input string : ");
        String st = scanner.nextLine(); // читает строку с клавиатуры до нажатия ввода,включая пробелы
        // вызов метода
        findLetters(st); // передаём ему на вход аргумент st

    }
    ////////////// Methods ///////////////
public static void findLetters (String s) {
int count = 0; // обьявили перменную когда отвечает за счётчик гласных букв
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i)== 'a' || s.charAt(i)=='e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'y'){
            // увеличеть счётчик
            count ++;

        }
    }
    System.out.println("Number of vowels letters are: " + count);
}
    ///////////////
}
