public class Rettangolo {
    public final int NUMERO_LATI_UGUALI = 2;
    public int base;
    public int altezza;

    public Rettangolo(int b, int h) {
        base = b;
        altezza = h;
    }

    public int perimetro() {
        int perimetro = (base + altezza ) * NUMERO_LATI_UGUALI;
        return perimetro;
    }

    public int area() {
        int area = base * altezza;
        return area;
    }
    
    public void stampaDettagli(){
        System.out.println(dammiDettagli());
    }
    
    public String dammiDettagli(){
        return "Questo rettangolo, ha base = " + base + ", altezza = " + altezza + ", perimetro = " + perimetro()+ ", area = " + area();
    }
}