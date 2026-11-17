package sef.module5.activity;
// child class
public class Circle extends Shape {
    public double calculateArea(double length, double breadth, double radius) {
        return 3.14 * radius * radius;
    }
    public double calculatePerimeter(double length, double breadth, double radius) {
        return 2 * 3.14 * radius;
    }
}
