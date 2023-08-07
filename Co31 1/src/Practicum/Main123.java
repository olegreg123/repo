package Practicum;

public class Main123 {
    public static void main(String[] args) {

        System.out.println("\u0024");
        // тип char. В джаве для хранения символов используется 2 байта, т.е. можно хранить символы
        /*
       В диапазоне от 0 до 65535
       Джава использует Юникод

         */
        char ch;
        ch = '*';
        System.out.println("This is Character: " + ch);

        ch++;
        System.out.println(" ch is now " + ch);
        int chInt = 'X';

char char1 = 88;
        System.out.println(char1);
        System.out.println(" He says \"hello\"");

// \" - для передани двойных кавычек
// \' - одинарная кавычка
// \\ - слэш
// \n - переход на новую строчку
//  \t - табуляция
//u+4 икса  - символ юникода
        System.out.print("Hello\n");
        System.out.print("Java\n");
        System.out.println("Hello\tJava\tHello");



        int a = 1000;
        int b = 500;
        int discount = 100;

        System.out.println(a+b-discount);
        System.out.println(discount);

        int Monday = 27;
        int Tuesday = 29;
        int Wednesday = 22;
        int Thursday = 25;
        int Friday = 20;
        int Saturday = 24;
        int Sunday = 30;

        double c = Monday +  Tuesday + Wednesday +  Thursday +  Friday +  Saturday +  Sunday;

        System.out.println(c / 7);

int a1 = 79;
int b1 = 2;
int c1 = a1 % b1;
        System.out.println(c1);

 int d = 116;
 int k = 3;
 int m = d % k;
        System.out.println(m);

        int x = 3;
        x += x++;
        x = x + x++;
        System.out.println(x);

        System.out.println("\u0042");


        String beautiful = "Beautiful (double)";
        int len = beautiful.length();
        System.out.println("length of Beautiful is "+ len);
        char sh = beautiful.charAt (2);
        System.out.println(sh);

















    }
}


