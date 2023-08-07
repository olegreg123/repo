package Lesson12.Homework12;

public class Homework12_3 {
    public static void main(String[] args) {
   //     Написать метод, принимающий массив целых чисел и число и находящий индекс этого числа(элемента) в массиве. Если такой элемент есть, возвращается его индекс, если нет, метод возвращает -1.
    //    В методе main() вывести получившийся результат на экран

        int [] array = {999, 32, 45, -12, 10, 24, -11, 46, 1 };
        System.out.println(findInArray(array, 10, 4)); // вызвали метод и передали аргументы - массив, число,и его индекс

    }
    //////////////// Methods
public static int findInArray (int [] arr, int a, int index) {
    for (int i = 0; i < arr.length; i++) {
        if ( arr [i] == a && i == index ) {
            return i; // вернули его индекс
        }
    }
return -1;

}

    //////////////////////////////
}
