package sef.module10.activity;

/**
 * Represents a bike, providing custom implementations of Vehicle methods.
 */
public class Bike implements Vehicle {
    /**
     * Starts the bike.
     */
    @Override
    public void start() {
        IO.println("Bike is starting by pedaling");
    }

    /**
     * Stops the bike.
     */
    @Override
    public void stop() {
        IO.println("Bike is stopping using hand brakes");
    }
}
