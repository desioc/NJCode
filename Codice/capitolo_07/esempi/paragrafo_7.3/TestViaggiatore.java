public class TestViaggiatore {
    public static void main(String args[]) {
        Viaggiatore claudio = new Viaggiatore();
        Automobile fiat500 = new Automobile();
        // avremmo potuto istanziare anche una Nave o un Aereo
        claudio.viaggia(fiat500);
        Aereo piper = new Aereo();
        claudio.viaggia(piper);
    }
}