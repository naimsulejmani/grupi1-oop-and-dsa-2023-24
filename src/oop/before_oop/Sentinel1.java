package oop.before_oop;

import java.util.Scanner;

public class Sentinel1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("type a word (or \"quit\" to exit): ");
        String word = reader.nextLine();

        int charCount = 0;

        while (!word.equalsIgnoreCase("quit")) {
            charCount += word.length();
            System.out.print("type a word (or \"quit\" to exit): ");
            word = reader.nextLine();
        }

        System.out.printf("You typed a total of %d characters", charCount);

    }
}












