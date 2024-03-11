

package oop.intro_to_classes_and_objects.summary;

import java.math.BigDecimal;

public class Product {
    private BigDecimal price;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = BigDecimal.valueOf(price);
    }
}














