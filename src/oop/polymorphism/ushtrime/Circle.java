package oop.polymorphism.ushtrime;

public final class Circle extends Shape {
    private double radius;

    public Circle(final double radius) {
//        radius++;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(final double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}









