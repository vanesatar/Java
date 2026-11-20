package sef.module10.activity;

/**
 * Provides basic arithmetic operations with exception handling.
 */
public class Calculator {

    /**
     * Adds two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Adds three integers (overloaded add method).
     *
     * @param a the first integer
     * @param b the second integer
     * @param c the third integer
     * @return the sum of a, b, and c
     */
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    /**
     * Subtracts the second integer from the first.
     *
     * @param a the integer to subtract from
     * @param b the integer to subtract
     * @return the difference between a and b
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Divides the first integer by the second.
     * Catches ArithmeticException if division by zero is attempted.
     *
     * @param a the dividend
     * @param b the divisor
     * @return the quotient, or 0 if division by zero occurs
     */
    public int divide(int a, int b) {
        int result = 0;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            IO.println("Cannot divide by zero!");
        }
        return result;
    }

    /**
     * Multiplies two integers.
     * Throws and catches CustomException if either input is 0.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the product of a and b, or 0 if an invalid input is provided
     */
    public int multiply(int a, int b) {
        int result = 0;
        try {
            if (a == 0 || b == 0) {
                throw new CustomException("Multiplication by zero is not allowed");
            }
            result = a * b;
        } catch (CustomException e) {
            IO.println("CustomException caught: " + e.getMessage());
        }
        return result;
    }
}
