package com.cursor.hw11.app.runner;

public class AppRunner {
    public void runApp() {
        int[] array = new int[Integer.MAX_VALUE];

        for (int i = 0; i < array.length; ++i)
            array[i] = i + 1;
    }
}
