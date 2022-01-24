import java.lang.reflect.*;

public class TestConstructor {
    public static void main(String args[]) throws Exception {
        Class<Punto> puntoClass = Punto.class;
        Constructor<Punto> puntoConstructor = puntoClass.getDeclaredConstructor();
        Punto punto = puntoConstructor.newInstance();
        System.out.println(punto);
        
    }
}
class Punto {
    private int x;
    private int y;

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}