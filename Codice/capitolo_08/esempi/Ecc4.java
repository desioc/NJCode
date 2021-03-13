public class Ecc4 {
    public static void main(String args[]) {
        int a = 10;
        int b = 0;
        try {
            int c = a/b;
            System.out.println(c);
        } catch (ArithmeticException exc) {
            System.out.println("Divisione per zero...");
        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            System.out.println("Tentativo di operazione");
        }
    }
}