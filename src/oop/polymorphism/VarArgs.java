package oop.polymorphism;

public class VarArgs {
    public static void main(String[] args) {

        int sum1 = add(new int[]{1, 2, 3, 4});
        int sum2 = add(new int[]{1, 2});

        int sum22 = mbledhiNumrat();
        int sum3 = mbledhiNumrat(1);
        int sum4 = mbledhiNumrat(1, 2);
        int sum5 = mbledhiNumrat(1, 2, 3, 4, 5, 6, 7);

    }

    public static int mbledhiNumrat(int... numrat) {
        int sum = 0;
        for (int numri : numrat) {
            sum += numri;
        }
        return sum;
    }

    public static int add(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

//    public static int add(int a, int b) {
//        return a + b;
//    }
}
