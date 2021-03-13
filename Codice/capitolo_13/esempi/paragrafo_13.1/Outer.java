public class Outer {
    private String messaggio = "Nella classe ";
    private void stampaMessaggio() {
        System.out.println(messaggio + "Esterna");
    }
    /* la classe interna accede in maniera naturale ai membri
    della classe che la contiene */
    public class Inner {
//        public static String staticVariable = "Interna";
        public final static String staticVariable = "Interna";
        // classe interna
        public void metodo() {
            System.out.println(messaggio + "Interna");
        }
        public void chiamaMetodo() {
            stampaMessaggio();
        }
        //. . .
    }
    //. . .
}