public class EsercizioFK {
    public static void main(String args[]) {
        double e = Math.E;
        Math.floor(e);
        boolean b = check(e, 2.0);
        System.out.println(b);
    }
    
    public static Boolean check(Double a, Double b){
        Boolean equals = null;
        if (a.equals(b)){
            equals = true;
        }
        return equals;
    }
}