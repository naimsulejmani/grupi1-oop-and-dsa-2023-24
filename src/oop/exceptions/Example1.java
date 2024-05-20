package oop.exceptions;

import java.io.IOException;

public class Example1 {
    public static void main(String[] args) throws IOException, ProductException {
            doThings();
    }

    private static void doThings() throws IOException, ProductException {
        double rnd = Math.random();

        if (rnd < 0.34) throw new IOException("File missing!");
        else if (rnd < 0.67) throw new ProductException("Produkti mungon!");
        else throw new NullPointerException("Ska reference!");
    }
}
