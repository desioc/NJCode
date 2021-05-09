public class SommaIntero extends SommaNumero {
    @Override
    public Integer somma(Number n1, Number n2) {
        Integer risultato = null;
        try {
            risultato = (Integer)n1 + (Integer)n2;
        } catch (NullPointerException e) {
            System.out.println("Impossibile sommare un operando null");
        } catch (ClassCastException e) {
            System.out.println("Passa solo variabili di tipo intere");
        }
        return risultato;
    }

    public static void main(String args[]) {
        SommaIntero sommaIntero = new SommaIntero();
        System.out.println(sommaIntero.somma(1.0, 1.0));
    }
}