import java.util.Arrays;

public class ArrayCopyDemo {
    public static void main(String[] args) {
        int pari[] = {2, 4, 6, 8, 10} ;
        int dispari[] = {1, 3, 5, 7, 9} ;
        System.arraycopy(pari, 2, dispari, 1, 2);
        System.out.print(Arrays.toString(dispari));
    }
}