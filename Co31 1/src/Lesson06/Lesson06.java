package Lesson06;

public class Lesson06 {
    public static void main(String[] args) {
        int week_day = 1;

        switch (week_day) {
            case 1:
                System.out.println("Понедельник - день тяжелый!");
                break;
            case 2:
                System.out.println("Вторник - пора готовится к работе.");
                break;
            case 3:
                System.out.println("Среда - так и быть будем работать...");
                break;
            default:
                System.out.println("Такого дня недели нет.");
        }

        int x=3;

        int y=2;

        int z = (x != y) ? (x+y) : (y-x);

        System.out.println(z);
    }
}
