import java.util.*;

public class Esercizio14Q {

   public static void main(String args[]) {

      ClaudioLinkedList claudioLinkedList = new ClaudioLinkedList();
      /*INSERISCI CODICE QUI*/
      claudioLinkedList.removeFirst();
      claudioLinkedList.addFirst("C");
      claudioLinkedList.set(2, "A");
      claudioLinkedList.removeLast();
      claudioLinkedList.addLast("O");
      System.out.println(claudioLinkedList);
   }
}