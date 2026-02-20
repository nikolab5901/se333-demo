package com.example;

// This is a simple calculator class that provides basic arithmetic operations and a method to describe an integer as negative, zero, or positive. The class includes methods for addition, subtraction, division (with error handling for division by zero), and a method to describe the sign of an integer.
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return a / b;
    }

    public String describe(int a) {
        if (a < 0) return "negative";
        if (a == 0) return "zero";
        return "positive";
    }
}