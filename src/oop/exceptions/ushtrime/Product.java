package oop.exceptions.ushtrime;

import oop.exceptions.ProductException;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Product {
    private long id;
    private String name;
    private BigDecimal price;
    private LocalDate bestBefore;

    public Product() {
    }

    public Product(long id, String name, BigDecimal price, LocalDate bestBefore) throws ProductException, IllegalArgumentException {
        setId(id);
        this.name = name;
//        this.price = price;
//        this.bestBefore = bestBefore;
        setPrice(price);
        setBestBefore(bestBefore);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) throws IllegalArgumentException {
        if (id <= 0) throw new IllegalArgumentException("ID nuk guxon te jete negative!");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) throws ProductException {
        if (price.compareTo(BigDecimal.ZERO) < 0)
            throw new ProductException("Vlera e price nuk guxon te jete negative!");
        this.price = price;
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }

    public void setBestBefore(LocalDate bestBefore) throws ProductException {
        if (bestBefore.isBefore(LocalDate.now()))
            throw new ProductException("Smunesh me kriju produkt te ri me afat te skaduar!");
        this.bestBefore = bestBefore;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", bestBefore=" + bestBefore +
                '}';
    }
}
