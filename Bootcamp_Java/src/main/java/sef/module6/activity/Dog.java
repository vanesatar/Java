package sef.module6.activity;

public class Dog implements Animal {
    public void animalSound() {
        IO.println("Dog says: 'Wuf Wuf'!");
    }
    public void sleep() {
        IO.println("Dog is sleeping!");
    }
}
