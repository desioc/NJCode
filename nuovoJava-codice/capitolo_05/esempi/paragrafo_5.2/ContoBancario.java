public class ContoBancario {
    private String denaro = "5000000 di Euro";
    private int codice = 1234;
    private int codiceInserito;
    public void setCodiceInserito(int cod) {
        codiceInserito = cod;
    }
    public int getCodiceInserito() {
        return codiceInserito;
    }
    public String getDenaro() {
        if (codiceInserito == codice) {
            return denaro;
        }
        else {
            return "codice errato!!!";
        }
    }
 //   . . .
}