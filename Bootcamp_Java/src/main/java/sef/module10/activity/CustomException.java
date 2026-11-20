package sef.module10.activity;

/**
 * Custom exception thrown when an invalid input is passed to a calculator operation.
 */
public class CustomException extends Exception {
    /**
     * Constructs a new CustomException with the specified detail message.
     *
     * @param message the detail message explaining the invalid input
     */
    public CustomException(String message) {
        super(message);
    }
}
