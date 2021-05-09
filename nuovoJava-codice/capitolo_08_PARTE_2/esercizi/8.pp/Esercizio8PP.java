import java.util.*;
import java.math.*;

public class Esercizio8PP {
    public static void main(String[] args) {
        Esercizio8PP esercizio8PP = new Esercizio8PP();
        esercizio8PP.start();
    }
    
    public void start() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Inserisci un valore in Kelvin");
            BigDecimal kelvin = scanner.nextBigDecimal();
            BigDecimal celsius = kelvin.subtract(BigDecimal.valueOf(273.15));
            BigDecimal fahrenheit = celsius.multiply(BigDecimal.valueOf(9)).divide(BigDecimal.valueOf(5)).add(BigDecimal.valueOf(32));
            System.out.println("Il valore di "+  kelvin +" gradi Kelvin equivale a:\n"
            + celsius  +" gradi Celsius\n" + fahrenheit +" gradi Fahrenheit");
        }
        catch (InputMismatchException exc) {
            System.out.println("Il valore deve essere numerico");
            start();
        }
    }
}