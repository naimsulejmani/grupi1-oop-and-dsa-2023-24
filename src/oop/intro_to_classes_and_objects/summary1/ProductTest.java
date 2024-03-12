package oop.intro_to_classes_and_objects.summary1;

import java.time.LocalDate;

public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Monte Coko me lajthi", "Shume e shijshme!");
        Product p2 = new Product(2, "Vaj 1L", "Vaj ulliri!");
        p2.setBestBefore(LocalDate.now().plusYears(2));

        System.out.println(p1.getBestBefore());
        System.out.println(p2.getBestBefore());
    }
}
















