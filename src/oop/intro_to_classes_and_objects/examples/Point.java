package oop.intro_to_classes_and_objects.examples;

public class Point {
    private double x;
    private double y;

    public Point() {

    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distanceTo(Point anotherPoint) {
        return Math.sqrt(
                Math.pow(anotherPoint.x - this.x, 2) +
                        Math.pow(anotherPoint.y - this.y, 2)
        );
    }

    public static double distanceBetween(Point from, Point to) {
        return from.distanceTo(to);
    }


}








