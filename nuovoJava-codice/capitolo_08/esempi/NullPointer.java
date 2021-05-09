public class NullPointer {
    public static void main(String args[]) {
        IllegalArgumentException iae = new IllegalArgumentException();
        System.out.println(getDescription(iae).toUpperCase());
    }
    static String getDescription(Throwable o) {
        return o.getMessage();
    }
    
}