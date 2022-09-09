public class Outer3 {
    private static String messaggio = "Nella classe " ;
    private void stampaMessaggio() {
        System.out.println(messaggio+ "Esterna");
    }
    //Definizione della classe anonima e sua istanza
    ClasseEsistente ca = new ClasseEsistente() {
        @Override
        public void metodo() {
            System.out.println(messaggio+ "anonima");
        }
    }; //Notare il ";"
    //. . .
}