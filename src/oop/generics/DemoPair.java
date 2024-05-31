package oop.generics;

import java.time.LocalDate;

public class DemoPair {
    public static void main(String[] args) {
        Pair<Borxhliu, LocalDate> pair1 =
                new Pair<>(new Borxhliu("Rinesa", 500), LocalDate.now());

        Borxhliu borxhliu = pair1.getFirst();
    }
}
