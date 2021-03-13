public class StampaContattiV2 {
    public static void main(String args[]) {
        System.out.println("Elenco Contatti");
        System.out.println();
        Contatto contatto1 = new Contatto("Claudio De Sio Cesari", "Via Java 13", "131313131313");
        Contatto contatto2 = new Contatto("Stevie Wonder", "Via Musica 10", "1010101010");
        Contatto contatto3 = new Contatto("Gennaro Capuozzo", "Piazza Quattro Giornate 1", "1111111111");
        contatto1.stampaDettagli();
        contatto2.stampaDettagli();
        contatto3.stampaDettagli();
    }
}