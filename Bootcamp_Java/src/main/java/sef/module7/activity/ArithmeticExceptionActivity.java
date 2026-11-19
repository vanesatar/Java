package sef.module7.activity;

public class ArithmeticExceptionActivity {
    public static void main(String[] args) {
        ArithmeticExceptionActivity obj = new ArithmeticExceptionActivity();
        obj.catchMe(10, 0);
        obj.catchMe(10, 2);
    }
    void catchMe(int num1, int num2) {
        try {
            int result = num1 / num2;
            IO.println("The result is: " + result);
        } catch (ArithmeticException e) {
            IO.println("Cannot divide by zero");
        } finally {
            IO.println("Thank you for using this program");
        }
    }
}
