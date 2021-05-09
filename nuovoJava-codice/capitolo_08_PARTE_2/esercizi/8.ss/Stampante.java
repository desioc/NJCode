import java.math.*;

public class Stampante {
    public static void stampaIstruzioni() {
        System.out.println("Inserisci un valore in Kelvin (per esempio 12K), Celsius (25C) o Fahrenheit (451F)");
    }

    public static void stampaMessaggio(BigDecimal valore1, String scala1,BigDecimal valore2, String scala2,BigDecimal valore3, String scala3) {
        System.out.println("Il valore di "+  valore1 +" gradi " + scala1+ " equivale a:\n"
            + valore2 +" gradi " + scala2 + "\n" + valore3 + " gradi " + scala3);
    }

    public static void stampaScalaErrata(String scala) {
        System.out.println("Scala "+ scala +" non valida. Usare K per Kelvin, C per Celsius, F per Fahrenheit");
    }

    public static void stampaFormatoErrato() {
        System.out.println("Formato errato!");
    }
}