import java.util.*;

public class SystemProperties {
    public static void main(String args[]) {
        System.setProperty("claudio.cognome","De Sio Cesari");
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("claudio.cognome"));
        System.clearProperty("claudio.cognome");
        System.out.println(System.getProperty("claudio.cognome"));
        Properties properties = System.getProperties();
        properties.list(System.out);
    }
}