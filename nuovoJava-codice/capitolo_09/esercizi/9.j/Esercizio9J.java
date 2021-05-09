public class Esercizio9J {
    public static void main(String args[]) {
        String stringa1 ="Claudio";
        String stringa2 = new String(stringa1);
        System.out.println(stringa2 == stringa1);
        System.out.println(stringa2.equals(stringa1));
        System.out.println("Claudio".equals(stringa1));
        System.out.println("Claudio" == stringa1);
        System.out.println("Claudio" == stringa2);
    }
}