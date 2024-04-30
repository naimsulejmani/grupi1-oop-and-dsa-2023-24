package dsa.queues;

//Type Generics
public class Queue<T> {
    private static final int SPECIAL_EMPTY_VALUE = -1;
    private static final int MAX_SIZE = 100;
    private Object[] elements;
    private int head = SPECIAL_EMPTY_VALUE;
    private int tail = SPECIAL_EMPTY_VALUE;

    public Queue() {
        elements = new Object[MAX_SIZE];
    }

    public boolean isEmpty() {
        return head == SPECIAL_EMPTY_VALUE;
    }

    public boolean isFull() {
        return nextTailIndex() == head;
    }

    private int nextTailIndex() {
        return (tail + 1) % MAX_SIZE;
    }

    public void enqueue(T element) throws QueueOverflowException {
        if (isFull()) {
            throw new QueueOverflowException("Queue is full!");
        }
        tail = nextTailIndex();
        elements[tail] = element;
        //just at first item when is empty queue
        if (head == SPECIAL_EMPTY_VALUE) head = tail;
    }

    public T dequeue() throws QueueUnderflowException {
//        if (isEmpty()) {
//            throw new QueueUnderflowException("Queue is empty!");
//        }
//        T element = (T) elements[head];
        T element = peek();
        elements[head] = null;
        if (head == tail) {
            head = SPECIAL_EMPTY_VALUE;
            tail = SPECIAL_EMPTY_VALUE; // skemi nevoje por une e preferoj
        } else {
            head = (head + 1) % MAX_SIZE;
        }
        return element;
    }

    public T peek() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException("Stack is empty!");
        }
        return (T) elements[head];
    }

    public boolean offer(T element) {
        try {
            enqueue(element);
            return true;
        } catch (QueueOverflowException e) {
            return false;
        }
    }


}












