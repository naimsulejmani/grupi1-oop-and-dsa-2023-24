package oop.summary_references;

public class PassByValueAndReference {
    public static void main(String[] args) {

        int primitive = 10;
        changePrimitive(primitive);
        System.out.println("Primitive on main: " + primitive);

        Counter counter = new Counter(25);
        System.out.println("Counter main before calling changeRef1: " + counter.getValue());
        changeReference2(counter);
        System.out.println("Counter main after calling changeRef1: " + counter.getValue());
    }

    public static void changePrimitive(int primitive) {
        System.out.println("Before Primitive in changePrimitive: " + primitive);
        ++primitive;
        System.out.println("After Primitive in changePrimitive: " + primitive);
    }

    public static void changeReference1(Counter counter) {
        System.out.println("Before changeReference1: " + counter.getValue());
        counter.increment();
        System.out.println("After changeReference1: " + counter.getValue());
    }

    public static void changeReference2(Counter counter) {
        counter = new Counter(25);
        System.out.println("Before changeReference2: " + counter.getValue());
        counter.increment();
        System.out.println("After changeReference2: " + counter.getValue());
    }
}
















