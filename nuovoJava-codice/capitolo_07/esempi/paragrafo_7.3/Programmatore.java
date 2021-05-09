public class Programmatore extends Dipendente {
    private String linguaggiConosciuti;
    private int anniDiEsperienza;

    public void setAnniDiEsperienza(int anniDiEsperienza) {
        this.anniDiEsperienza = anniDiEsperienza;
    }

    public int getAnniDiEsperienza() {
        return anniDiEsperienza;
    }


    public void setLinguaggiConosciuti(String linguaggiConosciuti) {
        this.linguaggiConosciuti = linguaggiConosciuti;
    }

    public String getLinguaggiConosciuti() {
        return linguaggiConosciuti;
    }
}