package HW_lesson2;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int n = 100000;
        MyArrayList<Integer> mal = new MyArrayList<>(n);
        for (int i = 0; i < n; i++) {
            mal.add(random.nextInt(1000));
        }
//        System.out.println(mal);
        System.out.println("----------------------------------------------------------");
        long start = System.currentTimeMillis();
        mal.selectionSort();
        System.out.println("Выполнение операции selectionSort заняло: " + (System.currentTimeMillis() - start) / 1000 + "сек");
//        System.out.println(mal);
        System.out.println("----------------------------------------------------------");
        mal.mixArray();
//        System.out.println(mal);
        start = System.currentTimeMillis();
        mal.insertionSort();
        System.out.println("Выполнение операции insertionSort заняло: " + (System.currentTimeMillis() - start) / 1000 + "сек");
//        System.out.println(mal);
        System.out.println("----------------------------------------------------------");
        mal.mixArray();
//        System.out.println(mal);
        start = System.currentTimeMillis();
        mal.bubbleSort();
        System.out.println("Выполнение операции bubbleSort заняло: " + (System.currentTimeMillis() - start) / 1000 + "сек");
//        System.out.println(mal);
        System.out.println("----------------------------------------------------------");
        mal.mixArray();
//        System.out.println(mal);
        start = System.currentTimeMillis();
        mal.bubbleSortOpt();
        System.out.println("Выполнение операции bubbleSortOpt заняло: " + (System.currentTimeMillis() - start) / 1000 + "сек");
//        System.out.println(mal);










    }
}
