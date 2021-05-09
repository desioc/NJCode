public class Punto3D extends Punto {
    private int z;
    public Punto3D() {
        //Costruttore senza parametri
    }
    public Punto3D(int x, int y, int z) {
        this.setXYZ(x, y, z); //Riuso di codice
    }
    public void setZ(int z) {
        this.z = z; //Il this non è facoltativo
    }
    public void setXYZ(int x, int y, int z) {
        this.setXY(x, y); //Riuso del codice
        this.setZ(z); //Il this è facoltativo
    }
    public int getZ() {
        return this.z; //Il this è facoltativo
    }
    public double dammiDistanza(Punto p) {
        if (p instanceof Punto3D) {
            //Chiamata ad un metodo privato tramite casting
            return this.calcolaDistanza((Punto3D)p);
        }
        else {
            return -1; //distanza non valida!
        }
    }
    //@Override
    private double calcolaDistanza(Punto3D p1) {
        //quadrato della differenza della x dei due punti
        int tmp1=(getX()-p1.getX())*(getX()-p1.getX());
        //quadrato della differenza della y dei due punti
        int tmp2=(getY()-p1.getY())*(getY()-p1.getY());
        //quadrato della differenza della z dei due punti
        int tmp3=(z-p1.z)*(z-p1.z);
        //radice quadrata della somma dei tre quadrati
        return Math.sqrt(tmp1+tmp2+tmp3);
    }
}