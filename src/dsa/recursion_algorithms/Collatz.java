package dsa.recursion_algorithms;

public class Collatz {
    public static void collatz(int n) {
        System.out.printf("%d ", n);
        if (n == 1) return;
        else if (n % 2 == 0) collatz(n / 2);
        else collatz(n * 3 + 1);
    }

    public static void main(String[] args) {
        collatz(97);
    }
}
