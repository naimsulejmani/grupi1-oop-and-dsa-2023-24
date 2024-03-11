package dsa.searching;

public class Ushtrimi1 {
    public static int sum(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;
    }


    public static int multiply(int[] array) {
        int multiply = 1;
        for (int number : array) {
            multiply *= number;
        }
        return multiply;
    }


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(sum(array));

        System.out.println(multiply(array));
    }
}















