package oop.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example2 {
    public static void main(String[] args) throws ProductException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("files/test.txt"));
            String line = reader.readLine();
            System.out.println(line);
        } catch (FileNotFoundException e) {
            System.out.println("Nuk po mundem me hap fajllin! Fajlli mungon!");
            return;
        } catch (IOException e) {
            throw new ProductException("nuk mundem me kriju produkt nga fajlli", e);
        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                System.out.println("Nuk po muj me mbylle fajllin!");
            }
        }
    }
}
