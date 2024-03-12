package oop.intro_to_classes_and_objects.summary1;

public class Counter {
    private static final int MAX = 100;
    private int value;

    public void increment() {
        if (value < MAX)
            value++;
        else
            reset();
    }
    public int getValue() {
        return value;
    }
    public void reset() {
        value = 0;
    }
}
