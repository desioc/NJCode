public class Semaforo2 {
    public String stato;
    public void cambiaColore(Colore2 colore) {
        stato = switch(colore) {
            case VERDE-> "La luce � verde";
            case GIALLO -> "La luce � gialla";
            case ROSSO -> "La luce � rossa";
            default -> "La luce � spenta";
        };
    }
    
    public void stampaStato() {
        System.out.println(stato);
    }
}
