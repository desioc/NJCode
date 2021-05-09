public class Quadrato {
    public final int NUMERO_LATI = 4;
    public int lato;

    public Quadrato(int l) {
        lato = l;
    }

    public int perimetro() {
        int perimetro = lato * NUMERO_LATI;
        return perimetro;
    }

    public int area() {
        int area = lato * lato;
        return area;
    }
    
    public void stampaDettagli(){
        System.out.println("Questo quadrato, ha lato = " + lato +  ", perimetro = " + perimetro()+ ", area = " + area());
    }
}