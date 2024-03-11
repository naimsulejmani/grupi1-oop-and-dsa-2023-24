package oop.intro_to_classes_and_objects.summary;

import java.math.BigDecimal;

public class ProductTest {
    public static void main(String[] args) {
        BigDecimal decimal1 = new BigDecimal("12313132132132132132132132123213131313213213.123213123");
        BigDecimal decimal2 = new BigDecimal("98098230948203480932480928409324809324332.123213141745937492");

        System.out.println(decimal1.add(decimal2).pow(3).add(decimal2));

    }
}
