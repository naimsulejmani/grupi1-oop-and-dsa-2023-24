package oop.summary_references;

public class Counter {
    private int value;
    private int step = 1;

    public Counter() {

    }

    public Counter(int step) {
        this.step = step;
    }

    public int getValue() {
        return value;
    }

    public int getStep() {
        return step;
    }

    public void increment() {
        this.value += step;
    }

    public void decrement() {
        this.value -= step;
    }

}










