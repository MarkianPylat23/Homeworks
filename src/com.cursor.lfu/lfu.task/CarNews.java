package com.cursor.lfu.lfu.task;

import java.util.HashMap;
import java.util.Map;

public class CarNews {
    private Map<String, String> carBrendToNews = new HashMap<>();

    public void addCarNews() {
        carBrendToNews.put("Volkswagen", "There will be a new model of Golf in 2020 ");
        carBrendToNews.put("BMW","Company will show new electric car on base i3 ");
        carBrendToNews.put("Audi","Customers can buy audi e-tron in 2020 ");
        carBrendToNews.put("Toyota","The new sports car will be show in March ");
        carBrendToNews.put("Renault","Company lose 1 million dollars and got a lot of credits");
        carBrendToNews.put("Daihatsu","Company closed because of debts");
        carBrendToNews.put("Ford","Engineers will create new model of pickup");
        carBrendToNews.put("GMS","New way of tuning is unlocked");
        carBrendToNews.put("Isuzu","Truck from Isuzu gets status of best truck in Ukraine");
        carBrendToNews.put("Infinity","QX50 sets new record on track");
        carBrendToNews.put("Suzuki","New model Jimny is the copy of Mercedes G500");
        carBrendToNews.put("Mercedes","Tuning lab Brabus will create modified model of S63 coupe");
    }

    public String getValue(String key) {
        return carBrendToNews.get(key);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
