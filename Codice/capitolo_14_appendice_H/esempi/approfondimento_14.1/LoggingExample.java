import java.util.logging.*;
import java.io.*;

public class LoggingExample {
    private final static Logger LOGGER = Logger.getLogger(LoggingExample.class.getName());

    public static void main(String args[]) throws IOException {
        configureLog();
        LOGGER.info("Log Level INFO");
        LOGGER.finest("Log Level FINEST");
    }
    private static void configureLog() throws IOException {
        Handler fileHandler = new FileHandler("file.log");
        LOGGER.addHandler(fileHandler);
        LOGGER.setLevel(Level.INFO);
    }
}