public class Semaforo2 {
    public String stato;
    public void cambiaColore(Colore2 colore) {
        stato = switch(colore) {
            case VERDE-> "La luce è verde";
            case GIALLO -> "La luce è gialla";
            case ROSSO -> "La luce è rossa";
            default -> "La luce è spenta";
        };
    }
    
    public void stampaStato() {
        System.out.println(stato);
    }
}
