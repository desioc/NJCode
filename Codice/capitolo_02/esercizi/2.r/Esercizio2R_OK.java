public class Esercizio2R_OK {

    public int var1;
    public int var2;
    
    public Esercizio2R_OK(){
        
    }
    
    public Esercizio2R_OK(int a , int b){
        var1 = b;
        var2 = a;
    }

    public static void main(String args[]){
        Esercizio2R_OK esercizio2R = new Esercizio2R_OK(4,7);
        System.out.println(esercizio2R.var1);
        System.out.println(esercizio2R.var2);
    }
  
}
