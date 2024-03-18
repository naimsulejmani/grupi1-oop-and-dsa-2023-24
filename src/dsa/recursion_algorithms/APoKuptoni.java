package dsa.recursion_algorithms;

import java.util.Scanner;

public class APoKuptoni {
    static Scanner reader = new Scanner(System.in);

    public static void pyetje(String aPoKupton) {
        if (aPoKupton.equalsIgnoreCase("PO")) return;
        System.out.println("A po kupton!");
        pyetje(reader.nextLine());
    }
    public static void main(String[] args) {
        pyetje("");
    }
}












