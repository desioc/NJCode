import static java.lang.Math.*;

public class Righello {
    public static double calcolaDistanza(Punto p1, Punto p2) {
        return sqrt(pow(p1.getX()-p2.getX(), 2) + pow(p1.getY()-p2.getY(), 2)); 
    }
}