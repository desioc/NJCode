public class Esercizio3Z {
    public static void main(String args[]) {
        Studente studente1 = new Studente("Giovanni","Battista","5A");
        String [][] tabellaVoti1 = {
            {"Italiano","7","Non si impegna troppo."}, 
            {"Matematica","9","È molto portato per questa materia."} , 
            {"Storia","7","Potrebbe fare di più."} , 
            {"Geografia","8","Appassionato."} ,
            {"Inglese","9", "Capace di sostenere dialoghi."},
            {"Scienze Motorie","6", "Voto d'incoraggiamento."},
            {"Musica","7", "Ha una certa passione per la materia."}
        };
        Pagella pagella1 = new Pagella (studente1, tabellaVoti1);

        Studente studente2 = new Studente("Daniele","Sapore","2A");
        String [][] tabellaVoti2 = {
            {"Italiano","8","Manifesta entusiasmo per la materia."}, 
            {"Matematica","5","Per niente interessato."} , 
            {"Storia","6","Interessato, ma si impegna poco."} , 
            {"Geografia","6","Potrebbe fare di più."} ,
            {"Inglese","8", "Ottima pronuncia."},
            {"Scienze Motorie","7", "Un po' pigro."},
            {"Musica","9", "Suona diversi strumenti ed ha un'ottima voce."}
        };
        
        Pagella pagella2 = new Pagella (studente2, tabellaVoti2);
        
        pagella1.stampaPagella();
        pagella2.stampaPagella();
        
    }
}