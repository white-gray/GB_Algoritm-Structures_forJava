package HW_lesson5;

import java.util.ArrayList;
import java.util.List;

public class BackPack {

    private List<Item> bestItems = null;

    private double maxCargo;
    private double bestPrice;

    public BackPack(double maxCargo) {
        this.maxCargo = maxCargo;
    }

    public List<Item> getBestItems() {
        return this.bestItems;
    }

    public double getBestPrice() {
        return bestPrice;
    }

    public double getMaxCargo() {
        return maxCargo;
    }

    /*
     * вычисляет общий вес набора предметов
     * */
    private double calcWeigth(List<Item> items) {
        double result = 0;
        for (Item item : items) {
            result += item.getWeigth();
        }
        return result;
    }

    /*
     * вычисляет общую стоимость выбранного набора предметов
     * */
    private double calcPrice(List<Item> items) {
        double result = 0;
        for (Item item : items) {
            result += item.getPrice();
        }
        return result;
    }

    /*
     * проверка, является ли данный набор лучшим решением задачи
     * */
    private void checkSet(List<Item> items) {
        if (this.bestItems == null) {
            if (this.calcWeigth(items) <= this.maxCargo) {
                this.bestItems = items;
                this.bestPrice = this.calcPrice(items);
            }
        } else {
            if (this.calcWeigth(items) <= this.maxCargo && this.calcPrice(items) > this.bestPrice) {
                this.bestItems = items;
                this.bestPrice = this.calcPrice(items);
            }
        }
    }

    /*
     * создание всех наборов перестановок значений
     * */
    public void makeAllSets(List<Item> items) {
        if (items.size() > 0) {
            this.checkSet(items);
        }
        for (int i = 0; i < items.size(); i++) {
            List<Item> newSet = new ArrayList<>(items);
            newSet.remove(i);
            makeAllSets(newSet);
        }
    }
}
