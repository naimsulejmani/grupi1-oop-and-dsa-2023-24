package oop.intro_to_classes_and_objects.summary1;

public class NotDuplicateDemo {
    public static void main(String[] args) {
        Counter tespiht = new Counter();
        Counter test = tespiht;
        test = new Counter();
        test.increment();

        tespiht.increment();
        System.out.println(test.getValue());
        System.out.println(tespiht.getValue());


        int x = 10;
        int y = x;
        x++;
        System.out.println(y);

    }
}
