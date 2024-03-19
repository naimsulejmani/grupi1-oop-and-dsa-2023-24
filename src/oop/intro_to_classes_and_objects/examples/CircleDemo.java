package oop.intro_to_classes_and_objects.examples;

public class CircleDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        System.out.println(c1.perimeter());
        System.out.println(c1.area());
        System.out.println(c1.getDiameter());
    }
}
