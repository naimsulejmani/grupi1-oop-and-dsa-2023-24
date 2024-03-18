package dsa.recursion_algorithms;

public class SumOfArray {
    public static int sumOfArray(int[] array, int index) {
        if (index == 0) return array[index];
        return array[index] + sumOfArray(array, index - 1);
    }

    public static int sumOfArray(int[] array) {
        return sumOfArray(array, array.length - 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5};
        System.out.println(sumOfArray(array));
    }
}






