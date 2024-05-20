package oop.exceptions;

public class ProductDemo {
    public static void main(String[] args) {
        Product p = new Product(1, "Jogobella", -20);
        try {
            if (p.getPrice() < 0) {
//                throw new ProductException("Cmimi negative", p);
                ProductException ex = new ProductException("Cmimi negative", p);
                throw ex;
            }
            System.out.println("U shit produkti!");
        } catch (ProductException e) {
            System.out.println(e.getMessage());
            System.out.println("Gabimi ndodhi tek produkti: " + e.getProduct());
        }
    }
}
