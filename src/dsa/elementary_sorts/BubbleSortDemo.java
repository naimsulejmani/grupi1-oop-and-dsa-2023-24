package dsa.elementary_sorts;

import dsa.shared.ArrayGenerator;

import java.util.Arrays;

public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] array = ArrayGenerator.generateArray(10, 0, 100);
        System.out.println(Arrays.toString(array));
        BubbleSort.bubbleSort(array);
        System.out.println(Arrays.toString(array));

        int[] array2 = {1, 2, 3, 4, 5};
        BubbleSort.bubbleSort(array2);
        System.out.println(Arrays.toString(array2));
    }
}











