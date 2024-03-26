package dsa.elementary_sorts;

public class InsertionSort {
    public static void insertionSort(int[] array) {

        //fillo prej elementit te dyte ne varg, prej pjeses se pa sortuar
        for (int pointer = 1; pointer < array.length; pointer++) {
            //gjeje poziten ne pjesen e vargut te sortuar
            int current = array[pointer];
            int position = pointer;
            //perderisa sjemi mri te pozita 0
            // dhe elementi paraprak eshte me i madh se current
            while (position > 0 && array[position - 1] > current) {
                //elementit paraprak po i themi, shko ne poziten teme
                array[position] = array[position - 1];
                position--; // shko ne poziten tjeter per krahasim
            }
            array[position] = current;

        }
    }
}












