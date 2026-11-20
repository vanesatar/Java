package sef.module10.activity;

/**
 * Demonstrates interface implementation by calling start() and stop()
 * on Bike and Car instances.
 */
public class InterfaceActivityClass {
    /**
     * Main entry point for running Activity 6.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        // Call Bike methods
        Vehicle bike = new Bike();
        bike.start();
        bike.stop();

        IO.println(); // Blank line for readability

        // Call Car methods
        Vehicle car = new Car();
        car.start();
        car.stop();
    }
}
