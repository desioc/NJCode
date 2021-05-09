
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestReflection {

    public static void main(String args[]) {
        //Moneta moneta = new Moneta(Valore.CINQUANTA_CENTESIMI);
        Class<Moneta> classMoneta = Moneta.class;

//        try {
//            classMoneta.newInstance();
//        } catch (InstantiationException | IllegalAccessException ex) {
//            ex.printStackTrace();
//        }
        try {
            Constructor<Moneta> costruttore = classMoneta.getConstructor(Valore.class);
            costruttore.newInstance(Valore.CINQUANTA_CENTESIMI);
        } catch (NoSuchMethodException | SecurityException | InstantiationException |
                IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            ex.printStackTrace();
        }
    }
}
