package oop.before_oop;

import java.util.Scanner;

public class FencePost1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje tekst: ");
        String text = reader.nextLine();

        //PRE-FENCE POST
        System.out.print(text.charAt(0));

        for (int i = 1; i < text.length(); i++) {
            System.out.printf(",%c", text.charAt(i));
        }

        System.out.println("\n");
        //POST-FENCE
        for (int i = 0; i < text.length() - 1; i++) {
            System.out.printf("%c,", text.charAt(i));
        }
        System.out.print(text.charAt(text.length() - 1));
    }
}



