package libreria.test;
import libreria.dati.*;
import libreria.util.*;

public class TestCarrello {
    public static void main(String[] args) {
        Libro jfaVol1 = new Libro("979-12-200-4915-3","Java for Aliens Vol. 1","Claudio De Sio Cesari", 25, GenereLetterarioUtils.MANUALE);
        Libro jfaVol2 = new Libro("979-12-200-4916-0","Java for Aliens Vol. 2","Claudio De Sio Cesari", 25,GenereLetterarioUtils.MANUALE);
        Album lad = new Album("979-0-236-44-3","Live after Death","Iron Maiden", 25, GenereMusicaleUtils.ROCK);
        Album mop = new Album("978-0-789-01-2","Master of Puppets","Metallica", 25,GenereMusicaleUtils.ROCK);
        Album tt = new Album("978-0-789-01-9","Tokyo Tapes","Scorpions", 22,GenereMusicaleUtils.ROCK);
        Carrello carrello = new Carrello();
        System.out.println("Carrello vuoto = " + carrello.isVuoto());
        System.out.println("Aggiungiamo il libro "+ jfaVol1);
        carrello.aggiungi(jfaVol1);
        System.out.println("Aggiungiamo il libro "+ jfaVol2);
        carrello.aggiungi(jfaVol2);
        System.out.println("Aggiungiamo l'album "+ lad);
        carrello.aggiungi(lad);
        System.out.println("Aggiungiamo l'album "+ mop);
        carrello.aggiungi(mop);
        System.out.println("Aggiungiamo l'album "+ tt);
        carrello.aggiungi(tt);
        System.out.println("Carrello vuoto = " + carrello.isVuoto());
        System.out.println(carrello);
    }
}