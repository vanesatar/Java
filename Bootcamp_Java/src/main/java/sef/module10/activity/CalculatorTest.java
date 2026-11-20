package sef.module10.activity;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit tests for the Calculator class.
 */
public class CalculatorTest {
    private Calculator calculator;

    /**
     * Initializes a fresh Calculator instance before each test.
     */
    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    // --- ADD TESTS (4 tests using both overloaded methods) ---
    // test1
    @Test
    public void testAddTwoPositiveNumbers() {
        assertEquals(11, calculator.add(6, 5));
    }

    // test2
    @Test
    public void testAddTwoNegativeNumbers() {
        assertEquals(-9, calculator.add(-4, -5));
    }

    // test3
    @Test
    public void testAddThreePositiveNumbers() {
        assertEquals(13, calculator.add(6, 5, 2));
    }

    // test4
    @Test
    public void testAddThreeMixedNumbers() {
        assertEquals(3, calculator.add(6, -5, 2));
    }

    // --- SUBTRACT TESTS (2 tests) ---
    //test5
    @Test
    public void testSubtractTwoPositiveNumbers() {
        assertEquals(1, calculator.subtract(6, 5));
    }

    //test6
    @Test
    public void testSubtractResultingInNegative() {
        assertEquals(-5, calculator.subtract(5, 10));
    }

    // --- DIVIDE TESTS (2 tests, including exception handling) ---
    // test7
    @Test
    public void testDivideValidNumbers() {
        assertEquals(5, calculator.divide(20, 4));
    }

    //test8
    @Test
    public void testDivideByZeroExceptionHandled() {
        assertEquals(0, calculator.divide(5, 0));
    }

    // --- MULTIPLY TESTS (2 tests, including custom exception handling) ---
    //test9
    @Test
    public void testMultiplyValidNumbers() {
        assertEquals(20, calculator.multiply(5, 4));
    }

    //test10
    @Test
    public void testMultiplyByZeroCustomExceptionHandled() {
        assertEquals(0, calculator.multiply(3, 0));
    }
}
