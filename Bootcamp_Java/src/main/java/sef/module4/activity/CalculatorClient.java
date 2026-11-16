package sef.module4.activity;

public class CalculatorClient {
    public static void main(String[] args) {

        Calculator normalCalc = new Calculator(Calculator.CALC_TYPE_BASIC);
        IO.println("*** Calculations will be performed using " + normalCalc.getCalculatorType() + " calculator ***");

        int result = normalCalc.add(4,5);
        IO.println("1) Add result is " + result);

        int[] mul = {2, 3, 4};
        result = normalCalc.multiply(mul);
        IO.println("2) Multiplication result is " + result);

        result = normalCalc.divide(10, 2);
        IO.println(("3) Division result is " + result));

        result = normalCalc.subtract(10, 2);
        IO.println(("4) Subtraction result is " + result));
    }
}
