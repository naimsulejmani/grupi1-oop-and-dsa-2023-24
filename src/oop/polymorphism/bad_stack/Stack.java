package oop.polymorphism.bad_stack;

import java.util.ArrayList;

public class Stack<T> extends ArrayList<T> {

    public void push(T t) {
        this.addLast(t);
    }

    public T pop() {
        T t = this.getLast();
        this.removeLast();
        return t;
    }

}
