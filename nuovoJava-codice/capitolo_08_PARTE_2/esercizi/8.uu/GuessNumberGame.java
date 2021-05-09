import java.util.Scanner;
import java.util.Random;

public class GuessNumberGame implements Game {
    private static final int MAX_NUMBER = 100;
    private Scanner scanner;
    private int attemptsNumber;
    private int numberToGuess;

    public GuessNumberGame () {
        init();
        start();
        play();
        end();
    }

    @Override
    public void init() {
        scanner = new Scanner(System.in);
        numberToGuess = GuessNumber.generateRandomNumber(MAX_NUMBER);
    }

    @Override
    public void start() {
        System.out.println("Ho pensato ad un numero tra 1 e "+ MAX_NUMBER +", indovinalo!");
    }

    @Override
    public void play() {
        attemptsNumber++;
        int number = scanner.nextInt();
        if (number < numberToGuess) {
            System.out.println("Troppo basso, riprova");
        } else if (number > numberToGuess) {
            System.out.println("Troppo alto, riprova");
        } else {
            return;
        }
        play();
    }
    @Override
    public void end() {
        System.out.println("Complimenti! Hai indovinato dopo "+ attemptsNumber +" tentativi");
    }

    public static void main(String args[]) {
        new GuessNumberGame();
    }
}