package sef.module5.activity;
// child class
public class Rectangle extends Shape {
    public double calculateArea(double length, double breadth, double radius) {
        return length * breadth;
    }
    public double calculatePerimeter(double length, double breadth, double radius) {
        return 2 * (length + breadth);
    }
}
