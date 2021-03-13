public class Esercizio12H {
    public static void main(String args[]) throws Exception {
        ContoAllaRovescia contoAllaRovescia = new ContoAllaRovescia();
        int secondi = 10;
        if(args.length > 0) {
            try {
                secondi = Integer.parseInt(args[0]); 
            }
            catch (Exception exc) {
                System.out.println("L'input deve essere un numero " +
                "intero positivo, usiamo il valore di default 10...");
            }
        }
        contoAllaRovescia.attiva(secondi);
    }
}