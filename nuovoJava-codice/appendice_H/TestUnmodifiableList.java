import java.util.*;

public class TestUnmodifiableList {
    public static void main(String args[]) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        List<String> wrapperList = Collections.unmodifiableList(arrayList);
        //sarebbe preferibile:
        //arrayList = Collections.unmodifiableList(arrayList);
        //Infatti con la seguente riga avremmo un errore
        //wrapperList.add("d");
        arrayList.add("d");
        System.out.println("wrapperList è stata modificata: " + wrapperList + "!");
    }
}