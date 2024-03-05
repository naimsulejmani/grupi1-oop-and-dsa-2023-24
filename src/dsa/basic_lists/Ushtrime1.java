package dsa.basic_lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Ushtrime1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Sa nota keni me i vendorus: ");
        int totalNota = reader.nextInt();

        ArrayList notat = new ArrayList(totalNota);

        for (int i = 0; i < totalNota; i++) {
            System.out.printf("Shkruaj noten e %d: ", i + 1);
            int nota = reader.nextInt();
            notat.add(nota);
            //notat.add(reader.nextInt());
        }

        System.out.println("Lista e notave te studentit eshte: ");
        System.out.println(notat);

        int notaMin = Integer.MAX_VALUE;
        int notaMax = Integer.MIN_VALUE;
        int notaSum = 0;

        for (Object element : notat) {
            int nota = (int) element;

            if (notaMin > nota) notaMin = nota;
            if (notaMax < nota) notaMax = nota;
            notaSum += nota;
        }

        double notaAvg = (double) notaSum / notat.size();

        System.out.printf("Nota minimale eshte %d%n", notaMin);
        System.out.printf("Nota maximale eshte %d%n", notaMax);
        System.out.printf("Mesatarja e notave eshte %.2f%n", notaAvg);


    }
}












