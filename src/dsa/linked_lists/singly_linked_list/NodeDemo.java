package dsa.linked_lists.singly_linked_list;

public class NodeDemo {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n20 = new Node(20);
        System.out.println(n1);
        System.out.println(n20);
        n1.setNext(n20);
        System.out.println(n1);
        n20.setNext(new Node(30));
        System.out.println(n1);
        Node n0 = new Node(0);
        n0.setNext(n1);
        System.out.println(n0);
        Node n15 = new Node(15);
        n15.setNext(n1.getNext());//
        n1.setNext(n15);
        System.out.println(n1);
        System.out.println(n0.getNext().getNext().getNext());
    }
}







