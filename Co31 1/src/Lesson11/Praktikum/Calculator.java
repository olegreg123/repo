package Lesson11.Praktikum;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //  Calculator:
        //  добавить ввод чисел и математического действия пользователем;
        //  реализовать все вычисления методами, которые получают данные для вычислений на вход.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first Number: ");
        double a = scanner.nextDouble();
        System.out.println("Input action: ");
        String action = scanner.next();
        System.out.println("Input second Number: ");
        double b = scanner.nextDouble();
        switch (action) {
            case "+" : {
                System.out.println( a + b);
                break;
            }
            case "*": {
                System.out.println(a * b);
                break;
            }
                case "-": {
                    System.out.println(a - b);
                    break;
                }
                    case "/": {
                        System.out.println(a / b);
                        break;
                    }
                        default: {
                            System.out.println("Такого нет!");

                    }
                }
            }
        }

///////////////// Methods ////////////////


    ///////////////////////


