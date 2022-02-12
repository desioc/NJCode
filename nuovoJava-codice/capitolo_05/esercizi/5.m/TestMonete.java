/**
 * Classe di test per le classi Moneta e PortaMonete.
 * 
 * @author Claudio De Sio Cesari
 */
public class TestMonete {

    public static void main(String args[]) {
        Moneta monetaDaVentiCentesimi = new Moneta(20);
        Moneta monetaDaUnCentesimo = new Moneta(1);     
        Moneta monetaDaUnEuro = new Moneta(100);
        // Creiamo un portamonete con 8 monete
        PortaMonete portaMonete = new PortaMonete(new int[]{2, 5, 100, 10, 50, 10, 100,
            200});
        // Creiamo un portamonete con 11 monete
        PortaMonete portaMoneteInsufficiente = new PortaMonete(new int[]{2, 5, 100, 10,
            50, 10, 100, 200, 10, 5, 2});
        // Aggiungiamo una moneta da 20 centesimi
        portaMonete.aggiungi(monetaDaVentiCentesimi);
        // Valutiamo lo stato del portamonete.
        portaMonete.stato();
        // preleviamo 20 centesimi
        portaMonete.preleva(monetaDaVentiCentesimi);
    }
}