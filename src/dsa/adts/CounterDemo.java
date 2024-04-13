package dsa.adts;

public class CounterDemo {
    public static void main(String[] args) {
        Counter counterOOP = new Counter("OOP");
        Counter counterDSA = new Counter("DSA");

        counterOOP.increment();
        counterOOP.increment();
        counterOOP.increment();
        System.out.println(counterOOP.tally());
        System.out.println(counterOOP.toString());
        System.out.println(counterDSA);
    }
}
