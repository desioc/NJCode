public class Punto {
    private int x, y;
    public Punto() {
        //Costruttore senza parametri
    }
    public Punto(int x, int y) {
        this.setXY(x, y); //Il this è facoltativo
        //riutilizziamo codice
    }
    public void setX(int x) {
        this.x = x; //Il this non è facoltativo
    }
    public void setY(int y) {
        this.y = y; //Il this non è facoltativo
    }
    public void setXY(int x, int y) {
        this.setX(x); //Il this è facoltativo
        this.setY(y);
    }
    public int getX() {
        return this.x; //Il this è facoltativo
    }
    public int getY() {
        return this.y; //Il this è facoltativo
    }
    public double dammiDistanza(Punto p) {
        //quadrato della differenza delle x dei due punti
        int tmp1 = (x - p.x)*(x - p.x);
        //quadrato della differenza della y dei due punti
        int tmp2 = (y - p.y)*(y - p.y);
        //radice quadrata della somma dei due quadrati
        return Math.sqrt(tmp1 + tmp2);
    }
}