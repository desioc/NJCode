import java.util.*;

public class Esercizio8OO {
    public static void main(String[] args) {
        Esercizio8OO esercizio8OO = new Esercizio8OO();
        esercizio8OO.start();
    }
    
    public void start() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Inserisci un valore in Kelvin");
            float kelvin = scanner.nextFloat();
            float celsius = kelvin - 273.15F;
            float fahrenheit = celsius * 9/5 + 32;
            System.out.println("Il valore di "+  kelvin +"  gradi Kelvin equivale a:\n"
                + celsius  +" gradi Celsius\n"
                + fahrenheit +" gradi Fahrenheit");
        }
        catch (InputMismatchException exc) {
            System.out.println("Il valore deve essere numerico");
            start();
        }
    }
}