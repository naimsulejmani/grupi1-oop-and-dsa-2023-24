package dsa.linked_lists.doubly_linked_list;

public class LinkedList {
    private Node head; // referenca e nyjes se pare
    private Node tail; // reference e nyjes se fundit
    private int size;

    public LinkedList() {

    }

    public boolean isEmpty() {
        return size == 0;
    }


    public void clear() {
        head = tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrev(newNode);

            head = newNode;
        }
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
            //addFirst(data);
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);

            tail = newNode;
        }
        size++;
    }


    public Integer findFirst() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return null;
        }
        return head.getData();
    }


    public Integer findLast() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return null;
        }
        return tail.getData();
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            head = head.getNext();
            head.setPrev(null);
            size--;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            tail = tail.getPrev();
            tail.setNext(null);
            size--;
        }
    }

    public void printAll() {
        Node current = head;
        while (current != null) {
            System.out.printf("%d -> ", current.getData());
            current = current.getNext();
        }
    }

    public void printAllReverse() {
        Node current = tail;
        while (current != null) {
            System.out.printf("%d -> ", current.getData());
            current = current.getPrev();
        }
    }

    private Node findNodeByIndex(int index) {
        if (isEmpty()) {
            System.out.println("List is empty");
            return null;
        }
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return null;
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }

    public void addBefore(int index, int data) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
        } else if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node current = findNodeByIndex(index);
            Node prev = current.getPrev();
            Node newNode = new Node(data);

            prev.setNext(newNode);
            newNode.setPrev(prev);

            newNode.setNext(current);
            current.setPrev(newNode);

            size++;

        }
    }

    /*

            int findByIndex(int index)
            void removeByIndex(int index)
            void append(int[] array)
            LinkedList(int[] array)
            int[] toArray()
            Node[] toArrayNode()
            void addAfterIndex(int index, int data);
            void addAfterIndex(int index, int[] array);
            void addBeforeIndex(int index, int[] array);

package dsa.linked_lists.doubly_linked_list;

public class LinkedList {
    private Node head; // referenca e nyjes se pare
    private Node tail; // reference e nyjes se fundit
    private int size;

    public LinkedList() {

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrev(newNode);

            head = newNode;
        }
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
            //addFirst(data);
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);

            tail = newNode;
        }
        size++;
    }


    public Integer findFirst() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return null;
        }
        return head.getData();
    }


    public Integer findLast() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return null;
        }
        return tail.getData();
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            head = head.getNext();
            head.setPrev(null);
            size--;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            tail = tail.getPrev();
            tail.setNext(null);
            size--;
        }
    }

    public void printAll() {
        Node current = head;
        while (current != null) {
            System.out.printf("%d -> ", current.getData());
            current = current.getNext();
        }
    }

    public void printAllReverse() {
        Node current = tail;
        while (current != null) {
            System.out.printf("%d -> ", current.getData());
            current = current.getPrev();
        }
    }

    private Node findNodeByIndex(int index) {
        if (isEmpty()) {
            System.out.println("List is empty");
            return null;
        }
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return null;
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }

    public void addBefore(int index, int data) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
        } else if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node current = findNodeByIndex(index);
            Node prev = current.getPrev();
            Node newNode = new Node(data);

            prev.setNext(newNode);
            newNode.setPrev(prev);

            newNode.setNext(current);
            current.setPrev(newNode);

            size++;

        }
    }

    /*

            int findByIndex(int index)
            void removeByIndex(int index)
            void append(int[] array)
            LinkedList(int[] array)
            int[] toArray()
            Node[] toArrayNode()
            void addAfterIndex(int index, int data);
            void addAfterIndex(int index, int[] array);
            void addBeforeIndex(int index, int[] array);

        https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html

     */

}




















