public class ContoBancario2 {
    private String denaro = "5000000 di Euro";
    private int codice = 1234;
    private int codiceInserito;
    public void setCodiceInserito(int cod) {
        codiceInserito = cod;
    }
    public String getDenaro(int codiceDaTestare) {
        return controllaCodice(codiceDaTestare);
    }
    private String controllaCodice(int codiceDaTestare) {
        if (codiceDaTestare == codice) {
            return denaro;
        }
        else {
            return "codice errato!!!";
        }
    }
}