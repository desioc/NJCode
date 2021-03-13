import java.util.*;

public class AutoBoxing {
    public static void main(String args[]) {
        List<Integer> ints = new ArrayList<Integer>();
        Integer integer = 1;
        Double d = 3.0D;
        Boolean booleano = true;
        char c = new Character('c');
        byte b = new Byte((byte)1);
        int i = 29;
        Short s = new Short ((short)7);
        Float f = 74.0F;
        double d2 = i*f-7;
        ints.add(1);
        int intero = ints.get(0);
    }
}