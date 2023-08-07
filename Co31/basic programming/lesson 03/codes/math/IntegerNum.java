package math;

public class IntegerNum {
    public static void main (String [] args) {
    System.out.println("Hello World");
int x = 20;
int y = 10;
int z = x-y;
        System.out.println("z=x-y"+z);
        z=x*y;
        System.out.println("z=x*y:"+z);

        int a= 115;
                int b=25;
                int c= a/ b;
        System.out.println("Частное а = " +a+" / " + b+" = "+ c);//целочисленное деление
        int d = a % b;
        System.out.println("Частное а = " +a+" % " + b+" = "+ d);//целочисленное деление
        int n = 60 % 12; // остаток от деления
        System.out.println(" 60 % 12 = " + n);
        System.out.println("========Вещественные числа========");
        double f = 10.0d;
        double g = 9.8;
        double e = f / g;
        System.out.println("Result " + f + " / " + g + " = " + e);
        System.out.printf("Result: %.2f ", e);
int num1 = 10;
int num2 = 3;
double d1 = (double) num1 / (double) num2; // преобразование типа int в тип double
        System.out.println();
        System.out.println(d1);
        int num3 = (int) d1; // преобразование типа
        System.out.println(num3);
        System.out.println("====== методы класса Math. ======");
double r = 10;
double length = 2 * Math.PI * r; // длина окружности
        System.out.println("Length of circle is : " + length);
        double area = Math.PI * Math.pow(r, 2);   // Пи * r в квадрате - это площадь круга
        System.out.println("Area of circle is : " + area);
        System.out.println("====== инкремент и декремент =======");
        int i = 1;
        i++; // увеличение на 1
        System.out.println ("i = " + i);
        ++i; // увеличение на 1
        System.out.println ("i = " + i);
        // +=, -=, *= , /= - провести эксперементы,что получается. Прочитать в статьях


    }
}

