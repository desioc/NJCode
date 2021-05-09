public class FloatingPointPrecisionTest {
    public static void main(String args[]) {
        float f = 123456789.0F;
        System.out.println(f);
        System.out.println((int)f);
        
        long numeroLong = 9999999999999991L;
        double d = numeroLong;
        System.out.println(d);
        System.out.println(numeroLong - (long)d);  
        
        System.out.println((0.1+0.2));
    }
}