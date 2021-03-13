import java.util.*;

public class Polilinea {
    private List<Segmento> segmentiList;

    public Polilinea (Segmento... segmenti) throws PolilineaNonValidaException {
        this.segmentiList = Arrays.asList(segmenti);
        if (segmenti.length < 2) {
            throw new PolilineaNonValidaException(segmentiList);
        }
    }

    public void aggiungiSegmento(Segmento nuovoSegmento) throws PolilineaNonValidaException {
        Segmento ultimoSegmento = segmentiList.get(segmentiList.size()-1);
        Punto estremo2UltimoSegmento = ultimoSegmento.getEstremo2();
        Punto estremo1NuovoSegmento = nuovoSegmento.getEstremo1();
        if (!uguali(estremo1NuovoSegmento, estremo2UltimoSegmento)) {
            throw new PolilineaNonValidaException(segmentiList);
        }
        segmentiList.add(nuovoSegmento);
    }

    private boolean uguali(Punto p1, Punto p2) {
        return p1.getX()==p2.getX() && p1.getY()== p2.getY();
    }
    
    public String toString() {
        String descrizione = "";
        for (Segmento segmento : segmentiList) {
            descrizione += segmento + "\n";
        }
        return descrizione;
    }
}