import java.util.*;

public class TestSynchronizedMap {
    public static void main(String args[]) {
        HashMap myHashMap = new HashMap();
        Map map = Collections.synchronizedMap(myHashMap);
        Set set = map.keySet();
        synchronized (map) {
            Iterator iterator = set.iterator();
            while (iterator.hasNext())
            faQualcosa (iterator.next());
        }
    }

    public static void faQualcosa (Object string) {

    }
}