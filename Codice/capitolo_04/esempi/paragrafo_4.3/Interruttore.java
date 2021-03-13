public class Interruttore {
    public static final int ACCESO = 0;
    public static final int SPENTO = 1;
    public int posizione;
    
    public void accendiLampadina() {
        while (interruttore.posizione == ACCESO) {
            // codice omesso
        }
    }

}