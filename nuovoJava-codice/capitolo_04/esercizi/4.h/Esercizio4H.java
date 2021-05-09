public class Esercizio4H {
    public static void main(String args[]) {
       for (int i = 1, j = 1; j <= 10; i++) {
           if (i % 3 == 0){
               System.out.println("Numero multiplo di 3 = " + i);
               j++;
           }
        }
    }
}