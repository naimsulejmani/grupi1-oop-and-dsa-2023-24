package oop.exceptions;

import java.util.Scanner;

public class ShembullFinally {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Read a two numbers: ");
        int n1 = reader.nextInt();
        int n2 = reader.nextInt();

        try {
            System.out.println(n1 / n2);
        } catch (ArithmeticException ex) {
            System.out.println("Is not allowed to divide by zero with int types");
        } finally {
            System.out.println("Kjo gjithmon ka me u ekzekutu!");
        }
        System.out.println("Test");

    }
}
