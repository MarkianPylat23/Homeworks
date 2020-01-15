package com.cursor.hw11.app.runner;

public class AppRunner {
    public void runApp() {
        int[] array = new int[Integer.MAX_VALUE];

        for (int index :array) {
            array[index] = index + 1;
        }
    }
}
