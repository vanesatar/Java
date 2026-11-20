package sef.module10.activity;

import java.util.List;

/**
 * Represents an employee, extending the abstract Person class.
 */
public class Employee extends Person {
    private String jobTitle;
    private String company;
    private double salary;

    /**
     * Default no-argument constructor.
     */
    public Employee() {
    }

    /**
     * Constructs an Employee with job-specific details.
     *
     * @param jobTitle the employee's job title
     * @param company  the company where the employee works
     * @param salary   the employee's salary
     */
    public Employee(String jobTitle, String company, double salary) {
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    /**
     * Constructs an Employee with both personal and job-specific details.
     *
     * @param name     the employee's name
     * @param age      the employee's age
     * @param jobTitle the employee's job title
     * @param company  the company where the employee works
     * @param salary   the employee's salary
     */
    public Employee(String name, int age, String jobTitle, String company, double salary) {
        setName(name);
        setAge(age);
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    /**
     * Gets the employee's job title.
     *
     * @return the job title
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets the employee's job title.
     *
     * @param jobTitle the job title to set
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * Gets the company where the employee works.
     *
     * @return the company name
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the company where the employee works.
     *
     * @param company the company name to set
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * Gets the employee's salary.
     *
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets the employee's salary.
     *
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Prints an introduction of the employee, including personal and job details.
     */
    @Override
    public void introduce() {
        IO.println("My name is " + getName() + " and I am " + getAge() + " years old");
        IO.println("I work as " + jobTitle + " in " + company + " and my salary is " + salary);
    }

    /**
     * Finds and returns the name of the employee with the highest salary from a list.
     *
     * @param empList the list of Employee objects to evaluate
     * @return the name of the highest-paid employee, or null if the list is empty
     */
    public static String getHighestPaidEmp(List<Employee> empList) {
        if (empList == null || empList.isEmpty()) {
            return null;
        }

        Employee highestPaid = empList.get(0);
        for (Employee emp : empList) {
            if (emp.getSalary() > highestPaid.getSalary()) {
                highestPaid = emp;
            }
        }
        return highestPaid.getName();
    }
}

