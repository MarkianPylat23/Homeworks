package com.cursor.hw14.executor.service;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HttpServer {
    private static final int NUM_OF_CITIES = 10;
    private static final int LIMIT_OF_CITIES = 11;

    public void performRequest(Request request) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        int randomNum = getRandomNum();
        executorService.submit(request);
        request.showMessage();

        try {
            if (randomNum > NUM_OF_CITIES) {
                throw new IllegalThreadStateException();
            } else {
                showStatus();
            }
        } catch (IllegalThreadStateException i) {
            System.out.println("\nSERVER: ERROR" + "\nTrying again...");
            executorService.submit(request);
        }
        executorService.shutdown();
    }

    public void showStatus() {
        System.out.println("City's connection successful");
    }

    private int getRandomNum() {
        Random random = new Random();
        return random.nextInt(LIMIT_OF_CITIES);
    }
}
