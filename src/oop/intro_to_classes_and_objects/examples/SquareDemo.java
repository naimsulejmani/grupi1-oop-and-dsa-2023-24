package oop.intro_to_classes_and_objects.examples;

public class SquareDemo {
    public static void main(String[] args) {
        Square s1 = new Square(2);
        Square s2 = new Square(5);
        Square s3 = new Square(7);

        System.out.println(s1.area());
        System.out.println(s1.perimeter());
        s1.draw();

        System.out.println(s1.compareTo(s2
        ));

    }
}
