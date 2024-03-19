package dsa.shared;

import java.util.Random;

public class ArrayGenerator {
    public static int[] generateArray(int size, int min, int max) {
        Random random = new Random();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(min, max + 1);
        }

        return array;
    }
}














