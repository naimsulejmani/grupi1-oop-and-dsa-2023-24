package oop.inheritance.ushtrime;

public class Parrot extends FlyingBird {
    public Parrot(String call, String color, String food) {
        super(call, color, food);
    }

    @Override
    public String toString() {
        return "Parrot{" + super.toString() + "}";
    }
}
