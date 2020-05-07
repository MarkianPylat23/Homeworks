package com.cursor.hw9.app.runner;

import com.cursor.hw9.catching.exceptions.ExceptionsCatcher;
import com.cursor.hw9.rethrowing.RethrowingRunner;
import com.cursor.hw9.safe.division.SafeDivision;

public class AppRunner {
    public void runApp() {
        System.out.println("Task 1");
        new ExceptionsCatcher().findExceptions();
        System.out.println("\n");

        System.out.println("Task2");
        new SafeDivision().divideOperation();
        System.out.println("\n");

        System.out.println("Task3");
        new RethrowingRunner().rethrowStart();
    }
}
