package com.example;

// Base Class
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

// Inheritance: AdvancedCalculator inherits from Calculator
class AdvancedCalculator extends Calculator {
    public int multiply(int a, int b) {
        return a * b;
    }
}

public class App {
    public static void main(String[] args) {
        AdvancedCalculator calc = new AdvancedCalculator();
        System.out.println("Addition (Inherited): " + calc.add(10, 5));
        System.out.println("Multiplication: " + calc.multiply(10, 5));
    }
}
