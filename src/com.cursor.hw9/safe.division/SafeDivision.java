package com.cursor.hw9.safe.division;

import java.util.Scanner;

public class SafeDivision {
    private int firstNumber;
    private int secondNumber;
    private Scanner scanner = new Scanner(System.in);

    private void enterFirstNumber() {
        System.out.println("Enter first number - ");
        firstNumber = scanner.nextInt();
    }

    private void enterSecondNumber() {
        System.out.println("Enter second number - ");
        secondNumber = scanner.nextInt();
    }
    public void divideOperation() {
        int divide;
        enterFirstNumber();
        enterSecondNumber();
        try {
            divide = firstNumber / secondNumber;
            System.out.println("Division result = " + divide);
        } catch (ArithmeticException exception) {
            System.out.println("You can't divide by null, enter another second number");
            enterSecondNumber();
            divideOperation();
        }
    }
}
