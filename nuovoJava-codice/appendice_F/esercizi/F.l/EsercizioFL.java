public class EsercizioFL {
    public static void main(String args[]) {
        EsercizioFL e = new EsercizioFL();
        e.metodo(128);
    }
    
    public void metodo(Integer numero) {
        System.out.println("Integer " + numero);
    }
    public void metodo(long numero) {
        System.out.println("long " + numero);
    }
    public void metodo(byte numero) {
        System.out.println("byte " + numero);
    }
    public void metodo(Byte numero) {
        System.out.println("Byte " + numero);
    }
    public void metodo(short numero) {
        System.out.println("short " + numero);
    }
    public void metodo(Double numero) {
        System.out.println("Double " + numero);
    }
    public void metodo(double numero) {
        System.out.println("double " + numero);
    }
}