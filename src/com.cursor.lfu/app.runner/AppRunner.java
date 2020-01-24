package com.cursor.lfu.app.runner;

import com.cursor.lfu.lfu.task.LFUCache;
import com.cursor.lfu.lfu.task.CarNews;

public class AppRunner {
    LFUCache cache = new LFUCache(12);
    CarNews news = new CarNews();

    public void runApp() {
        news.addCarNews();
        System.out.println("Adding some news about cars using LFU :" + "\n");

        cache.put(1L, news.getValue("Volkswagen"));
        cache.put(2L, news.getValue("BMW"));
        cache.put(3L, news.getValue("Audi"));
        cache.put(4L, news.getValue("Toyota"));
        cache.put(5L, news.getValue("Renault"));
        cache.put(6L,news.getValue("Daihatsu"));
        cache.put(7L,news.getValue("Ford"));
        cache.put(8L,news.getValue("GMS"));
        cache.put(9L,news.getValue("Isuzu"));
        cache.put(10L,news.getValue("Infinity"));
        cache.put(11L,news.getValue("Suzuki"));
        cache.put(12L,news.getValue("Mercedes"));

        for (long i = 1L; i <= 12; i++) {
            if (cache.get(i) != null) {
                System.out.println("News for the key " + i + " is: " + cache.get(i));
            }
        }
    }
}
