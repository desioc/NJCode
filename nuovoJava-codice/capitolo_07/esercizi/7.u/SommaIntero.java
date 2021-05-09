public class SommaIntero extends SommaNumero{
    @Override
    public Integer somma(Number n1, Number n2) {
        return (Integer)n1 + (Integer)n2;
    }
    
    public static void main(String args[]) {
        SommaIntero sommaIntero = new SommaIntero();
        sommaIntero.somma(1.0, 1.0);
    }
}