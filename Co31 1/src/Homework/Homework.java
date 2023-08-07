package Homework;

public class Homework {
    public static void main(String[] args) {

        int a, b;
        a = 10;
        b = 9;
        boolean var = (a == 10) || (b == 10) | (a + b == 10);
        System.out.println(var);


        int f = 15;
        if (f % 4 == 0) {
            System.out.println("This is right!");
        } else {
            System.out.println("This is no right!");

            int n = 7;
            int m = 8;

            if (n > 0 & m > 0) { // проверить, как работает | или ||
                System.out.println("One of numbers is negative ");
            } else {
                System.out.println("Both numbers are positive");
            }




            int week_day = 2;

            switch (week_day) {

                case 1: {
                    System.out.println("Понедельник - день тяжелый!");
                    break;
                }
                case 2: {
                    System.out.println("Вторник - пора готовится к работе.");
                    break;
                }
                case 3:
                    System.out.println("Среда - так и быть будем работать...");
                    break;


                default:
                    System.out.println("Такого дня недели нет.");

                    System.out.println();

            }
        }
        int q = 7;
        int k = 5;
        int d = 3;


    }
}








