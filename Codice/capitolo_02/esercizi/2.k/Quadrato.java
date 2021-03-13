public class Quadrato {
    public final int NUMERO_LATI = 4;
    public int lato;

    public Quadrato(int l) {
        lato = l;
    }

    public int  perimetro() {
        int perimetro = lato * NUMERO_LATI;
        return perimetro;
    }

    public int area() {
        int area = lato * lato;
        return area;
    }
    
    public void stampaDettagli(){
        System.out.println(dammiDettagli());
    }
    
    public String dammiDettagli(){
        return "Questo quadrato, ha lato di lunghezza = " + lato +  ", perimetro = " + perimetro()+ ", area = " + area();
    }
}