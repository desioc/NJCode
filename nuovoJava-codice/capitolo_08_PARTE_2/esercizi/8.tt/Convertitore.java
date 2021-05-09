import java.math.*;

public class Convertitore {
    public static BigDecimal convertiKelvinInCelsius(BigDecimal kelvin) {
        return kelvin.subtract(BigDecimal.valueOf(273.15));
    }
    
    public static BigDecimal convertiKelvinInFahrenheit(BigDecimal kelvin) {
        BigDecimal celsius = convertiKelvinInCelsius(kelvin);
        return celsius.multiply(BigDecimal.valueOf(9)).divide(BigDecimal.valueOf(5), 2, 
            RoundingMode.HALF_UP).add(BigDecimal.valueOf(32));
    }
    
    public static BigDecimal convertiCelsiusInKelvin(BigDecimal celsius) {
        return celsius.add(BigDecimal.valueOf(273.15));
    }
    
    public static BigDecimal convertiCelsiusInFahrenheit(BigDecimal celsius) {
        return celsius.multiply(BigDecimal.valueOf(9)).divide(BigDecimal.valueOf(5),2, RoundingMode.HALF_UP).add(BigDecimal.valueOf(32));
    }
    
    public static BigDecimal convertiFahrenheitInKelvin(BigDecimal fahrenheit) {
        BigDecimal celsius = convertiFahrenheitInCelsius(fahrenheit);
        return celsius.add(BigDecimal.valueOf(273.15));
    }
    
    public static BigDecimal convertiFahrenheitInCelsius(BigDecimal fahrenheit) {
        return fahrenheit.subtract(BigDecimal.valueOf(32)).multiply(BigDecimal.valueOf(5)).divide(BigDecimal.valueOf(9), 2, RoundingMode.HALF_UP);
    }
}