package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {

    App app = new App();

    @Test
    public void testAdd() {
        assertEquals(5, app.add(2,3));
    }

    @Test
    public void testEven() {
        assertTrue(app.isEven(4));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, app.multiply(2,3));
    }

    @Test
    public void testFactorial() {
        assertEquals(120, app.factorial(5));
    }

    @Test
    public void testPrime() {
        assertTrue(app.isPrime(7));
    }
}