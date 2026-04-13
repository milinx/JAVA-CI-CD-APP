package com.example;

public class App {

    public int add(int a, int b) {
        return a + b;
    }

    public boolean isEven(int n) {
        return n % 2 == 0;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int factorial(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public boolean isPrime(int n) {
        if(n <= 1) return false;
        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println("Add: " + app.add(2,3));
    }
}