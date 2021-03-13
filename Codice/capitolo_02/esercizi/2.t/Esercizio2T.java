public class Esercizio2T {
    
    public static void main(String args[]){
        Corso corso1 = new Corso();
        corso1.nome = "Java";
        Corso corso2 = new Corso("Java");
        System.out.println(corso1.nome);
        System.out.println(corso2.nome);
    }
  
}