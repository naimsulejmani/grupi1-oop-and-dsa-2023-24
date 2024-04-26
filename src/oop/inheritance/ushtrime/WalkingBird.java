package oop.inheritance.ushtrime;

public class WalkingBird extends Bird {

    public WalkingBird(String call, String color, String food) {
        super(call, color, food, "walking");
    }

    @Override
    public String toString() {
        return "WalkingBird{" + super.toString() + "}";
    }
}
