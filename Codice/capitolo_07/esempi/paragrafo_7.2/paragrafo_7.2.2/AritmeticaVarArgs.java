public class AritmeticaVarArgs {
    public double somma(double... doubles) {
        double risultato = 0.0D;
        for (double tmp : doubles) {
            risultato += tmp;
        }
        return risultato;
    }
   /* public double somma(double[] doubles) {
        double risultato = 0.0D;
        for (double tmp : doubles) {
            risultato += tmp;
        }
        return risultato;
    } */
//    public void m(int i,String... strings, int... integers) {}

    
}