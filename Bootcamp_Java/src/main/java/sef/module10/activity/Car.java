package sef.module10.activity;

/**
 * Represents a car, providing custom implementations of Vehicle methods.
 */
public class Car implements Vehicle {
    /**
     * Starts the car.
     */
    @Override
    public void start() {
        IO.println("Car engine is starting with the ignition key");
    }

    /**
     * Stops the car.
     */
    @Override
    public void stop() {
        IO.println("Car is stopping using the brake pedal");
    }
}
