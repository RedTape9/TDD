package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void return30_whenAIs20AndBIs10() {
        //GIVEN
        int a = 20;
        int b = 10;
        int expected = 30;
        // WHEN
        int actual = Main.sum(a, b);
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void return20_whenDifferenceOf40And20() {
        //GIVEN
        int a = 40;
        int b = 20;
        int expected = 20;
        // WHEN
        int actual = Main.difference(a, b);
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void returnTrue_whenNumberIsEven() {
        // GIVEN
        int n = 10;
        // WHEN
        boolean actual = Main.isEvenNumber(n);
        // THEN
        assertTrue(actual);
    }

    @Test
    public void testMultiply() {

        assertEquals(10, Main.multiply(2, 5));
        assertEquals(0, Main.multiply(0, 5));
        assertEquals(-6, Main.multiply(-2, 3));
        assertEquals(6, Main.multiply(-2, -3));
    }

    @Test
    void getInUpperCase() {
        assertEquals("HALLO", Main.getInUpperCase("Hallo"));
    }

    @Test
    public void testGetInUpperCaseWithNullInput() {
        assertNull(Main.getInUpperCase(null));
    }

    @Test
    public void testIsPositiveOrNot() {
        assertTrue(Main.isPositive(5));
        assertFalse(Main.isPositive(0));
        assertFalse(Main.isPositive(-3));
    }
}
