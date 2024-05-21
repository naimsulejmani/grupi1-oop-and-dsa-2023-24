package oop.abstract_classes.example2;

public class Derived extends Base {

    public Derived() {
        System.out.println("Derived Constructor Called!");
    }

    @Override
    void fun() {
        System.out.println("Derived Fun Called!");
    }
}
