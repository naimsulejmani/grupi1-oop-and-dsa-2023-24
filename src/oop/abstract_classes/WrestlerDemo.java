package oop.abstract_classes;

public class WrestlerDemo {
    public static void main(String[] args) {
        Wrestler wrestler = new Kane();
        wrestler.paymentForWork(4);
        wrestler.themeMusic();
        wrestler.finisher();
    }
}
