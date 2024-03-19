package oop.intro_to_classes_and_objects.examples;

public class Circle {
    private double radius = 1;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0)
            this.radius = radius;
        else
            System.out.println("Nuk guxon te kete vlera <= se 0");

    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }
}


















