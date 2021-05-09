public class Botteghino {
    private int postiDisponibili;
    public Botteghino() {
        postiDisponibili = 100;
    }
    public void prenota() throws PrenotazioneException {
     //   try {
            //controllo sulla disponibilità dei posti
            if (postiDisponibili == 0) {
                //lancio dell’eccezione
                throw new PrenotazioneException();
            }
            //metodo che realizza la prenotazione
            // se non viene lanciata l’eccezione
            postiDisponibili--;
     /* }
        catch (PrenotazioneException exc) {
            System.out.println(exc.toString());
        } */
    }
    
    public void prenotaConEspressioneSwitch() throws PrenotazioneException {
            postiDisponibili = switch(postiDisponibili) {
                default -> postiDisponibili-1;
                case 0 -> throw new PrenotazioneException();
            };
    }
}