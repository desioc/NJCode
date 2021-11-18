
public class CalcolatriceSemplificata {

    public double somma(double d1, double d2) {
        return d1 + d2;
    }

    public double sottrai(double d1, double d2) {
        return d1 - d2;
    }

    public double moltiplica(double d1, double d2) {
        return d1 * d2;
    }

    public double dividi(double d1, double d2) {
        return d1 / d2;
    }

    public double restituisciResto(double d1, double d2) {
        return d1 % d2;
    }

    public double massimo(double d1, double d2) {
        return d1 > d2 ? d1 : d2;
    }

    public double minimo(double d1, double d2) {
        return d1 > d2 ? d2 : d1;
    }

    public double media(double d1, double d2) { 
        return (d1 + d2)/2; 
    } 
}