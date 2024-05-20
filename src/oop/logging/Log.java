package oop.logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.Formatter;

public class Log {
    private Logger logger;
    FileHandler fileHandler;

    public Log(String loggerName) {
        logger = Logger.getLogger(loggerName);
    }

    public Log(String loggerName, Level level) {
        this(loggerName);
        logger.setLevel(level);
    }

    public Log(String loggerName, Level level, String fileName) throws IOException {
        this(loggerName, level);
        fileHandler = new FileHandler(fileName, true);
        logger.addHandler(fileHandler);
    }

    public Log(String loggerName, Level level, String fileName, Formatter formatter) throws IOException {
        this(loggerName, level, fileName);
        fileHandler.setFormatter(formatter);
    }

    public void add(String logMessage, Level level) {
        logger.log(level, logMessage);
    }

    public void add(String logMessage, Level level, Exception ex) {
        logger.log(level, logMessage, ex);
    }
}










