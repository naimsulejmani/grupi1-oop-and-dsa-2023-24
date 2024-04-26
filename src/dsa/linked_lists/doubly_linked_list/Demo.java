package dsa.linked_lists.doubly_linked_list;

public class Demo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(1);
        list.addLast(10);
        list.addBefore(1, 5);
        list.printAll();

        System.out.println("\n\n");
        list.printAllReverse();


    }
}
