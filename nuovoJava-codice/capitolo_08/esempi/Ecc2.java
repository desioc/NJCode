public class Ecc2 {
    public static void main(String args[]) {
        int a = 10;
        int b = 2;
        try {
            int c = a/b;
            System.out.println(c);
        } catch (ArithmeticException exc) {
            System.out.println("Divisione per zero...");
        } catch (NullPointerException exc) {
            exc.printStackTrace();
        } finally {
            System.out.println("tentativo di operazione");
        }
    }
}