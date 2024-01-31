import java.util.*;

@SuppressWarnings({"rawtypes"})
public class Esercizio11O {

    List objects;

    public Esercizio11O (){
        objects = new ArrayList();
    }
    
    public void rimuovi(Object object) {
        Iterator iterator = objects.iterator();
        if (iterator.hasNext()) {
            Object item = iterator.next();
            if (object.toString().equals(item.toString())) {
                iterator.remove();
            }
        }
    }
}