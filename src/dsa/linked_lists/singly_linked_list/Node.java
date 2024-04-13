package dsa.linked_lists.singly_linked_list;

public class Node {
    private int data; // e dhana
    private Node next;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    // [10] --> [20] --> [30] --> null
    @Override
    public String toString() {
        return String.format("[%d] --> %s", data, next);
    }
}
