package Lesson15;

public class Work1 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 7, -2, 0}; // result be -2
        System.out.println(getLastNumberLessThenZero(arr));


    }

    public static int getLastNumberLessThenZero(int[] array) {
        int result = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                result = array[i];

            }


        }
        return result;

    }
}








