import java.text.*;
import java.util.*;

public class TestNumberFormat {
    public static void main(String args[])  throws Exception {
        NumberFormat nf = NumberFormat.getInstance(Locale.ITALIAN);
        Number number = nf.parse("25,1");
        System.out.println(number);
        
        String s = nf.format(new Float(10.2));
        System.out.println(s);
    }
}