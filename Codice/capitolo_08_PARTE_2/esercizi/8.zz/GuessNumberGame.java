package games.guessnumber.business;

import games.guessnumber.util.GuessNumber;
import games.generic.business.Configurator;
import games.generic.data.MultiPlayerGame;
import games.generic.data.Player;
import games.guessnumber.data.GuessNumberPlayer;
import java.util.Scanner;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class GuessNumberGame extends MultiPlayerGame implements Configurator {
    private static final int MAX_NUMBER = 100;
    private static int counter;
    private Player currentPlayer;
    private Scanner scanner;
    private int numberToGuess;

/* public GuessNumberGame () {
        init();
        start();
        play();
        end();
    }*/

    @Override
    public void init() {
        super.init();
        scanner = new Scanner(System.in);
        numberToGuess = GuessNumber.generateRandomNumber(MAX_NUMBER);
    }

    @Override
    public void start() {
        config();
        System.out.println("Ho pensato ad un numero tra 1 e "+ MAX_NUMBER +", indovinalo!");
    }

    @Override
    public void config() {
        System.out.println("Inserire nome player "+ (++counter) + (getPlayers().isEmpty() ?"":" oppure 'i' per iniziare a giocare"));
        String text = scanner.next();
        if (!getPlayers().isEmpty() && text.equals("i")) {
            currentPlayer = getPlayers().get(0);
            System.out.println("Tocca a "+ currentPlayer);
            return;
        }
        addPlayer(new GuessNumberPlayer (counter, text, scanner, numberToGuess));
        config();
    }

    @Override
    public void play() {
        while (scanner.hasNext()) {
            boolean result = currentPlayer.play();
            if (result) {
                return;
            }
            currentPlayer = getCurrentPlayer();
            System.out.println("Tocca a "+ currentPlayer);
        }
    }

    private Player getCurrentPlayer() {
        int nextPlayerIndex = currentPlayer.getId();
        var players = getPlayers();
        if (nextPlayerIndex == players.size()) {
            nextPlayerIndex = 0;
        }
        return players.get(nextPlayerIndex);
    }
    @Override
    public void end() {
        System.out.println("Complimenti "+ currentPlayer.getName() +"! Hai indovinato dopo "+ ((GuessNumberPlayer)currentPlayer).getAttemptsNumber() +" tentativi");
    }

    public static void main(String args[]) {
        new GuessNumberGame();
    }
}