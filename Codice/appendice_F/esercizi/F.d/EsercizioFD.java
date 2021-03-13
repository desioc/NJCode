public class EsercizioFD {
    public static void main(String args[]) {
        String stringa ="*** Java ***";
        stringa.toUpperCase();
        stringa.trim();
        stringa.substring(3, 8);
        stringa.trim();
        stringa.concat(String.format("Stringa = %n", stringa.length()));
        stringa +="!";
        System.out.println(stringa.length);
    }
}
