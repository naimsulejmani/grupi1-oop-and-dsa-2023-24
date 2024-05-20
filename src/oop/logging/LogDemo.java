package oop.logging;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;

public class LogDemo {

    public static void main(String[] args) throws IOException {
        Log log = new Log(LogDemo.class.getName(), Level.WARNING, "files/logA.txt", new XMLFormatter());
        log.add("Gabimi i pare!", Level.INFO);
        log.add("Gabimi i dyte!", Level.WARNING);


    }
}
