package sef.module2.activity;

public class MultiplicationTable {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 11; i <= 20; i++) {
            IO.println("*** Table of " + i + " ***");
            for (int j = 1; j <= 10; j++) {
                IO.println(i + " * " + j + " = " + (i * j));
            }
        }
        IO.println();
    }
}
