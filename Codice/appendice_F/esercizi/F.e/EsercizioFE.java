public class EsercizioFE {
    public static void main(String args[]) {
        String stringa ="Java";
        stringa = stringa.concat(" ");
        stringa += 9;
        String risultato = "";
        if (stringa.intern() == "Java 9") {
            risultato += "intern()";
        } 
        if (stringa == "Java 9") {
            risultato += "==";
        } 
        if (stringa.equals("Java 9")) {
            risultato += "equals()";
        }
        System.out.println(risultato);
    }
}