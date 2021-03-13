import java.util.*;

public class CompactStringsDemo {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        long dimensioneInizialeMemoria = runtime.totalMemory()- runtime.freeMemory();
        long tempoIniziale = System.currentTimeMillis();
        long limite = 100_000;
        String s ="";
        for (int i = 0; i < limite; i++) {
            s += limite;
        }
        long tempoTotale = System.currentTimeMillis() - tempoIniziale;
        System.out.println("Create "+ limite +" stringhe in "+ tempoTotale +"  millisecondi");
        long dimensioneFinaleMemoria = runtime.totalMemory()- runtime.freeMemory();
        long memoriaUtilizzata = dimensioneFinaleMemoria - dimensioneInizialeMemoria;
        System.out.println("Memoria utilizzata = "+ memoriaUtilizzata +" byte");
    }
}