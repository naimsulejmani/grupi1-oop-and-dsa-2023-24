package dsa.elementary_sorts;

import dsa.shared.ArrayGenerator;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSortDemo {
    public static void main(String[] args) {
        int[] array = ArrayGenerator.generateArray(15, 0, 100);
        System.out.println("Vargu i pasortuar: ");
        System.out.println(Arrays.toString(array));
        System.out.println("Vargu i sortuar: ");
        InsertionSort.insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}








