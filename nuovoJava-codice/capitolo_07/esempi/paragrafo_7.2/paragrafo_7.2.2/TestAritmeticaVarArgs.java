public class TestAritmeticaVarArgs {
    public static void main(String... args) {
        var ogg = new AritmeticaVarArgs();
        System.out.println(ogg.somma(1,2,3));
        System.out.println(ogg.somma());
        System.out.println(ogg.somma(1,2));
        System.out.println(ogg.somma(1,2,3,5,6,8,2,43,4));
        double[] doubles = {1.2D, 2, 3.14, 100.0};
        System.out.println(ogg.somma(doubles));
        System.out.println(ogg.somma(new double[]{1.2D, 2, 3.14, 100.0}));
    }
}