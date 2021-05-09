public class TestQuadrato {
    public static void main(String args[]) {
        Quadrato quadrato = new Quadrato(5);
//        quadrato.lato = 5;
        int perimetro = quadrato.perimetro();
        System.out.println(perimetro);
        int area = quadrato.area();
        System.out.println(area);
    }
}