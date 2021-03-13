public class PatternMatching {
    String s;
    public static void main(String args[]) {
        PatternMatching pm = new PatternMatching();
        pm.metodo();
    }
    public void metodo() {
        Object obj = "Ciao" ;
        if (!(obj instanceof String s)) {
            s = "Pippo" ;
            System.out.println(s.toUpperCase());
        } else {
            //s = "Pluto" ;
            System.out.println(s.toLowerCase());
        }
    }
}