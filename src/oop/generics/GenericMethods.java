package oop.generics;

import java.io.Serializable;

public class GenericMethods {
    public static void main(String[] args) {

        String middle = getMiddle("Naim", "Agon", "Partin");
        System.out.println(middle);

        double middle1 = getMiddle(22.3, 11.3, 22.2);
        System.out.println(middle1);

        String text = concatenate("A", "B", "C", "D", 'E', 'F', 'G', 1);
        System.out.println(text);


        String text1 = concatenate(1, 2, 3, 4, 5, 6, 7, 12.2, 33, 22);
        System.out.println(text1);


        int min1 = min(22, 33, 11, 1, 99, 100, 77, 55);
        System.out.println("MIN = " + min1);

        String min2 = min("Naim", "Abaz", "Agron", "Aba", "Nelton");
        System.out.println("MIN 2 = " + min2);


        Borxhliu minBorxhliu = min(
                new Borxhliu("Agoni", 3000),
                new Borxhliu("Olti", 2000),
                new Borxhliu("Olti Barcelone", 10),
                new Borxhliu("Enis Web-i", 5000)
        );

        System.out.println(minBorxhliu);


    }


    //varargs
    public static <T> T getMiddle(T... args) {
        return args[args.length / 2];
    }


    public static <T> String concatenate(T... args) {
        StringBuilder sb = new StringBuilder("");
        for (T arg : args) {
            sb.append(arg.toString());
        }
        return sb.toString();
    }

    public static <T extends Comparable<T>> T min(T... args) {
        if (args == null || args.length == 0)
            throw new IllegalArgumentException("No arguments provided!");

        T min = args[0];
        for (int i = 1; i < args.length; i++) {
            if (min.compareTo(args[i]) > 0) {
                min = args[i];
            }
        }
        return min;
    }
}








