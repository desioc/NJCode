public class StaticMethod {
    private int variabileDiIstanza;
    private static int variabileDiClasse;
    public static void main(String args[]) {
   //     System.out.println(variabileDiIstanza);
        System.out.println(variabileDiClasse);
        StaticMethod staticMethod = new StaticMethod();
        System.out.println(staticMethod.variabileDiIstanza);
    }
}