package oop.arraylists;

import java.util.ArrayList;

public class ArrayListDemoT {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(); // String[] names = new String[10];
        names.add("Naim");
        names.add("Agon");
        String emri1 = names.get(0);
        String emriPare = names.getFirst();
        String emriFundit = names.getLast();


        names.add(0, "Oltin");
        names.add(3, "Sara");


        names.clear();
        names.add("Test");

        names.remove("Test");
        names.remove(0);
        names.removeFirst();
        names.removeLast();


        ArrayList<Integer> titujt = new ArrayList<>();
        titujt.add(14);
        titujt.add(7);
        titujt.add(6);
        int titujtRealit = titujt.getFirst();
        int titujtMilan = titujt.get(1);

        titujt.remove(2);
        titujt.remove(Integer.valueOf(6));




    }
}










