package oop.interfaces.ushtrime4;

public class StoneDemo {
    public static void main(String[] args) {
        Wrestler cold = new StoneCold(250);

        cold.themeMusic();
        cold.finisher();
        cold.paymentForWork(4);
    }
}
