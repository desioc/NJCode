public class TestAzione {
    public static void main(String args[]) {
        esegui(AzioneEnum.AVANTI);
    }
    
    public static void esegui(AzioneEnum azione) {
        switch (azione) {
            case AVANTI:
//                vaiAvanti();
            break;
            case INDIETRO:
//                vaiIndietro();
            break;
            case FERMO:
 //               fermati();
            break;
        }
    }
}