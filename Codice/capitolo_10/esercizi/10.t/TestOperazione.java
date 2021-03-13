public class TestOperazione {
    public static void main(String args[]) {
        Operazione<Integer, Operatore> operazione = new Operazione<>(1, Operatore.SOMMA, 1);
        operazione.stampa();
    }
}