package oop.generics;

public class NodeDouble {
    private double value;
    private NodeDouble next;

    public NodeDouble() {
    }

    public NodeDouble(double value, NodeDouble next) {
        this.value = value;
        this.next = next;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public NodeDouble getNext() {
        return next;
    }

    public void setNext(NodeDouble next) {
        this.next = next;
    }
}
