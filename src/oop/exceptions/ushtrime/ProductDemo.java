package oop.exceptions.ushtrime;


import oop.exceptions.ProductException;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProductDemo {
    public static void main(String[] args) {
        Product product = null;

        try {
            product = new Product(-10, "Jobogella",
                    BigDecimal.valueOf(0.50),
                    LocalDate.now().plusDays(10));
        } catch (ProductException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Njofto menaxhmentin!");
        } catch(IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
//            ex.printStackTrace();
            System.out.println("ALERT TE PROGRAMERAT");
        }
        finally {
            System.out.println("Kjo gjithqysh ekzekutohet");
        }

        if (product != null) {
            System.out.println(product);
        } else {
            System.out.println("Nuk eshte kriju produkti");
        }
    }
}
