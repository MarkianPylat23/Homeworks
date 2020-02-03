package com.cursor.hw14.executor;

import com.cursor.hw14.executor.app.runner.AppRunner;

public class Main {
    public static void main(String[] args) {
        new AppRunner().showCities();
        new AppRunner().startRequest();
    }
}
