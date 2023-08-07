package Lesson12;

public class Lesson12 {

    public static void main(String[] args) {
        //   int result =  subNumbers(1, 2);
        //   System.out.println(result + 1);
        System.out.println(subNumbers(1, 3));
    }

    static int subNumbers(int a, int b) {
        //  int sum = a + b;
        //  System.out.println(sum);
        //  return sum;
        return a + b;
    }

    public static int weg() {
        // Задача 2
        int sumOfArray[] = {14, 56, 9, 17, 5, 13};
        int sum = 0;
        for (int i = 0; i < sumOfArray.length; i++) {
            sum = sum + sumOfArray[i];
        }
        System.out.println(sum);
        return sum;
    }

   // static String helloName(String name) {
        //   String res = "Hello, " + name + " ! ";
    //     return res;
  //  }

    // написать метод который принимает число и проверяет является ли чисто двухзначным или трёхзначным.
    // метод возвращает строку, в которой отвечает на этот вопрос
/*
static String checkNumbers (int num) {
if (num >= 10 && num < 100)
return num + " is two-digit number";
else if (num >= 100 && num <1000)
 //   return num+

*/
}



