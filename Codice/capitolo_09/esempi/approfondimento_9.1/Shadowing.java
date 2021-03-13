import static java.lang.Math.pow;

public class Shadowing {
     public static double pow(double d1, double d2){
        return 0;
    } 
    
    public static void main(String args[]) {
        System.out.println(pow(2,2)); 
    }
}