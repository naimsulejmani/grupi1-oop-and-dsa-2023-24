package oop.mostra_provimi.detyra678;

public class Main {
    public static void main(String[] args) {
        Laptop li = new GamingLaptop("ASD", "asd", 8, 8, "ADSW");
        try {
            li.setRam(-1);
        } catch (LaptopException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Fundit");
        }
    }
}
