package com.cursor.hw9.catching.exceptions;

import java.io.IOException;

public class ExceptionsCatcher {
    public void findExceptions() {
        try {
            throw new FirstException();
        } catch (FirstException exceptionA) {
            System.out.println(exceptionA.getFirstString());
        }

        try {
            throw new SecondException();
        } catch (SecondException exceptionB) {
            System.out.println(exceptionB.getSecondString());
        }

        try {
            throw new NullPointerException();
        } catch (NullPointerException exceptionC) {
            System.out.println("NullPointerException");
        }

        try {
            throw new IOException();
        } catch (IOException exceptionD) {
            System.out.println("IOException");
        }
    }
}
