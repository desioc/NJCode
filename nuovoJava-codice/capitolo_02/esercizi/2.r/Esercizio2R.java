public class Esercizio2R {
    public int var1;
    public int var2;

    System.out.println("Esercizio 2.r");

    public Esercizio2R () {

    }

    public Esercizio2R (int a , int b) {
        var1 = b;
        var2 = a;
    }

    public static void main(String args[]) {
        Esercizio2R esercizio2R = new Esercizio2R (4,7);
        System.out.println(esercizio2R.var1);
        System.out.println(esercizio2R.var2);
    }
}