package HW_lesson6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int howManyTrees = 100000;
        int ballancedTree = 0;
        Random random = new Random();
        for (int i = 1; i < howManyTrees; i++) {
            MyTreeMap <Integer, Integer> map = new MyTreeMap<>();
            int point = 0;
            while (map.deep()< 6) {
                point = random.nextInt(29);
                map.put(point, (100 - random.nextInt(201)));
            }
            map.delete(point);
            if (map.isBalance()) {
                ballancedTree++;
            }
        }
        System.out.println("balanced Three " + ballancedTree + " from " + howManyTrees + " Trees" );
        System.out.println("balanced " + (double) ballancedTree / howManyTrees * 100 + " %");
        System.out.println("no balanced " + (double) (howManyTrees - ballancedTree) / howManyTrees * 100 + " %");
    }
}
