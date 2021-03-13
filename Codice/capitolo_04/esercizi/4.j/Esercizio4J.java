public class Esercizio4J {
    public static void main(String args[]) {
       int i = 1, j = 1;
       do {
           if (i % 3 == 0){
               System.out.println("Numero multiplo di 3 = " + i);
               j++;
           }
           i++;
        } while(j <= 10) ;
    }
}