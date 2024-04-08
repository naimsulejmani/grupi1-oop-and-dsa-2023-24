package oop.arraylists;

public class MainArray {
    public static void main(String[] args) {

        if (args == null || args.length == 0) {
            System.out.println("No argument");
        } else {
            for (String arg : args) {
                System.out.println(arg);
            }
        }
    }
}






