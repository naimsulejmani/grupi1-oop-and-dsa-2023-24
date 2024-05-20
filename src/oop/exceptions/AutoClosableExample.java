package oop.exceptions;

import java.io.*;


//
public class AutoClosableExample {
    public static void main(String[] args) {
        //try with resources (auto closable)
        try (
                BufferedReader reader = new BufferedReader(new FileReader("files/test.txt"));
                PrintWriter writer = new PrintWriter(new FileWriter("files/copy_test.txt"))
        ) {

            String line = reader.readLine();
            writer.println(line);
            writer.printf("Test %d %s%n", 10, line);
        } catch (FileNotFoundException e) {
            System.out.println("File not found! Cannot open missing file! " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Missing priviledges to write to file! " + e.getMessage());
        } catch (Exception ex) {
            Throwable[] suppressed = ex.getSuppressed();
            for (Throwable throwable : suppressed) {
                System.out.println(throwable.getMessage());
            }
        }
    }
}





