public class Esercizio4O {
    public static void main(String args[]) {
        int i = 99;
        if (i++ >= 100) {
            System.out.println(i+=10);
        } else {
            System.out.println(--i==99?i++:++i);
        }
    }
}