package HW_lesson5;

import java.util.ArrayList;
import java.util.List;

import static HW_lesson5.Erect.*;

public class Main {

    public static void main(String[] args) {
        /*
         *  Task 1
         * */
        enterDigits();
        System.out.println(getDigit() + " в степени " + getDegree() + " = " + erect(digit));

        /*
         * Task 2
         * */
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item1", 10, 30));
        items.add(new Item("Item2", 2, 10));
        items.add(new Item("Item3", 32, 1500));
        items.add(new Item("Item1", 10, 30));
        items.add(new Item("Item2", 2, 10));
        items.add(new Item("Item2", 2, 10));
        items.add(new Item("Item3", 32, 1500));
        System.out.println("\n\n\nЕсть несколько вещиц определённой стоимости и веса:\n" + items.toString());


        BackPack backpack = new BackPack(68);
        backpack.makeAllSets(items);
        System.out.println("----------------------------------------------------------------------\n" +
                "Наиболее дорогой набор рюкзака при максимальном васа " + backpack.getMaxCargo() +
                " стоимостью " + backpack.getBestPrice() +
                " получится из этих вещей: \n" + backpack.getBestItems());


    }


}
