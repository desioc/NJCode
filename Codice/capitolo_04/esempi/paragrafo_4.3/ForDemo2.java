public class ForDemo2 {
    public static void forMethod(int j) {
        int i;
        for (i = 0; i < j; ++i) {
            System.out.println(i);
        }
        System.out.println("Numero iterazioni = " + i);
    }
    public static void main(String args[]) {
        forMethod(10);
    } 
}