package oop.intro_to_classes_and_objects.examples;

public class Rectangle {

    private double a = 1;
    private double b = 2;

    public Rectangle(double a, double b) {
//        if (a == b) {
//            System.out.println("Vlerat i ke marr per katrore!");
//            return;
//        }
        setA(a);
        setB(b);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (a > 0)
            this.a = a;
        else
            System.out.println("Nuk guxon te kete vlera <= me 0");
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        if (b > 0)
            this.b = b;
        else
            System.out.println("Nuk guxon te kete vlera <= me 0");

    }

    public double perimeter() {
        return 2 * a + 2 * b;
    }

    public double area() {
        return a * b;
    }

    public boolean isSquare() {
        return a == b;
    }

}























