package oop.generics;

public class NodeInt {
    private int value;
    private NodeInt next;

    public NodeInt() {
    }

    public NodeInt(int value, NodeInt next) {
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public NodeInt getNext() {
        return next;
    }

    public void setNext(NodeInt next) {
        this.next = next;
    }
}
