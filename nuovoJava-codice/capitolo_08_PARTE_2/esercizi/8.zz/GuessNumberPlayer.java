package games.guessnumber.data;

import games.generic.data.Player;
import java.util.Scanner;

public class GuessNumberPlayer extends Player {
    private Scanner scanner;
    private int numberToGuess;
    private int attemptsNumber;

    public GuessNumberPlayer (int id, String name, Scanner scanner, int numberToGuess) {
        super(id, name);
        this.scanner = scanner;
        this.numberToGuess = numberToGuess;
    }

    public void incrementAttemptsNumber() {
        attemptsNumber++;
    }

    public int getAttemptsNumber() {
        return attemptsNumber;
    }
    
    @Override
    public boolean play() {
        if (scanner.hasNextInt()) {
            incrementAttemptsNumber();
            int number = scanner.nextInt();
            if (number < numberToGuess) {
                System.out.println("Troppo basso, riprova");
            } else if (number > numberToGuess) {
                System.out.println("Troppo alto, riprova");
            } else {
                return true;
            }
        } else {
            System.out.println("Input '"+ scanner.next() +"' non valido. Puoi inserire solo numeri interi, riprova");
            play();
        }
        return false;
    }
}