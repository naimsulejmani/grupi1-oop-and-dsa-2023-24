package oop.polymorphism;

public class Main {
    public static void main() {
        System.out.println("a");
    }

    public static void main(String args) {
        System.out.println(args);
    }

    // data-type... -> varargs
    public static void main(String... args) {
        main();
        main("a");

    }


}
