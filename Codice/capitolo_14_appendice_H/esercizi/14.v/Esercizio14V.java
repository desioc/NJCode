import java.util.*;
import java.util.stream.*;

public class Esercizio14V {

    public static void main(String args[]) {
        List<String> stringList = getStringList();
        Map<String, List<String>> map = stringList.stream().collect(Collectors.groupingBy(s -> (""+s.charAt(0)).toLowerCase()));
        System.out.println(map);
    }

    public static List<String> getStringList() {
        String stringa ="I ragazzi che si amano si baciano in piedi "
        +"Contro le porte della notte "
        +"E i passanti che passano li segnano a dito "
        +"Ma i ragazzi che si amano "
        +"Non ci sono per nessuno "
        +"Ed è la loro ombra soltanto "
        +"Che trema nella notte "
        +"Stimolando la rabbia dei passanti "
        +"La loro rabbia il loro disprezzo le risa la loro invidia "
        +"I ragazzi che si amano non ci sono per nessuno "
        +"Essi sono altrove molto più lontano della notte "
        +"Molto più in alto del giorno "
        +"Nell'abbagliante splendore del loro primo amore ";
        String[] stringhe = stringa.split(" ");
        return Arrays.asList(stringhe);
    }
}