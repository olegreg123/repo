package Lesson05;

public class Lesson05 {
    public static void main(String[] args) {
        int ch = 'A';
        System.out.println(ch);
        int chInt = 'B';
        System.out.println(chInt);
        chInt++;
        System.out.println(chInt);

        int hex = 0xFF;// 16ричное
        System.out.println(hex);
        int oct= 011; // 8ричное
        System.out.println(oct);
        int binary = 0b1100; // двоичное
        System.out.println(binary);

        String hellos = "beautiful";
        int b = hellos.length();
        System.out.println(b * 2);

        int i = 11;
        int j = 10;
        System.out.println("comparing i and j");
        System.out.println("i = "+i + " and j = "+j);
        System.out.println("i< j "+(i < j));
        System.out.println("i> j "+(i > j));
        System.out.println("i<= j "+(i <= j));
        System.out.println("i>= j "+(i >= j));
        System.out.println("i== j "+(i == j));
        System.out.println("i != j "+(i != j));

 String si = "Beautiful";
 String di = si.substring(0, 6);
        System.out.println(di);

        int a = 10;
        int t = 4;
        System.out.println("Result is " + (a!=t));

        String p = "Souce";
        String ck = p.substring (0,3);
        System.out.println(ck);

        int q = 10;
        int f = 9;
        System.out.println("Resultat is " + (q>f));

        int l = 1;
        int w = 9;
        System.out.println("Resultat is " + (l!=w));

       int o = 4;
       int s = 10;
        System.out.println("Resultat is " + (o<=s));

       int m = 4;
       int v = 3;
        System.out.println("Resultat is " + (m==v));












    }
}

