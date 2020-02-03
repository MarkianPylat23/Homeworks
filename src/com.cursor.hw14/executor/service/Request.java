package com.cursor.hw14.executor.service;

public class Request implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\n Done collecting data" + Thread.currentThread().getName());
    }

    public void showMessage() {
        System.out.println("\nRequesting Data...");
    }
}
