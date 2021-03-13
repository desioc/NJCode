public class EsempioStatico {
    private static int a = 10;
    public EsempioStatico(){
        a += 10;
    }
    static {
        System.out.println("valore statico = " + a);
    }
}