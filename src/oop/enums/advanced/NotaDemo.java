package oop.enums.advanced;

import java.util.Scanner;

public class NotaDemo {
    public static void main(String[] args) {
        Nota olti = Nota.DOBET;

        System.out.println(olti);
        System.out.println(olti.getValue());

        System.out.println("Zgjidh njeren nga notat: ");
        for (Nota nota : Nota.values()) {
            System.out.printf("%s -> %d %n", nota.toString(), nota.getValue());
        }
        Scanner reader = new Scanner(System.in);
        String notaStr = reader.nextLine();

        Nota nota = Nota.valueOf(notaStr.toUpperCase());
        System.out.println(nota);
        System.out.println(nota.getValue());

        System.out.println("Shkruaj noten: ");
        int notaValue = reader.nextInt();


        for (Nota note : Nota.values()) {
            if (note.getValue() == notaValue) {
                System.out.println(note);
                System.out.println(note.getValue());
            }
        }

        System.out.println("Hileja");
        Nota n = Nota.values()[notaValue - 1];
        System.out.println(n);
        System.out.println(n.getValue());
    }
}














