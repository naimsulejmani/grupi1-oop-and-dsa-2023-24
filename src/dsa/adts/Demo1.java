package dsa.adts;

import dsa.shared.ArrayGenerator;

import java.time.LocalDate;
import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        int[] array = ArrayGenerator.generateArray(10, 0, 100);

        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int shuma = mysteryXY(10, 20);
        System.out.println(shuma);

        String name = "Naim"; // char[] name = {'N','a','i','m'}
        name = name.toUpperCase(); // char[] name1 = {'N','A','I','M'}


        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.println(date.withYear(2020));
    }

    // e kum abstrahu qete metode qe me kthen 0 defualt, derisa te implementohet me vone
    private static int mysteryXY(int from, int to) {
        return from * 2 + to - 3;
    }
}
