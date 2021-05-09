import java.util.Random;

public class GuessNumber {
    private static final Random RANDOM = new Random();    
    
    public static int generateRandomNumber(int max) {
         return 1+ RANDOM.nextInt(max);
    }
}