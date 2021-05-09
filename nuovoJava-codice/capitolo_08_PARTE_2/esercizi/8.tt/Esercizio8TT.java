import java.util.*;
import java.io.*;
import java.math.*;
import java.util.logging.*;

public class Esercizio8TT {
    private static final LogManager logManager = LogManager.getLogManager();
    private static final Logger LOGGER = Logger.getLogger("Esercizio10TT");
    private static final String K ="Kelvin";
    private static final String C ="Celsius";
    private static final String F ="Fahrenheit";

    public static void main(String[] args) {
        initLogging();
        LOGGER.info("Metodo main() chiamato");
        Esercizio8TT esercizio8TT = new Esercizio8TT();
        esercizio8TT.start();
        LOGGER.info("Programma terminato");
    }

    private static void initLogging() {
        try {
            logManager.readConfiguration(new FileInputStream("logging.properties"));
        } catch (IOException exception) {
            LOGGER.log(Level.SEVERE,"Problema con la lettura del file di configurazione",exception);
        }
    }

    public void start() {
        try {
            LOGGER.info("Metodo start() chiamato");
            Stampante.stampaIstruzioni();
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            int lastCharIndex = input.length()-1;
            BigDecimal valore = new BigDecimal(input.substring(0, lastCharIndex));
            String scala = input.substring(lastCharIndex);
            switch(scala) {
                case"k":
                case"K": {
                    LOGGER.fine("Inserito scala Kelvin");
                    BigDecimal celsius = Convertitore.convertiKelvinInCelsius(valore);
                    BigDecimal fahrenheit = Convertitore.convertiKelvinInFahrenheit(valore);
                    Stampante.stampaMessaggio(valore, K, celsius, C, fahrenheit, F);
                    break;
                }
                case"c":
                case"C": {
                    LOGGER.fine("Inserito scala Celsius");
                    BigDecimal kelvin = Convertitore.convertiCelsiusInKelvin(valore);
                    BigDecimal fahrenheit = Convertitore.convertiCelsiusInFahrenheit(valore);
                    Stampante.stampaMessaggio(valore, C, kelvin, K, fahrenheit, F);
                    break;
                }
                case"f":
                case"F": {
                    LOGGER.fine("Inserito scala Fahrenheit");
                    BigDecimal celsius = Convertitore.convertiFahrenheitInCelsius(valore);
                    BigDecimal kelvin = Convertitore.convertiFahrenheitInKelvin(valore);
                    Stampante.stampaMessaggio(valore, F, celsius, C, kelvin, K);
                    break;
                }
                default:
                LOGGER.fine("Inserito scala errata");
                Stampante.stampaScalaErrata(scala);
                start();
            }
        } catch (NumberFormatException exc) {
            LOGGER.severe(exc.getMessage());
            Stampante.stampaFormatoErrato();
            start();
        }
    }
}