package oop.exceptions;

import oop.inheritance.payrollapp.Paycheck;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountLineExample {
    public static void main(String[] args) {
        try {
            String fileName = "files/test1.txt";
            int totalLines = countLines(fileName);
            System.out.println("Total lines: " + totalLines);
        } catch (Exception e) {
            System.out.println("Fajlli nuk egziston!");
        }
    }

    private static int countLines(String fileName) {
        int counter = 0;
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace(); // e shtyp gabimin dhe na nderpret kodin
        }
        String line;
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            counter++;
            System.out.println(line);
        }

        return counter;
    }
}







