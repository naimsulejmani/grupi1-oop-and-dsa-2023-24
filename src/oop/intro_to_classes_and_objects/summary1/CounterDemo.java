package oop.intro_to_classes_and_objects.summary1;

public class CounterDemo {
    public static void main(String[] args) {
        Counter ditetERamazanit = new Counter();
        Counter golatNapoli = new Counter();
        Counter golatBarcelona = new Counter();
        ditetERamazanit.increment();
        ditetERamazanit.increment();

        golatBarcelona.increment();
        golatNapoli.increment();
        golatNapoli.increment();

        System.out.println("Ditet e Ramazanit: " + ditetERamazanit.getValue());
        System.out.printf("Barcelona %d : %d Napoli%n",
                golatBarcelona.getValue(), golatNapoli.getValue());

    }
}














