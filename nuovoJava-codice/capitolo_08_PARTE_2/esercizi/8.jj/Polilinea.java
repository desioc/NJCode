import java.util.*;

public class Polilinea {
    private List<Segmento> segmentiList;

    public Polilinea (Segmento... segmenti) throws PolilineaNonValidaException {
        this.segmentiList = new ArrayList(Arrays.asList(segmenti));
        if (segmenti.length < 2 || !controllaSegmentiConsecutivi()) {
            throw new PolilineaNonValidaException(segmentiList);
        }
    }

    public void aggiungiSegmento(Segmento nuovoSegmento) throws PolilineaNonValidaException {
        Segmento ultimoSegmento = segmentiList.get(segmentiList.size()-1);
        Punto estremo2UltimoSegmento = ultimoSegmento.getEstremo2();
        Punto estremo1NuovoSegmento = nuovoSegmento.getEstremo1();
        segmentiList.add(nuovoSegmento);
        if (!uguali(estremo1NuovoSegmento, estremo2UltimoSegmento)) {
            throw new PolilineaNonValidaException(segmentiList);
        }
    }

    private boolean controllaSegmentiConsecutivi() {
        int segmentiListSize = segmentiList.size();
        for (int i = 0; i < segmentiListSize-1; ) {
            Punto secondoEstremoSegmentoPrecedente = segmentiList.get(i++).getEstremo2();
            Punto primoEstremoSegmentoSuccessivo = segmentiList.get(i).getEstremo1();
            if (!uguali(secondoEstremoSegmentoPrecedente, primoEstremoSegmentoSuccessivo)) {
                return false;
            }
        }
        return true;
    }

    private boolean uguali(Punto p1, Punto p2) {
        return p1.getX()==p2.getX() && p1.getY()== p2.getY();
    }

    public String toString() {
        String descrizione ="Polilinea formata da:\n";
        for (Segmento segmento : segmentiList) {
            descrizione += segmento +"\n";
        }
        return descrizione;
    }
}