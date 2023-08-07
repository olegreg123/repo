package Lesson12.Homework12;

public class Homework12_2 {
    public static void main(String[] args) {
        int [] array = {999, 32, 45, -12, 10, 24, -11, 46, 1 };
        System.out.println(checkOnesAndZeros(array));


    }
///////////////////////// Methods
public static boolean checkOnesAndZeros ( int[] ints) {
boolean flag = false;
    for (int i = 0; i < ints.length; i++) {
     if (ints[i] == 0 || ints[i] == -1) {
         flag = true;

     }

    }

return flag;
}
    //////////////////////////////////////////
}
