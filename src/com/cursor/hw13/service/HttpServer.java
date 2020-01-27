package com.cursor.hw13.service;

public class HttpServer {

    public synchronized void getRequest(Request request, String name) {
        System.out.println("Request number: " + request + " " + name);
        System.out.println(name + " is connecting");
        System.out.println(name + " : connection successful");
        System.out.println(name + " is creating a request");
        System.out.println(name + " : request completed \n");
    }
}
