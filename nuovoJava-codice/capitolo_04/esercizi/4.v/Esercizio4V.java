public class Esercizio4V {

    public static void main(String args[]) {
        StranaCalcolatrice stranaCalcolatrice = new StranaCalcolatrice();
        System.out.println("42.7 + 47.8 = " + stranaCalcolatrice.somma(42.7, 47.8));
        System.out.println("42.7 x 47.8 x 2= " + stranaCalcolatrice.moltiplica(42.7, 47.8, 2));
        System.out.println("Il massimo tra 42.7, 47.8, 50, 2, 8, 89 è " + stranaCalcolatrice.massimo(42.7, 47.8, 50, 2, 8, 89));
        System.out.println("Il minimo tra 42.7, 47.8, 50, 2, 8, 89 è " + stranaCalcolatrice.minimo(42.7, 47.8, 50, 2, 8, 89)); 
       /* double [] a1 = {42.7, 47.8};
        System.out.println("42.7 + 47.8 = " + stranaCalcolatrice.somma(a1));
        double [] a2 = {42.7, 47.8, 2};
        System.out.println("42.7 x 47.8 x 2= " + stranaCalcolatrice.moltiplica(a2));
        double [] a3 = {42.7, 47.8, 50, 2, 8, 89};
        System.out.println("Il massimo tra 42.7, 47.8, 50, 2, 8, 89 è " + stranaCalcolatrice.massimo(a3));
        double [] a4 = {42.7, 47.8, 50, 2, 8, 89};
        System.out.println("Il minimo tra 42.7, 47.8, 50, 2, 8, 89 è " + stranaCalcolatrice.minimo(a4)); */
    }
}