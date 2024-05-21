package oop.abstract_classes;

public class ShapeDemo {
    public static void main(String[] args) {

        Shape shape1 = new Square();
        Shape shape2 = new Star();

        shape1.draw();
        shape2.draw();

//        Shape shape3 = new Shape();
//        shape3.draw();

    }
}
