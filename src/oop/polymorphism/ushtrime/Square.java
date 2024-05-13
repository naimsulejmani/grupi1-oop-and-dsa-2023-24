package oop.polymorphism.ushtrime;

public class Square extends Shape {
    private int side;

    public Square(final int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public final double area() {
        return side * side;
    }


    public double perimeter() {
        return 4 * side;
    }
}
