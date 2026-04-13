package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {
    @Test
    public void testInheritance() {
        AdvancedCalculator calc = new AdvancedCalculator();
        // Testing inherited method
        assertEquals(15, calc.add(10, 5));
        // Testing child method
        assertEquals(50, calc.multiply(10, 5));
    }
}
