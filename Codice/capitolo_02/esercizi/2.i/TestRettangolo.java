public class TestRettangolo {
    public static void main(String args[]) {
        Rettangolo rettangolo1 = new Rettangolo(5,6);
        Rettangolo rettangolo2 = new Rettangolo(8,9);
        System.out.println("Perimetro del rettangolo 1 = "+ rettangolo1.perimetro());
        System.out.println("Area del rettangolo 1 = "+ rettangolo1.area());
        System.out.println("Perimetro del rettangolo 2 = "+ rettangolo2.perimetro());
        System.out.println("Area del rettangolo 2 = "+ rettangolo2.area());
    }
}