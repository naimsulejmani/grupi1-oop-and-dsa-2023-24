package dsa.elementary_sorts;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        boolean swapped = true;
        // sa iterime ka me i pas
        for (int i = 0; i < array.length - 1 && swapped; i++) {
            swapped = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swapped = true;
                    // SWAP elements in array
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}


















