package oop.polymorphism;

import java.util.Scanner;

public class RuntimeVsCompileTimePolymorphism {
    public static void main(String[] args) {
        int sum1 = add(1, 2);
        double sum2 = add(3.3f, 2.2);

        Skaneri s1 = new Skaneri();
        Skaneri s2 = new SkaneriAutomatik();
        SkaneriAutomatik s3 = new SkaneriAutomatik();

//        print(s1);
//        print(s2);
//        print(s3);

        printObj(s1);
        printObj(s2);
        printObj(s3);
        printObj(new Scanner(System.in));
        printObj(new Main());
    }

    private static int add(int i, int i1) {
        return 0;
    }

    private static double add(float f, double d) {
        return f + d;
    }

    public static void print(Skaneri skaneri) {
        System.out.println(skaneri.toString());
    }

    public static void printObj(Object object) {
        System.out.println(object.toString());
    }
}







