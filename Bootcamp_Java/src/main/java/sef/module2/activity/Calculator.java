package sef.module2.activity;

public class Calculator {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int[] nums = {1, 2, 3, 4};
        IO.println("Addition - " + add(x, y));
        IO.println("Subtraction - " + subtract(x, y));
        IO.println("Multiply - " + multiply(nums));
        IO.println("Divide - " + divide(x, y));
    }
    private static int add(int x, int y) {
        int sum = x + y;
        return sum;
    }
    private static int subtract(int x, int y) {
        int diff = x - y;
        return diff;
    }
    private static int multiply(int[] numbers) {
        int temp = 1;
        for (int i = 0; i < numbers.length; i++) {
            temp = temp * numbers[i];
        }
        return temp;
    }
    private static int divide(int x, int y) {
        int divValue = 0;
        if (y != 0) {
            divValue = x / y;
        }
        return divValue;
    }
}
