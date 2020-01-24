package com.cursor.lfu.lfu.task;

import java.util.HashMap;
import java.util.Map;

public class CarNews {
    private Map<String, String> carNews = new HashMap<>();

    public void addCarNews() {
        carNews.put("Volkswagen", "There will be a new model of Golf in 2020 ");
        carNews.put("BMW","Company will show new electric car on base i3 ");
        carNews.put("Audi","Customers can buy audi e-tron in 2020 ");
        carNews.put("Toyota","The new sports car will be show in March ");
        carNews.put("Renault","Company lose 1 million dollars and got a lot of credits");
        carNews.put("Daihatsu","Company closed because of debts");
        carNews.put("Ford","Engineers will create new model of pickup");
        carNews.put("GMS","New way of tuning is unlocked");
        carNews.put("Isuzu","Truck from Isuzu gets status of best truck in Ukraine");
        carNews.put("Infinity","QX50 sets new record on track");
        carNews.put("Suzuki","New model Jimny is the copy of Mercedes G500");
        carNews.put("Mercedes","Tuning lab Brabus will create modified model of S63 coupe");
    }

    public String getValue(String key) {
        return carNews.get(key);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
