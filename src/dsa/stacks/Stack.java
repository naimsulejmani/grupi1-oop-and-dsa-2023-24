package dsa.stacks;

public class Stack<T> {
    private static final int MAX_SIZE = 100;
    private Element<T> top;
    private int size;

    public Stack() {
    }

    public boolean isEmpty() {
        return size == 0;
        // return top == null;
    }

    public boolean isFull() {
        return size == MAX_SIZE;
    }

    public int size() {
        return size;
    }

    //addFirst
    public void push(T value) throws StackOverflowException {
        if (isFull()) {
            throw new StackOverflowException("Stack is full");
        }
        Element<T> newElement = new Element<>(value);
        newElement.setNext(top);
        top = newElement;
        size++;
    }

    public T pop() throws StackUnderflowException {
//        if (isEmpty()) {
//            throw new StackUnderflowException("Stack is empty!");
//        }
//        Element<T> temp = top;
//        top = top.getNext();
//        temp.setNext(null);
//        size--;
//        return temp.getElement();
        T element = peek();
        top = top.getNext();
        size--;
        return element;
    }

    public T peek() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException("Stack is empty!");
        }
        return top.getElement();
    }


}







