package com.cursor.hw13.service;

public class Client extends Thread {
    public static HttpServer server = new HttpServer();
    private String name;
    private Request request;

    public Client(Request request, String name) {
        this.name = name;
        this.request = request;
    }

    @Override
    public void run() {
        server.getRequest(request, name);
    }
}
