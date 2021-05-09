public class Segmento {
    private Punto estremo1;
    private Punto estremo2;

    private double lunghezza;

    public Segmento(Punto estremo1, Punto estremo2 ) throws SegmentoNonValidoException {
        this.estremo1 = estremo1;
        this.estremo2 = estremo2;
        setLunghezza();
    }

    public Punto getEstremo1() {
        return estremo1;
    }

    public Punto getEstremo2() {
        return estremo2;
    }

    private void setLunghezza() throws SegmentoNonValidoException {
        this.lunghezza = Righello.calcolaDistanza(estremo1, estremo2);
        if (lunghezza == 0) {
            throw new SegmentoNonValidoException();
        }
    }

    public String toString() {
        return "Segmento da "+estremo1+" a "+estremo2 + " con lunghezza = " + lunghezza;
    }
}