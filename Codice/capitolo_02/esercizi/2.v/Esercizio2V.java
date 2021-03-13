public class Esercizio2V {
    public int somma2Int(int a, int b) {
        return a+b;
    }

    public int somma5Int(int a, int b, int c, int d, int e) {
        return a+b+c+d+e;
    }


    public int somma10Int(int a, int b, int c, int d, int e,int f, int g, int h, int i, int l) {
        return a+b+c+d+e+f+g+h+i+l;
    }

    //Giusto per testare
    public static void main(String args[]) {
        Esercizio2V es = new Esercizio2V();
        System.out.println(es.somma2Int(1,1));
        System.out.println(es.somma5Int(1,1,1,1,1));
        System.out.println(es.somma10Int(1,1,1,1,1,1,1,1,1,1));
    }
}