public class StranaCalcolatrice {

    public double somma(double... doubles) {
        double risultato = 0;
        for (double unDouble : doubles) {
            risultato += unDouble;
        }
        return risultato;
    }

    public double moltiplica(double... doubles) {
        double risultato = doubles[0];
        for (int i = 1; i < doubles.length; i++) {
           risultato *= doubles[i];
        }
        return risultato;
    }

    public double massimo(double... doubles) {
        double max = doubles[0];
        for (int i = 1; i < doubles.length; i++) {
            double unDouble = doubles[i];
            if (unDouble > max) {
                max = unDouble;
            }
        }
        return max;
    }

    public double minimo(double... doubles) {
        double min = doubles[0];
        for (int i = 1; i < doubles.length; i++) {
            double unDouble = doubles[i];
            if (unDouble < min) {
                min = unDouble;
            }
        }
        return min;
    }

}