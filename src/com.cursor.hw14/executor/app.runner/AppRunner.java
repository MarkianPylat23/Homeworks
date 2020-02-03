package com.cursor.hw14.executor.app.runner;

import com.cursor.hw14.executor.service.HttpServer;
import com.cursor.hw14.executor.service.Request;

public class AppRunner {

    private static final int numOfRequest = 10;

    public void showCities() {
        System.out.print("\n1 - Lviv\n 2 - Kyiv \n 3 - Ternopil\n 4 - Sumy\n " +
                "5 - Ivano-Frankivsk\n 6 - Cherkasy\n 7 - Chernivtsi" +
                "8 - Mariupol\n 9 - Kharkiv\n 10 - Rivne\n");
    }

    public void startRequest() {
        HttpServer server = new HttpServer();
        for (int start = 0; start < numOfRequest; start++) {
            server.startRequest(new Request());
        }
    }
}
