package oop.polymorphism.good_stack;

import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> items = new ArrayList<>();
    public void push(T item) {
        this.items.addLast(item);
    }
    public T pop() {
        return this.items.removeLast();
    }
    public boolean isEmpty() {
        return this.items.isEmpty();
    }
    public int size() {
        return this.items.size();
    }
    public T peek() {
        return this.items.getLast();
    }
}





