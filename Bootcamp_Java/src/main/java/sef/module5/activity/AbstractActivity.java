package sef.module5.activity;
// main class
public class AbstractActivity {
    public static void main(String args[]) {
        Shape rectangle = new Rectangle();
        rectangle.setColor("Blue");
        IO.println("Color of rectangle is: " + rectangle.getColor());

        IO.println("Area of rectangle is: " + rectangle.calculateArea(2, 4, 0));
        IO.println("Perimeter of rectangle is: " + rectangle.calculatePerimeter(2, 4, 0));

        IO.println("-----------------------------");

        Shape circle = new Circle();
        circle.setColor("Pink");
        IO.println("Color of circle is: " + circle.getColor());

        IO.println("Area of circle is: " + circle.calculateArea(0, 0, 5));
        IO.println("Perimeter of circle is: " + circle.calculatePerimeter(0, 0, 5));
    }
}
