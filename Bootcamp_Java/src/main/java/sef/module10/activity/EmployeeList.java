package sef.module10.activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Creates a list of Employee objects and identifies the highest-paid employee.
 */
public class EmployeeList {
    /**
     * Main entry point for running Activity 4.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        // Employee objects
        Employee emp1 = new Employee("Java Developer", "Accenture", 2200.0);
        emp1.setName("Raimonds");

        Employee emp2 = new Employee("QA Analyst", "Accenture", 1500.0);
        emp2.setName("Anna");

        Employee emp3 = new Employee("Tech Lead", "Accenture", 5200.0);
        emp3.setName("Laura");

        Employee emp4 = new Employee("Business Analyst", "Accenture", 3200.0);
        emp4.setName("Karlis");

        Employee emp5 = new Employee("DevOps Engineer", "Accenture", 4400.0);
        emp5.setName("Elina");

        // Create a List of Employees and add all 5 objects
        List<Employee> empList = new ArrayList<Employee>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);

        IO.println("The Employee whose salary is the highest is: " + Employee.getHighestPaidEmp(empList));
    }
}
