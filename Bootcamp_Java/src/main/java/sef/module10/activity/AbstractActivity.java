package sef.module10.activity;

/**
 * Demonstrates polymorphism and abstraction by calling introduce()
 * on Employee and Students instances.
 */
public class AbstractActivity {
    /**
     * Main entry point for running Activity 2.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        // Create an Employee instance and call introduce()
        Employee employee = new Employee("Anna", 25, "QA analyst", "Accenture", 1500.0);
        employee.introduce();

        IO.println(); // Blank line for readability

        // Create a Students instance and call introduce()
        Students student = new Students();
        student.setSchoolName("University of Latvia");
        student.introduce();
    }
}
