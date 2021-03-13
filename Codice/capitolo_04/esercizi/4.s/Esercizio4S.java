public class Esercizio4S {

    private static int matrice[][] = {
        {1, 7, 3, 9, 5, 3},
        {6, 2, 3},
        {7, 5, 1, 4, 0},
        {1, 0, 2, 9, 6, 3, 7, 8, 4}
    };

    public static void main(String args[]) {
        int numeroDaTrovare = controllaArgomento(args);
        if (numeroDaTrovare == -1) {
            System.out.println("Specificare un numero intero compreso tra 0 e 9");
            return;
        }
        PRIMA_LABEL:
        for (int i = 0; i < matrice.length; i++) {
            int[] riga = matrice[i];
            for (int j = 0; j < riga.length; j++) {
                if (riga[j] == numeroDaTrovare) {
                    System.out.println(numeroDaTrovare + " trovato a riga = "
                            + ++i + ", colonna = " + ++j);
                    break PRIMA_LABEL;
                }
            }
        }
        System.out.println("Ricerca terminata");
    }

    private static int controllaArgomento(String[] args) {
        if (args.length == 1) {
            if (args[0].length() == 1) {
                for (int i = 0; i < 10; i++) {
                    if (args[0].equals("" + i)) {
                        return Integer.parseInt(args[0]);
                    }
                }
            }
        }
        return -1;
    }
}