import java.util.*;

public class TestArrayListMethods {
    public static void main(String args[]) {
        ArrayList<String> alfabeto = new ArrayList<>();
        if (alfabeto.size()==0) {
            for (int i = 65; i <= 90; i++) {
                alfabeto.add("" +(char)i);
            }
        }
        System.out.println("Arraylist originale");
        stampaArrayList(alfabeto);
        alfabeto.add(0, "@");
        int indexOfS = alfabeto.indexOf("S");
        alfabeto.set(indexOfS, "$");
        if (alfabeto.contains("A")) {
            alfabeto.remove("A");
        }
        List<String> sublist = alfabeto.subList(0,19);
        String[] array = sublist.toArray(new String[0]);
        System.out.println("\nNuovo array");
        stampaArray(array);
        alfabeto.clear();
        stampaArrayList(alfabeto);
    }

    public static void stampaArrayList(List<String> alfabeto) {
        if (alfabeto.isEmpty()) {
            System.out.println("\nArraylist vuoto!");
        } else {
            for (String lettera : alfabeto) {
                System.out.print(lettera + " ");
            }
        }
    }

    public static void stampaArray(String[] alfabeto) {
        if (alfabeto.length == 0) {
            System.out.println("\nArray vuoto!");
        } else {
            for (String string : alfabeto) {
                System.out.print(string + " ");
            }
        }
    }
}