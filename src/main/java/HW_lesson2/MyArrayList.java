package HW_lesson2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MyArrayList<T extends Comparable<T>> {
    private T[] list;
    private int size;
    private int capacity;
    private final int DEFAULT_CAPACITY = 10;

    public MyArrayList(int capac) {
        if (capac <= 0) {
            throw new IllegalArgumentException("capacity < 0 :" + capac);
        }
        list = (T[]) new Comparable[capac];
        capacity=capac;
    }

    public MyArrayList() {
        list = (T[]) new Comparable[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
    }

    public void add(T item) {
        if (size == capacity) {
            capacity = (int) (capacity*1.5 +1);
            arrayUp();
        }
        list[size] = item;
        size++;
    }



    public void add(int index, T item) {
        if (size == capacity) {
            capacity = (int) (capacity*1.5 +1);
            arrayUp();
        }
        if (index < 0 | index > capacity) {
            throw new IllegalArgumentException("index incorrect:" + index);
        }
        for (int i = size; i > index; i--) {
            list[i] = list[i - 1];
        }
        list[index] = item;
        size++;
    }

    public final T delete(int index) {
        if (index < 0 | index > size) {
            throw new IllegalArgumentException("index incorrect:" + index);
        }
        T temp = list[index];
        for (int i = index; i < size; i++) {
            list[i] = list[i + 1];
        }
        size--;
        return temp;
    }

    public boolean delete(T item) {
        int pos = index(item);
        if (pos < 0) {
            return false;
        }
        delete(pos);
        return true;
    }

    public T get(int index) {
        if (index < 0 | index > size) {
            throw new IllegalArgumentException("index incorrect:" + index);
        }        return list[index];
    }

    public int indexOf(T item) {
        return index(item);
    }

    private int index(T item) {
        if (item == null) {
            return -1;
        }
        for (int i = 0; i < size; i++) {
            if (item.equals(list[i])) {
                return i;
            }
        }
        return -1;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    private void arrayUp(){
        T[] newArray = (T[]) new Comparable[capacity];
        System.arraycopy(list, 0, newArray, 0, size);
        list = newArray;
    }

    public void mixArray(){
    Random rand = new Random (47);
    Collections.shuffle(Arrays.asList(list), rand);
    }


    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(list, size));
    }

    private boolean less(T item1, T item2) {
        return item1.compareTo(item2) < 0;
    }

    private void swap(int index1, int index2) {
        T temp = list[index1];
        list[index1] = list[index2];
        list[index2] = temp;
    }

    public void selectionSort() {
        for (int i = 0; i < size - 1; i++) {
            int iMin = i;
            for (int j = i; j < size; j++) {
                if (less(list[j], list[iMin])) {
                    iMin = j;
                }
            }
            swap(i, iMin);
        }
    }

    public void insertionSort() {
        T key;
        for (int i = 1; i < size; i++) {
            int j = i;
            key = list[i];
            while (j > 0 && less(key, list[j - 1])) {
                list[j] = list[j - 1];
                j--;
            }
            list[j] = key;
        }
    }

    public void bubbleSort() {
        for (int i = size - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (less(list[j + 1], list[j])) {
                    swap(j + 1, j);
                }
            }
        }
    }

    public void bubbleSortOpt() {
        boolean isSwap;
        for (int i = size - 1; i > 0; i--) {
            isSwap = false;
            for (int j = 0; j < i; j++) {
                if (less(list[j + 1], list[j])) {
                    swap(j + 1, j);
                    isSwap = true;
                }
            }

            if (!isSwap) {
                break;
            }
        }
    }
}
