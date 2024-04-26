package oop.inheritance.ushtrime;

public class FlyingBird extends Bird {

    public FlyingBird(String call, String color, String food) {
        super(call, color, food, "flying");
    }

    @Override
    public String toString() {
        return "FlyingBird{" + super.toString() + "}";
    }
}
