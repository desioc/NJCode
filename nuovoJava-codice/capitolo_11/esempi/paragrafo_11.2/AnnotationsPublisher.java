import java.lang.reflect.*;
import java.util.*;

public class AnnotationsPublisher {
  public static void main(String[] args) throws Exception {
    Map<String,String> map = new HashMap<>();
    Method[] methods = Class.forName("Test").getMethods();
    for (Method m : methods) {
      DaCompletare dc = null;
      if ((dc = m.getAnnotation (DaCompletare.class)) != null) {
        String descrizione = dc.descrizione();
        String assegnataA = dc.assegnataA();
        map.put(descrizione, assegnataA);
      }
    }
    publicaInIntranet(map);
  }

  public static void publicaInIntranet(Map <String,String>map) {
    Set <String>keys = map.keySet();
    for (String key : keys) {
      System.out.printf("Descrizione = %s; Assegnata a:%s", key, map.get(key));
    }
  }
}