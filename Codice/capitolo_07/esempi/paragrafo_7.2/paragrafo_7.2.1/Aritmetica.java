public class Aritmetica {
    public static int somma(int a, int b) {
        System.out.println("somma(int a, int b)");
        return a + b;
    }
    public static float somma(int a, float b) {
        System.out.println("somma(int a, float b)");
        return a + b;
    }
//    public static float somma(float a, int b) {
//        return a + b;
//    }

    public static float somma(float a, int b) {
        System.out.println("somma(float a, int b)");
        return a + b;
    }
    public static int somma(int a, int b, int c) {
        return a + b + c;
    }
    public static double somma(int a, double b, int c) {
        return a + b + c;
    }
    //esempio Varargs
    public static double somma(double... doubles) {
        double risultato = 0.0D;
        for (double tmp : doubles) {
            risultato += tmp;
        }
        return risultato;
    }

    public static void main(String args[]) {
        System.out.println(somma(1,2,3));
        System.out.println(somma(1,2F,3));
        Aritmetica.somma(1,2);

    }
}