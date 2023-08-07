package Lesson11.Praktikum;

public class ArrayMethod {
    public static void main(String[] args) {
        // реализуйте метод, который получает на вход массив и находит его минимальный элемент.
        // Шаг 1, создать массив
        // Шаг 2, сделать метод

        int [] array = {14, 73, 20, 8, -15, -45, 21, -999};
        minElOfArray (array);
    }


    //////// методы
    public static void minElOfArray(int [] arr) {
        // ищем минимальный элемент
        int min = arr [0]; // это переменная для минимума
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] < min) {
                min = arr [i];
            }
            
        }
        System.out.println("Min element of array is: "+min);


    }


    ////////

}
