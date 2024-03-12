package dsa.searching;

public class BinarySearch {
    public static int searchIndex(int[] array, int searchValue) {

        int low = 0; //elementi i pare ne varg
        int high = array.length - 1; // elementi i fundit ne varg

        //perderisa indexi i pare eshte me i vogel ose i
        //barabarte me index-in e fundit
        while (low <= high) {
            int mid = (low + high) / 2; // gjej indeksin e mesit

            //Nese elementi qe po kerkojme eshte i barabarte me elementin
            // e indeksit te mesit qe po e kalkulojme
            if (searchValue == array[mid]) {
                return mid;
            } else if (searchValue < array[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }


    public static int searchIndexRecursively(int[] array, int searchElement, int low, int high) {
        if (low > high) return -1; // rasti baze kur nuk gjendet
        int mid = (low + high) / 2;
        if (searchElement == array[mid])
            return mid;
        else if (searchElement < array[mid])
            return searchIndexRecursively(array, searchElement, low, mid - 1);
        else
            return searchIndexRecursively(array, searchElement, mid + 1, high);
    }

    public static int searchIndexRecursively(int[] array, int searchElement) {
        return searchIndexRecursively(array, searchElement, 0, array.length - 1);
    }


    public static boolean contains(int[] array, int searchValue) {
        return searchIndex(array, searchValue) >= 0;
    }


    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99, 100};
        int index = searchIndex(array, 88);
        boolean exist = contains(array, 88);
        System.out.println(index);
        System.out.println(exist);

        int indexR = searchIndexRecursively(array, 88);
        System.out.println("IndexR = " + indexR);
    }
}













