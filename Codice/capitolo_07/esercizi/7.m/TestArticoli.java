package libreria.test;

import libreria.dati.*;
import libreria.util.*;

public class TestArticoli {
    public static void main(String[] args) {
        Libro jfaVol1 = new Libro("979-12-200-4915-3", "Java for Aliens Vol. 1", "Claudio De Sio Cesari", 25, GenereLetterarioUtils.MANUALE);
        Libro jfaVol2 = new Libro("979-12-200-4916-0", "Java for Aliens Vol. 2", "Claudio De Sio Cesari", 25, "NonEsistente");
//        System.out.println("Genere JFA Vol 1 = " + jfaVol1.getGenere());
//        System.out.println("Genere JFA Vol 2 = " + jfaVol2.getGenere());
        System.out.println(jfaVol1);
        System.out.println(jfaVol2);
        Album lad = new Album("979-0-236-44-3", "Live after Death", "Iron Maiden", 25, GenereMusicaleUtils.ROCK);
        Album mop = new Album("978-0-789-01-2", "Master of Puppets", "Metallica", 25, "NonEsistente");
//        System.out.println("Genere Live after Death = " + lad.getGenere());
//        System.out.println("Genere Master of Puppets = " + mop.getGenere());
        System.out.println(lad);
        System.out.println(mop);
    }
}