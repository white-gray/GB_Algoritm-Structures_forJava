package HW_lesson8;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Добавление объектов в hash-map");
        Map<Integer, Integer> map = new HashMap<>();
        map.put(5, 9999999);
        System.out.println("\tПо индексу 5 находится объект " + map.get(5));
        map.put(5, 77777);
        System.out.println("\t\tМеняеееем!\n\tИ теперь по индексу 5 находится объект " + map.get(5));


        System.out.println("\nИспользование своей ChainingHashMap");
        ChainingHashMap<Integer, String> myHashMap = new ChainingHashMap<>(7);
        for (int i = 0; i < 7; i++) {
            myHashMap.put(random.nextInt(100), "a");
        }
        System.out.println("\tВ ChainingHashMap заполнены места с индексами");
        System.out.println(myHashMap.toString());
        System.out.println("\tУдаление 3-го попавшегося key:");
        int step = 1;
        for (int i = 0; i < 101; i++) {
            Integer k = myHashMap.findKey(i);
            if (k != null) {
                if (step == 3) {
                    myHashMap.delete_pointAtLinkedList(k);
                    break;
                }
                step++;
            }

        }
        System.out.println("\tТеперь ChainingHashMap заполнены места с индексами");
        System.out.println(myHashMap.toString());
        System.out.println("\tУдаление первой не пустой строки:");
        for (int i = 0; i < 101; i++) {
            Integer k = myHashMap.findKey(i);
            if (k != null) {
                myHashMap.delete_LinkedList(myHashMap.getHash(i));
                break;
            }
        }
        System.out.println("\tТеперь ChainingHashMap заполнены места с индексами");
        System.out.println(myHashMap.toString());


        System.out.println("\nиспользование своей LinearProbingHashMap");
        LinearProbingHashMap<Integer, String> lphm = new LinearProbingHashMap<>(21);
        lphm.put(5, "qwe");
        lphm.put(15, "qweerwer");
        System.out.println("\tпо индексу 5 находится объект \t" + lphm.get(5));
        System.out.println("\tпо индексу 15 находится объект \t" + lphm.get(15));
        System.out.println("\tсуммарно в ChainingHashMap находтся объекты");
        System.out.println(lphm.toString());
    }
}
