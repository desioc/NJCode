public class SommaIntero extends SommaNumero{
    @Override
    public Integer somma(Number n1, Number n2) {
        if (n1 == null || n2 == null) {
            System.out.println("Impossibile sommare un operando null, " + 
                "restituisco il valore di default");
            return Integer.MIN_VALUE;
        } else if (!(n1 instanceof Integer && n2 instanceof Integer)){
            System.out.println("Passa solo variabili di tipo intere, " +
                "restituisco il valore di default");
            return Integer.MIN_VALUE;
        }
        return (Integer)n1 + (Integer)n2;
    }
    
    public static void main(String args[]) {
        SommaIntero sommaIntero = new SommaIntero();
        sommaIntero.somma(1.0, 1.0);
        sommaIntero.somma(null, 1.0);
    }
}