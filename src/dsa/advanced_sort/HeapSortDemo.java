package dsa.advanced_sort;

import dsa.shared.ArrayGenerator;

import java.util.Arrays;

public class HeapSortDemo {
    public static void main(String[] args) {
        int[] array = ArrayGenerator.generateArray(15, 0, 100);
        System.out.println("Array before sorting:");
        System.out.println(Arrays.toString(array));

        new HeapSort().sort(array);

        System.out.println("Array after sorting:");
        System.out.println(Arrays.toString(array));

    }
}
