public class PuntoTridimensionale extends Punto {
    private int z;

    public void setZ(int z) {
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public double distanzaDallOrigine() {
        int tmp = (getX()*getX()) + (getY()*getY())
           + (z*z); // N.B. : x e y non sono ereditate 
        return Math.sqrt(tmp);
    }

//prima regola
//    public void setCoordinate(int x, int y, int z) {
//        super.setCoordinate(x, y);
//        setZ(z);
//    }

//seconda regola
//public PuntoTridimensionale elaboraPunto() {
    // . . .
//}

}