package dsa.hashing;

import oop.polymorphism.bad_example.Person;

public class Test {
    public static void main(String[] args) {
        String emri = "Naim";
        String mbiemri = "Sulejmani";

        System.out.println(emri.hashCode());
        System.out.println(mbiemri.hashCode());

        H1 h1 = new H1(10);
        System.out.println(h1.hashCode());

        Integer x = 10;
        System.out.println(x.hashCode());


        Boolean t1 = true;
        Boolean t2 = false;

        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
        String call = "call";
        System.out.println(call.hashCode());
    }
}
