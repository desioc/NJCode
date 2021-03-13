public class PlayerException extends Exception {
    public PlayerException (String message){
        super("Eccezione riguardante il player: "  + message);
    }
}