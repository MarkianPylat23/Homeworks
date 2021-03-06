package com.cursor.hw14.executor.service;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HttpServer {
    private static final int numOfCities = 10;
    private static final int limit = 11;

    public void startRequest(Request request) { ;
        ExecutorService service = Executors.newSingleThreadExecutor();
        int criticalNum = getRandomNum();
        service.submit(request);
        request.showMessage();
        try {
            if (criticalNum > numOfCities) throw new IllegalThreadStateException();
            else showStatus();
        } catch (IllegalThreadStateException i) {
            System.out.println("\nSERVER: ERROR"
                    + "\n"
                    + "\nTrying again...");
            service.submit(request);
        }
        service.shutdown();
    }

    public void showStatus() {
        System.out.println("City's connection successful");
    }

    private int getRandomNum() {
        Random random = new Random();
        return random.nextInt(limit);
    }
}
