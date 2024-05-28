package oop.generics;

import java.time.LocalDate;
import java.util.ArrayList;

public class BeforeJava5 {
    public static void main(String[] args) {
        Object o1 = 10;
        Object o2 = 22.2;
        Object o3 = LocalDate.now();
        Object o4 = new ArrayList<String>();
        Object o5 = new int[]{1, 2, 3};

        testObject(o3);
    }

    public static void testObject(Object o) {
        int x = (int)o;
    }
}
