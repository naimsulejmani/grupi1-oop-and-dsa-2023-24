package dsa.searching;

public class LinearSearch {
    public static int searchIndex(int[] array, int searchValue) {
        for (int index = 0; index < array.length; index++) {
            if (searchValue == array[index])
                return index;
        }
        return -1;
    }

    public static boolean contains(int[] array, int searchValue) {
//        for (int number : array) {
//            if (searchValue == number)
//                return true;
//        }
//        return false;
        return searchIndex(array, searchValue) >= 0;
    }


    public static void main(String[] args) {
        int[] array = {87, 12, 33, 99, 1, 2, 7, 54, 23, 49};
        int index = searchIndex(array, 7);
        boolean exist = contains(array, 7);
        System.out.println(index);
        System.out.println(exist);
    }
}









