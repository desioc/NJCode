public class TestLibro {
    public static void main(String args[]) {
        Libro nuovoJava = new Libro("Il nuovo Java", "Claudio De Sio Cesari", "Hoepli");
        nuovoJava.stampaDettagli();
        
        Libro giornoDellaCivetta = new Libro("Il giorno della civetta", "Leonardo Sciascia", "Adelphi");
        giornoDellaCivetta.stampaDettagli();
    }
}