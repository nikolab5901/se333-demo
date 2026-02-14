package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    void addTest() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void subtractTest() {
        assertEquals(-1, calc.subtract(2, 3));
    }

    @Test
    void divideTest() {
        assertEquals(2, calc.divide(6, 3));
    }

    @Test
    void divideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calc.divide(1, 0));
    }

    @Test
    void describeTests() {
        assertEquals("negative", calc.describe(-5));
        assertEquals("zero", calc.describe(0));
        assertEquals("positive", calc.describe(7));
    }
}