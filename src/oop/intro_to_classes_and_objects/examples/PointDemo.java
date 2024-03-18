package oop.intro_to_classes_and_objects.examples;

public class PointDemo {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(1.4, 5.9);

        System.out.printf("(%.2f, %.2f)%n", p1.getX(), p1.getY());
        System.out.printf("(%.2f, %.2f)%n", p2.getX(), p2.getY());

        System.out.printf("Distanca eshte: %.2f%n", p1.distanceTo(p2));
        System.out.printf("Distanca eshte: %.2f%n", p2.distanceTo(p1));
        System.out.printf("Distance eshte: %.2f%n", Point.distanceBetween(p1, p2));
    }
}
