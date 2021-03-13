import java.util.*;
import java.math.*;

public class Esercizio8QQ {
    public static void main(String[] args) {
        Esercizio8QQ esercizio8QQ = new Esercizio8QQ();
        esercizio8QQ.start();
    }

    public void start() {
        try {
            System.out.println("Inserisci un valore in Kelvin (per esempio 12K), Celsius (25C) o Fahrenheit (451F)");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            int lastCharIndex = input.length()-1;
            BigDecimal valore = new BigDecimal(input.substring(0, lastCharIndex));
            String scala = input.substring(lastCharIndex);
            switch(scala) {
                case"k":
                case"K":
                {
                    BigDecimal celsius = valore.subtract(BigDecimal.valueOf(273.15));
                    BigDecimal fahrenheit = celsius.multiply(BigDecimal.valueOf(9)).divide(BigDecimal.valueOf(5), 2, RoundingMode.HALF_UP).add(BigDecimal.valueOf(32));
                    System.out.println("Il valore di "+  valore +" gradi Kelvin equivale a:\n"
                        + celsius  +" gradi Celsius\n"+ fahrenheit +" gradi Fahrenheit");
                    break;
                }
                case"c":
                case"C":
                {
                    BigDecimal kelvin = valore.add(BigDecimal.valueOf(273.15));
                    BigDecimal fahrenheit = valore.multiply(BigDecimal.valueOf(9)).divide(BigDecimal.valueOf(5),2, RoundingMode.HALF_UP).add(BigDecimal.valueOf(32));
                    System.out.println("Il valore di "+  valore +" gradi Celsius equivale a:\n"
                        + kelvin  +" gradi Kelvin\n"+ fahrenheit +" gradi Fahrenheit");
                    break;
                }
                case"f":
                case"F":
                {
                    BigDecimal celsius = valore.subtract(BigDecimal.valueOf(32)).multiply(BigDecimal.valueOf(5)).divide(BigDecimal.valueOf(9), 2, RoundingMode.HALF_UP);
                    BigDecimal kelvin = celsius.add(BigDecimal.valueOf(273.15));
                    System.out.println("Il valore di "+  valore + " gradi Fahrenheit equivale a:\n"
                        + celsius  +" gradi Celsius\n"+ kelvin +" gradi Kelvin");
                    break;
                }
                default:
                    System.out.println("Scala "  + scala + " non valida. Usare K per Kelvin, C per Celsius, F per Fahrenheit");
                    start();
            }
        }
        catch (NumberFormatException exc) {
            System.out.println("Formato errato!");
            start();
        }
    }
} 