import java.util.Objects;

public class Punto {
    private int x, y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return y;
    }

/* @Override
    public boolean equals(Object altroOggetto) {
        if (altroOggetto == null) {
            return false;
        }
        if (altroOggetto instanceof Punto) {
            Punto altroPunto = (Punto) altroOggetto;
            return this.x == altroPunto.x && this.y == altroPunto.y;
        } else {
            return false;
        }
    }
    */
/* @Override
    public boolean equals(Object altroOggetto) {
        if (!(altroOggetto instanceof Punto)) {
            return false;
        }
        Punto altroPunto = (Punto) altroOggetto;
        return this.x == altroPunto.x && this.y == altroPunto.y;
    } */
    
    @Override
    public boolean equals(Object altroOggetto) {
        if (!(altroOggetto instanceof Punto altroPunto)) {
            return false;
        }
        return this.x == altroPunto.x && this.y == altroPunto.y;
    }

    /* @Override
    public boolean equals(Object altroOggetto) {
        if (!(altroOggetto instanceof Punto)) {
            return false;
        }
        Punto altroPunto = (Punto) altroOggetto;
        return Objects.equals(this.x, altroPunto.x) && Objects.equals(this.y, altroPunto.y);
    } */
    @Override
    public int hashCode() {
        return x ^ y;
    }

    public static void main(String args[]) {

        Punto p1 = new Punto(5,6);
        Punto p2 = new Punto(5,2);
        Punto p3 = new Punto(5,6);

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.equals(""));
        System.out.println(p1.equals(null));

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
    }
}