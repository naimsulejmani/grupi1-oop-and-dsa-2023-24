package oop.polymorphism.finalization;

public class LojaDemo {
    public static void main(String[] args) {
        Loja l1 = new Loja("Naim");
        Loja l2 = new Loja("Naim");
        l2.setName("Filan");

        System.out.println(l1.getName());
        System.out.println(l2.getName());

        Pes p1 = new Pes("PES 2024", 2024);
        System.out.println(p1.getName());
    }
}







