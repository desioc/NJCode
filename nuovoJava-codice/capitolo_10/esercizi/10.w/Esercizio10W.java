import java.util.Random;

public class Esercizio10W {
    public static void main(String args[]) {
        int id = getId(args);
        MorraCinese morraCinese = new MorraCinese();
        morraCinese.gioca(id);
    }

    public static int getId(String args[]) {
        int id = 0;
        if (args.length != 0) {
            try {
                id = Integer.parseInt(args[0]);
                if (id < 0 || id > 2) {
                    System.out.println("Inserire un numero compreso tra 0 e 2");
                    System.exit(1);
                }
            } catch (Exception exc) {
                System.out.println("Input non valido: "+ args[0]);
                System.exit(1);
            }
        } else {
            id = new Random().nextInt(3);
        }
        return id;

    }
}