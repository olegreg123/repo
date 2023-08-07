package Practicum;

public class My_Pometki {

    public static void main(String[] args) {

    /*
    substring - ПОЗВОЛЯЕТ СЧИТАТЬ ИНДЕКС БУКВ В СЛОВЕ
    ПРИМЕР:   String p = "Souce";
        String ck = p.substring (0,3);
        System.out.println(ck);
        ТАКИМ ОБРАЗОМ ВЫВЕЛИ "SOU"

        ///////////////////////////////////////////////////
         boolean  занимает 1 бит и может принимать два true  или false.
     Эти слова являются зарезервированными в джаве
     // результатом выполнения операций сравнения в джаве будет true или false
        System.out.println("10 > 9 ? "+(10>9));
        System.out.println("10 > 9 ? "+(10<9));

          && -  Conditional-AND  and
          || -  Conditional-OR
     //  эти операторы будут проверять второй операнд только в случае необходимости, если результат не понятен.
     // Обычные OR and AND  будут всегда проверять оба операнда.

     */
 // Relational operators
        /*
        >  больше чем
        <   меньше чем
        >=  больше или равно
        <=    меньше или равно
        ==   равно
        !=  не равно

 &  - AND  И
        |  - OR   ИЛИ
        !  - NOT   НЕ
        ^  - XOR ( exclusive OR)  исключающее ИЛИ

          p      q        p & q       p | q        p^q       !p

        False   False      False       False        False      True
        True    False      False       True         True       False
        False   True       False       True         True       True
        True    True       True        True         False      False
        Когда значения p  и q разные , XOR  дает true.  Когда одинаковые, то false

        boolean b1 = true;
        boolean b2 = true;
        System.out.println("b1&b2"+(b1 & b2 ));
        System.out.println("!(b1&b2)"+!(b1 & b2 ));
        System.out.println("b1|b2"+(b1 | b2 ));
        System.out.println("b1^b2"+(b1 ^ b2 ));

  */
int a = 20;
int b = 21;
        System.out.println("This resultat is "+(a!=b && b <= a));


        String face = "Face";
        char ch = face.charAt(1);
        System.out.println(ch);

        String Andrew = "Andrew";
        String cf = Andrew.substring(0, 4);
        System.out.println(cf);

        String u = "Maxim";
        char bii = u.charAt(2);
        System.out.println(bii);

        String iu = "Maxim";
        String uiu = iu.substring(0,3);
        System.out.println(uiu);


String isa = "Alex";
int suu = isa.length();
        System.out.println("Alex length is "+ (isa.length() + " words"));


        String java = "Bye";
        int lengthBye = java.length();
        System.out.println(java+" length is "+lengthBye);
        char Java = java.charAt(lengthBye - 3); // получение символа на последней позиции в слове
        System.out.println("Symbol at the  last position in "+java+" is  "+ Java);


        String c = "Hell";
        String y = c.substring(0, 2);
        System.out.println(y);






















    }
}
