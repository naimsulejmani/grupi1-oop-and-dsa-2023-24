package oop.arraylists;

public class ArraySample {
    //variable instance
    private String[] names;

    public ArraySample() {
        names = new String[10];
        names[0] = "Naim";
        names[1] = "Agon";
        names[2] = "Sara";

        for (String name : names) {
            System.out.println(name);
        }
    }
}











