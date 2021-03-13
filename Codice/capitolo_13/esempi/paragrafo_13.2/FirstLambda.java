public class FirstLambda {
    public static void main(String args[]) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Prima di Java 8: Classe anonima");
            }
        } ).start();
        Runnable r = ()->System.out.println("Java 8: Funzione anonima");
        //new Thread(r).start();        
        new Thread(()->System.out.println("Java 8: Funzione anonima")).start();
        //var r = ()->System.out.println("Java 8: Funzione anonima");
    }
}