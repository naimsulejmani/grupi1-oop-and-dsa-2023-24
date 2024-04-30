package dsa.stacks;

public class StackArray<T> {
    private static final int MAX_SIZE = 100;
    private Object[] elements = new Object[MAX_SIZE];
    private int size;

    public StackArray() {
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == MAX_SIZE;
    }

    public int size() {
        return size;
    }

    public void push(T element) throws StackOverflowException {
        if (isFull()) {
            throw new StackOverflowException("Stack is full!");
        }
        elements[size++] = element;
    }

    public T pop() throws StackUnderflowException {
        T element = peek();
        elements[--size] = null;
        return element;
    }

    private T peek() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException("Stack is empty!");
        }
        return (T) elements[size - 1];
    }
}










