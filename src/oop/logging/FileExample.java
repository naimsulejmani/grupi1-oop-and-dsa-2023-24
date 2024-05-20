package oop.logging;

import java.io.IOException;
import java.util.logging.*;

public class FileExample {
    private static Logger logger = Logger.getLogger(FileExample.class.getName());

    public static void main(String[] args) {

        try {
            FileHandler fileHandler = new FileHandler("files/log.txt",true);
            fileHandler.setFormatter(new XMLFormatter());
            logger.addHandler(fileHandler);
            logger.info("U ruajt nje mesazh!");
            logger.warning("Gabimi i jo shume i keq!");
            logger.severe("Gabimi shume shume i keq!");
            logger.log(Level.WARNING, "ALO", new Exception("Test"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
