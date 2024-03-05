package dsa.basic_lists;


import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        lista.add("Naim");//0
        lista.add("Olti");
        lista.add("Gresa");
        lista.add("Sara");
        lista.add("Agoni");
        lista.add(true);
        lista.add(10);
        lista.add(2.2);

        System.out.println(lista.get(0));
        System.out.println(lista.size());
        lista.add(0, "Lorik");


        lista.remove("Naim");
        lista.set(1, "Barcelona");
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        System.out.println(lista.size());

        System.out.println(lista.contains("Naim"));
        System.out.println(lista.contains("Lorik"));


        for (int i = 0; i < lista.size(); i++) {
            System.out.printf("%d - %s%n", i + 1, lista.get(i));
        }

        System.out.println(lista);

        for (Object element : lista) {
            System.out.println(element);
        }
    }

    ;
}










