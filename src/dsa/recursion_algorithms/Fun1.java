package dsa.recursion_algorithms;

public class Fun1 {
    public static void printFun(int test) {
        if (test < 1)
            return;
        else {
            System.out.printf("%d ", test);
            printFun(test - 1);
            System.out.printf("%d ", test);
        }
    }

    public static void main(String[] args) {
        printFun(3);
    }
}
