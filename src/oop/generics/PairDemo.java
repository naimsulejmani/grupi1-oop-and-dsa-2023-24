package oop.generics;

import oop.inheritance.ushtrime.Parrot;

import java.time.LocalDate;

public class PairDemo {
    public static void main(String[] args) {
        Pair<String, Double> borxhi1 = new Pair<>("Agoni", 4000.3);
        Pair<String, LocalDate> darsma = new Pair("Olti", LocalDate.now().plusYears(35));
    }
}
