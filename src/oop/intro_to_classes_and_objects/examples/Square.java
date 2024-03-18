package oop.intro_to_classes_and_objects.examples;

public class Square {
    private double a = 1;

    public Square(double a) {
        setA(a);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (a > 0)
            this.a = a;
        else
            System.out.println("Vlera duhet te jete me e madhe se 0");
    }


    public double perimeter() {
        return 4 * a;
    }

    public double area() {
        return a * a;
    }

    public void draw() {
        System.out.println("-----");
        System.out.println("|   |");
        System.out.println("-----");
    }

    public int compareTo(Square other) {
        if (this.a < other.a) {
            return -1;
        } else if (this.a > other.a) {
            return 1;
        } else {
            return 0;
        }


    }


}










