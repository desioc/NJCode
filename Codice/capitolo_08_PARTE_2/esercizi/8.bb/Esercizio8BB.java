public class Esercizio8BB {
    public static void main(String args[]) {      
        if (args.length != 4) {
            System.out.println("Per calcolare la distanza tra due punti,"
            +" inserire le 4 coordinate");
        }
        try {
            Punto p1 = new Punto(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
            Punto p2 = new Punto(Integer.parseInt(args[2]), Integer.parseInt(args[3]));
            System.out.println("Distanza tra i punti: "+ p1 +" e "+ p2 +" = "+ Righello.calcolaDistanza(p1,p2));
        }
        catch (NumberFormatException exc) {
            System.out.println("Le coordinate devono essere di tipo intero! Errore: "+ exc.getMessage());
        }
        
    }
}