package com.cursor.lfu.app.runner;

import com.cursor.lfu.lfu.task.LFUCache;
import com.cursor.lfu.lfu.task.CarNews;

public class AppRunner {
    LFUCache cache = new LFUCache(5);
    CarNews news = new CarNews();

    public void runApp() {
        news.addCarNews();
        System.out.println("Adding some news about cars using LFU :" + "\n");

        cache.put(1L, news.getValue("Volkswagen"));
        cache.put(2L, news.getValue("BMW"));
        cache.put(3L, news.getValue("Audi"));
        cache.put(4L, news.getValue("Toyota"));
        cache.put(5L, news.getValue("Renault"));

        for (long i = 1L; i <= 5; i++) {
            if (cache.get(i) != null) {
                System.out.println("News for the key " + i + " is: " + cache.get(i));
            }
        }
    }
}
