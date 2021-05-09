public class GestorePrenotazioni {
    public static void main(String [] args) {
        var botteghino = new Botteghino();
        try {
            for (int i = 1; i <= 101; ++i) {
//                botteghino.prenota();
                botteghino.prenotaConEspressioneSwitch();
                System.out.println("Prenotato posto n° "+ i);
            }
        }
        catch (PrenotazioneException exc) {
            System.out.println(exc.toString());
        }
    }
}