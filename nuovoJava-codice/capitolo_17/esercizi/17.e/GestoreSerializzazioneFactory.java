package rubrica.integrazione;

import rubrica.dati.Contatto;
import java.util.Properties;
import java.io.*;

public class GestoreSerializzazioneFactory {
    private static final String PACKAGE ="rubrica.integrazione.";
    private static final String SERIALIZATION_METHOD ="rubrica.ser";
    private static Properties properties;
    static {
        properties = new Properties();
        try {
            loadProperties();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
    public static GestoreSerializzazione<Contatto> getGestoreSerializzazione() throws InstantiationException, ClassNotFoundException, IllegalAccessException {
        String className = properties.getProperty(SERIALIZATION_METHOD);
        System.out.println("Sto caricando la classe " + className);
        Class<?> classObject = Class.forName(PACKAGE + className);
        return (GestoreSerializzazione<Contatto>)classObject.newInstance();
    }

    private static void loadProperties() throws IOException {
        try (FileInputStream inputStream = new FileInputStream("config.properties");) {
            properties.load(inputStream);
        }
    }
}