package dsa.elementary_sorts;

import dsa.shared.ArrayGenerator;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSortDemo {
    public static void main(String[] args) {
        //int[] array = {14,2,4123,23,123,4123213,123};
        int[] array = ArrayGenerator.generateArray(15, 0, 100);
        System.out.println(Arrays.toString(array));
        SelectionSort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}









