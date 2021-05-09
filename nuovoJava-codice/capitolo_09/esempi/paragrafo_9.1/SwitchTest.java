public class SwitchTest {
    public enum Livello {ALTO, MEDIO, BASSO};
    
    public static void main(String args[]) {
        switch (getLivello()) {
            case ALTO:
                System.out.println(Livello.ALTO);
            break;
            case MEDIO:
                System.out.println(Livello.MEDIO);
            break;
        case BASSO:
                System.out.println(Livello.BASSO);
            break; 
        }
    }
    
    public static Livello  getLivello() {
        return Livello.ALTO;
    }
}