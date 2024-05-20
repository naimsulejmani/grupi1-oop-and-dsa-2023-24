package oop.exceptions;

//Checked Exception
public class ProductException extends Exception {

    private Product product;

    public ProductException(Product product) {
        //super();
        this.product = product;
    }

    public ProductException(String message, Product product) {
        super(message);
        this.product = product;
    }

    public ProductException() {
    }

    public ProductException(String message) {
        super(message);
    }

    public ProductException(String message, Throwable cause) {
        super(message, cause);
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
