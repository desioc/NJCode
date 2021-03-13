public class MazzoDiCarte {
    private Carta[][] carte;

    public MazzoDiCarte() {
        carte = new Carta[4][10];
        caricaCarte();
    }

    public void caricaCarte() {
        Seme[] semi = Seme.values();
        Numero[] numeri = Numero.values();
        int semiLength = semi.length;
        int numeriLength = numeri.length;
        for (int i = 0; i < semiLength; i++) {
            for (int j = 0; j < numeriLength; j++) {
                carte[i][j] = new Carta(numeri[j], semi[i]);
            }
        }
    }

    public String toString() {
        int carteLength = carte.length;
        String string ="";
        for (int i = 0; i < carteLength; i++) {
            int rigaCarteLength = carte[i].length;
            for (int j = 0; j < rigaCarteLength; j++) {
                string += carte[i][j] + (j != (rigaCarteLength-1) ? ", " : "");
            }
            if (i != (carteLength-1)) {
                string+="\n";
            }
        }
        return string;
    }

    public void setCarte(Carta[][] carte) {
        this.carte = carte;
    }

    public Carta[][] getCarte() {
        return carte;
    }
}