package oop.intro_to_classes_and_objects.examples;

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4,6);
        Rectangle r2 = new Rectangle(3,3);

        System.out.println(r1.area());
        System.out.println(r1.perimeter());
        System.out.println(r1.isSquare());
        System.out.println(r2.area());
        System.out.println(r2.perimeter());
        System.out.println(r2.isSquare());
    }

}
