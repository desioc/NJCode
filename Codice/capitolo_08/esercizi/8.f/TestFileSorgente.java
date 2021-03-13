public class TestFileSorgente {
    public static void main(String args[]) {
        FileSorgente fileSorgente = new FileSorgente("Test.java",
            TipoFile.JAVA, "public class MyClass {\n\r");
        System.out.println(fileSorgente.getContenuto());
        // Test aggiungiTesto(String) corretto
        fileSorgente.aggiungiTesto("}");
        System.out.println(fileSorgente.getContenuto());
        // Test aggiungiTesto(String,int) corretto
        fileSorgente.aggiungiTesto("//Test aggiunta testo\n\r", 23);
        System.out.println(fileSorgente.getContenuto());
        // Test aggiungiTesto(String,int) scorretto
        fileSorgente.aggiungiTesto("//Test aggiunta testo\n\r", -1);
        System.out.println(fileSorgente.getContenuto());
        // Test aggiungiTesto(String,int) scorretto
        fileSorgente.aggiungiTesto("//Test aggiunta testo\n\r", 100);
        System.out.println(fileSorgente.getContenuto());
        FileSorgente fileSorgenteVuoto = new FileSorgente("FileVuoto.c",
            TipoFile.C);
        fileSorgenteVuoto.aggiungiTesto("//Test aggiunta testo\n\r", 3);
        System.out.println(fileSorgenteVuoto.getContenuto());
        FileSorgente fileSorgenteVuoto2 = new FileSorgente("FileVuoto2.cpp", 
            TipoFile.C_PLUS_PLUS);
        fileSorgenteVuoto2.aggiungiTesto("//Test aggiunta testo\n\r");     
    }
}