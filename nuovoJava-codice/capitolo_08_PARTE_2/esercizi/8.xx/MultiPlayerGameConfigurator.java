import java.util.Scanner;

public class MultiPlayerGameConfigurator implements Configurator {
    private static int counter;
    private Scanner scanner;
    private MultiPlayerGameImpl game;
    
    public MultiPlayerGameConfigurator() {
        game = new MultiPlayerGameImpl();
        scanner = new Scanner(System.in);
        config();
        game.printPlayers();
    }

    @Override
    public void config() {
        var players = game.getPlayers();
        System.out.println("Inserire nome player "+ (++counter) + (players.isEmpty() ?"":" oppure 'i' per iniziare a giocare"));
        String text = scanner.next();
        if (!players.isEmpty() && text.equals("i")) {
            return;
        }
        game.addPlayer(new Player (counter, text));
        config();
    }
}