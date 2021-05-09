public class StampaContatti {
    public static void main(String args[]) {
        System.out.println("Elenco Contatti");
        System.out.println();
        Rubrica rubrica = new Rubrica();
        rubrica.contatto1.stampaDettagli();
        rubrica.contatto2.stampaDettagli();
        rubrica.contatto3.stampaDettagli();
    }
}