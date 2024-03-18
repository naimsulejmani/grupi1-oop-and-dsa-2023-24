package dsa.recursion_algorithms;

import java.util.Scanner;

public class SumExample {
    public static int sum(int n) {
        if (n == 0) return 0; //  rasti baze - base cases
        return n + sum(n - 1);  // splitting strategy
    }

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int x = 10 + reader.nextInt();
        System.out.println(x);
        System.out.println(sum(10));
    }
}







