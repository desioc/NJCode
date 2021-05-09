public class Esercizio4I {
    public static void main(String args[]) {
       int i = 1, j = 1;
       while(j <= 10)  {
           if (i % 3 == 0){
               System.out.println("Numero multiplo di 3 = " + i);
               j++;
           }
           i++;
        }
    }
}