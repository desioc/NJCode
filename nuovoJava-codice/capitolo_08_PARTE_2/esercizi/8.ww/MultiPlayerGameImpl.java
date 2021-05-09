import java.util.Iterator;

public class MultiPlayerGameImpl extends MultiPlayerGame {
    public void start() {
        // per ora nessuna implementazione
    }

    public void play() {
        // per ora nessuna implementazione
    }

    public void end() {
        // per ora nessuna implementazione
    }

    public void printPlayers() {
        System.out.println("Lista dei giocatori:");
        for (Player player : getPlayers()) {
            System.out.println(player);
        }
    }
}