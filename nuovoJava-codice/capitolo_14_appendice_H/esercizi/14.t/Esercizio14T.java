import java.util.*;

public class Esercizio14T {
    public static void main(String args[]) {
        List<String> stringList = getStringList();
        Double average = stringList.stream().filter(s -> !s.startsWith("a")).mapToInt(
        String::length).average().getAsDouble();
        System.out.println(average);
    }

   public static List<String> getStringList() {
    String stringa ="Les enfants qui s'aiment s'embrassent debout "
        +"Contre les portes de la nuit "
        +"Et les passants qui passent les désignent du doigt "
        +"Mais les enfants qui s'aiment "
        +"ne sont là pour personne "
        +"Et c'est seulement leur ombre "
        +"qui tremble dans la nuit "
        +"Excitant la rage des passants "
        +"Leur rage, leur mépris, leurs rires et leur envie "
        +"Les enfants qui s'aiment ne sont là pour personne "
        +"Ils sont ailleurs bien plus loin que la nuit "
        +"Bien plus haut que le jour "
        +"Dans l'éblouissante clarté de leur premier amour. ";
        String[] stringhe = stringa.split(" ");
        return Arrays.asList(stringhe);
    }
}