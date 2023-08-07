package Lesson008;

public class Lesson08 {

    public static void main(String[] args) {

        int[] b = {185, 167, 197, 211, 176, 187, 164, 170, 173, 179};

        int s = 0;
        int minimal = b[0];
        int d = 0;

        while (s < b.length) {
            if (b[s] < minimal) {
                minimal = b[s];
                d = s;
            }
            s++;
        }

        System.out.println("Minimum = " + minimal + ", index = " + d);

        for (int i = 0; i<=10; i++)
        {
        //    System.out.println(i);
        }



    }
}