package dsa.elementary_sorts;

import dsa.shared.Helper;

public class SelectionSort {

    public static void selectionSort(int[] array) {

        //fillo prej elementit te pare dhe shko deri tek elementi i parafundit!
        for (int i = 0; i < array.length - 1; i++) {
            //cakto/supozo per vleren minimale
            //supozo se elementi ku jemi eshte me i vogel
            int min = i;
            //shko prej elementit vijues deri ne fund
            // tento gjej vlere me minimale se i supozuari
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            //nese minimumi i supozuar nyk eshte ne pozicionin e indeksit i
            //atehere ka logjik me inderru vendet
            if (min != i) {
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
    }


    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = minimum(array, i);
            if (min != i) {
                Helper.swap(array, min, i);
            }
        }
    }

    private static int minimum(int[] array, int startIndex) {
        int min = startIndex;

        for (int j = startIndex + 1; j < array.length; j++) {
            if (array[min] > array[j]) {
                min = j;
            }
        }
//        while (startIndex < array.length - 1) {
//            if (array[min] > array[startIndex + 1]) {
//                min = startIndex + 1;
//            }
//            startIndex++;
//        }

        return min;
    }

}















