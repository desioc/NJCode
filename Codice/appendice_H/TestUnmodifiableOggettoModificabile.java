import java.util.*;

public class TestUnmodifiableOggettoModificabile {
    public static void main(String args[]) {
        List<OggettoModificabile> arrayList = new ArrayList<>();
        OggettoModificabile o1 = new OggettoModificabile("NOME_1");
        arrayList.add(o1);
        arrayList = Collections.unmodifiableList(arrayList);
        System.out.println("arrayList prima: "+ arrayList);
        arrayList.get(0).setTitolo("NOME_2"); // equivalente a o1.setTitolo("NOME_2");
        System.out.println("arrayList dopo: "+ arrayList);
    }
}