// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        int n = 5;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("факториал числа: " + n + " = " + factorial);



        int ints [] = {2, 67, 34, 8};
        for ( int i = 0; i <ints.length; i++){
            System.out.println(ints [i]);
        }


        System.out.println("Print elements with for-each");
        for (int num : ints){
            System.out.println(num);
        }
/*
цикл for-each служит для перебора элементов массива без указания индексов и длинны массива
создаётся "итерационная переменная" num, в которую последовательно на каждом шаге цикла записывается очередное значение элемента массива.
Она записывается в скобках после ключевого слова for. Дальше ставится двоеточие и справа от двоеточия пишется имя перебираемого
массива



 */
        // continue
        // используется в цикле если программа встречает слово continue, то идущая за ним часть цикла пропускается, и происходит
        // переход к выполнению следующей операции цикла.
        int arr [] = {2, 67, 34, 8};
        for ( int i = 0; i <ints.length; i++){
            if (arr [i] > 60) {
                continue;
            }

            System.out.println(ints [i]);
        }

        // break
        //если в программе в цикле встречается слово break,то происходит сразу выход из цикла и переход к команде,
        // следующей за циклом
        for (int i = 0; i < 100; i++){
            System.out.println(i);
            if (i == 50) {
                break;
            }
        }
        System.out.println("Out of for loop");


    }

    }

