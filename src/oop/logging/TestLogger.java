package oop.logging;

import oop.exceptions.ProductException;
import oop.exceptions.ushtrime.Product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

// "oop.logging.TestLogger"
public class TestLogger {
    private static Logger logger = Logger.getLogger(TestLogger.class.getName());

    public static void main(String[] args) {
        Product product = null;
        logger.setLevel(Level.FINE);
        try {
            product = new Product(1, "Monte Coko", BigDecimal.valueOf(1.30),
                    LocalDate.of(2025, 4, 10));
            logger.log(Level.INFO, "Produkti eshte kriju me sukses -> " + product);
            logger.info("Produkti eshte kriju me sukses -> " + product);
        } catch (ProductException | IllegalArgumentException ex) {
            logger.log(Level.WARNING, ex.getMessage(), ex);
//            logger.warning(ex.getMessage());
        }
    }
}












