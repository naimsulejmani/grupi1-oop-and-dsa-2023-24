package oop.generics;

public class PairOne<T> {
    private T first;
    private T second;

    public PairOne(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "PairOne{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
