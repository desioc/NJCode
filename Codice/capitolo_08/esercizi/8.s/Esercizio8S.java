public class Esercizio8S {
    public static void main(String args[]) throws NullPointerException {
        Esercizio8S e = new Esercizio8S();
        e.metodo();
    }

    public Exception metodo() throws Exception {
        String s = null;
        try {
            s.toString();
        } catch(ArithmeticException e) {
            throw new NullPointerException ();
        }
        return null;
    }
}