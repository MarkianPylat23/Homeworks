package com.cursor.lfu.app.runner;

import com.cursor.lfu.lfu.task.LFUCache;
import com.cursor.lfu.lfu.task.CarNews;

import java.util.stream.IntStream;

public class AppRunner {
    private int capacity = 12;
    LFUCache cache = new LFUCache(capacity);
    CarNews news = new CarNews();

    public void runApp() {
        news.addCarNews();
        System.out.println("Adding some news about cars using LFU :" + "\n");

        cache.put(1, news.getValue("Volkswagen"));
        cache.put(2, news.getValue("BMW"));
        cache.put(3, news.getValue("Audi"));
        cache.put(4, news.getValue("Toyota"));
        cache.put(5, news.getValue("Renault"));
        cache.put(6,news.getValue("Daihatsu"));
        cache.put(7,news.getValue("Ford"));
        cache.put(8,news.getValue("GMS"));
        cache.put(9,news.getValue("Isuzu"));
        cache.put(10,news.getValue("Infinity"));
        cache.put(11,news.getValue("Suzuki"));
        cache.put(12,news.getValue("Mercedes"));

        IntStream.rangeClosed(1, 12).filter(i -> cache.contains(i) != null).mapToObj(i -> "News for the key " + i + " is: " + cache.contains(i)).forEach(System.out::println);
    }
}
