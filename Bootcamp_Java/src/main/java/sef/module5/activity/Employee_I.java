package sef.module5.activity;
// child class
public class Employee_I extends Person_I {
    private double salary;
    private String title;

    public Employee_I() {
        IO.println("I'm and Employee_I Constructor");
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}
