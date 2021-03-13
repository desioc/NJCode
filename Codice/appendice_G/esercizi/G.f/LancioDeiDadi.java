import java.util.Random;

public class LancioDeiDadi {

    public static void main(String args[]) {
        System.out.println("Lancio il dado... " + (1 + new Random().nextInt(6)) + "!");
    }
}
