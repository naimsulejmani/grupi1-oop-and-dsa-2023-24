package dsa.linked_lists.singly_linked_list;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);

        list.addLast(40);
        list.addAfterIndex(2, 35);
        list.addAfterIndex(4, 45);

        System.out.println("-------------------");
        System.out.println("First:" + list.findFirst());
        System.out.println("Last: " + list.findLast());
        System.out.println("-------------------");

//        list.removeLast();
//        list.removeFirst();

        list.printAll();
        System.out.println("PROVO PRAP");
        list.printAll();
    }
}












