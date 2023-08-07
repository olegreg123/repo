package our_package;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        printFactorial();
    }

        static void printFactorial() {
            int n = 5;
            int a = 1;
            for (int b = 1; b <= n; b++) {
                a *= b;
                System.out.println(a);
            }

int f = 50;
   int k = 5*(f-32)/9;
            System.out.println(f + " градусов по Фаренгейту это " + k + " градусов по Цельсию");

        }
    }

//  printHello();
//создаём сканер
//  Scanner scanner = new Scanner(System.in);
//     System.out.println("Enter a number ");
//чтение ввода пользователя и запись результата в переменную num1
//     int num1 = scanner.nextInt();

//   System.out.println("You entered number " + num1);
//next() - считает пользовательский ввод в виде строки до пробела
//    scanner.close();

