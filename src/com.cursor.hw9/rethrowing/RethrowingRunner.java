package com.cursor.hw9.rethrowing;

public class RethrowingRunner {
    public void rethrowStart() {
        try {
            new Rethrowing().firstMethod();
        } catch (Exception rethrown) {
            rethrown.printStackTrace();
        }
    }
}
