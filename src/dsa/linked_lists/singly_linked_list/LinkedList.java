package dsa.linked_lists.singly_linked_list;

public class LinkedList {
    private Node head;

    private int size;

    public LinkedList() {
    }

    public boolean isEmpty() {
        return head == null;
    }


    public void addFirst(int data) {
        //1.  krijo nyjen e re
        Node newNode = new Node(data);
        //2. dergo te nyja paraprake (head)
        newNode.setNext(head);
        //3. head behet nyja e re
        head = newNode;
        size++;
    }

    public void printAll() {
        //System.out.println(head);
        Node current = head; //variable lokale ndihmse e cila pointon te head
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

    public void addLast(int data) {
        if (isEmpty())
            addFirst(data);
            // nese ska element ne liste atehere elementi i fundit eshte i pari
        else {
            //1. krijo nyjen e re
            Node newNode = new Node(data);
            //2. gjeje poziten se ku ki me vendose elementin e ri ne fund
            Node current = head; // nisuy prej head
            //perderisa elementi vijues(next) ka reference eshte e ndryshuemshme prej null
            while (current.getNext() != null) {
                //shko te elementi vijues (i rradhes - next)
                current = current.getNext();
            }
            current.setNext(newNode);
            size++;
        }
    }

    public int size() {
        return size;
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            head = head.getNext();//head eshte elementi i rradhes
            size--;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else if (size() == 1) {
            removeFirst();
        } else {
            Node current = head;
            while (current.getNext().getNext() != null) {
                current = current.getNext();
            }
            current.setNext(null);
            size--;
        }
    }


    /*
            addAfterIndex(int index, int data)
            removeByIndex(int index)
            findLast()
            findFirst()
            findByIndex(int index)
            findPrevious(Node node)
            toArray() -> int[10,20,30]
            toArrayNode() -> Node[]
            LinkedList(int[] array)
            append(int[] array)
     */
}






