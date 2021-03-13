import java.util.Random;

public class MorraCinese {
    public void gioca(int id) {
        Segno segnoGiocatore = getSegno(id);
        Segno segnoComputer = getSegnoComputer();
        System.out.println(segnoGiocatore +" VS "+ segnoComputer);
        String risultato = stabilisciVincitore(segnoGiocatore, segnoComputer);
        System.out.println(risultato);
    }

    private String stabilisciVincitore(Segno segnoGiocatore, Segno segnoComputer) {
        Regole regole = new Regole();
        int risultato = regole.compare(segnoGiocatore, segnoComputer);
        if (risultato > 0) {
            return"Vince "+ segnoGiocatore +"!\nHai vinto!";
        } else if (risultato < 0) {
            return"Vince "+ segnoComputer +"!\nHai perso!";
        } else {
            return"Pari!";
        }
    }

    private Segno getSegno(int id) {
        Segno[] segni = Segno.values();
        Segno segnoComputer = segni[id];
        return segnoComputer;
    }

    private Segno getSegnoComputer() {
        Random random = new Random();
        return getSegno(random.nextInt(3));
    }
}