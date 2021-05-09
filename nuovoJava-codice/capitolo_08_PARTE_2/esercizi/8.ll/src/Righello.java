import static java.lang.Math.*;
import java.math.*;

public class Righello {
    public static BigDecimal calcolaDistanza(Punto p1, Punto p2) {
        double risultato = sqrt(pow(p1.getX()-p2.getX(), 2) + pow(p1.getY()-p2.getY(), 2));
        return new BigDecimal(""+risultato, new MathContext(3, RoundingMode.HALF_UP));
    }
}