package oop.arraylists;

import java.time.LocalDate;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        System.out.println(list.size());

        list.add(10); // 10 integer -> Integer - elementi i pare
        list.add(20); // elementi i dyte
        list.add(0, 1); // shto ne elementin e pare, e ato tjerat shtyj
        list.add("Naim");
        list.add(LocalDate.of(2000, 1, 1));

        Object obj1 = list.get(0);
        Object objFund = list.get(list.size() - 1);

        System.out.println(obj1);
        System.out.println(objFund);

        String emri = (String) list.get(3);
        int x = (int) list.get(3); // miscasting

    }
}



