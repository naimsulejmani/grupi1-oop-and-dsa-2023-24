package dsa.advanced_sort;

import dsa.shared.Helper;

import java.util.Arrays;

//T
public class HeapSort {
    public void sort(int[] array) {

        //ndertu pemen heap - stogun
        //nese i kemi 20 elemente 20/2 spaku 10 here ka me kontrollu stogun kur e krijojme
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            heapify(array, array.length, i);
        }
        //ne kete pjese ish dasht stogu jone me qene i krijuar
        System.out.println(Arrays.toString(array));

        //shthurja e elemnetit nga stogu heap - nga tree
        //zakonisht hhejet elementi 0 - elementi i pare
        //duke i zavendesu me elementin e fundit, root swap me elementin e fundit
        // e pastaj e ban heapify pjsen e mebutr (length-1), (length-2)

        for (int i = array.length - 1; i >= 0; i--) {
            //bej swap elementin e pare me te fundit
            Helper.swap(array, 0, i);
            heapify(array, i, 0);
        }


    }

    private void heapify(int[] array, int length, int currentIndex) {
        int largestIndex = currentIndex;
        int leftIndex = currentIndex * 2 + 1;
        int rightIndex = leftIndex + 1;

        //nese femija e anes majt eshte  i madh atehere largestIndex eshte ana e makjt
        if (leftIndex < length && array[leftIndex] > array[largestIndex]) {
            largestIndex = leftIndex;
        }
        //nese femija e i anes se djatht eshte me i madh se largest index atehere me i madh ana e djatht
        if (rightIndex < length && array[rightIndex] > array[largestIndex]) {
            largestIndex = rightIndex;
        }

        if(largestIndex != currentIndex) {
            Helper.swap(array, currentIndex, largestIndex);
            //beni heapify prej elemeitt larges e tutje
            heapify(array, length, largestIndex);
        }
    }
}
