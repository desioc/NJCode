public class TestCiProvoConIReference {
    public static void main(String args[]) {
        CiProvoConIReference ogg = new CiProvoConIReference();
        Data dataDiNascita = new Data();
        dataDiNascita.giorno = 14;
        dataDiNascita.mese = 4;
        dataDiNascita.anno = 2004;
        ogg.cambiaReference(dataDiNascita);
        System.out.println("Data di nascita = "
        + dataDiNascita.giorno + "-"+ dataDiNascita.mese
        + "-" +dataDiNascita.anno );
    }
}