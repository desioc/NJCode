public class StringUtils {
    public static int contaOccorrenze(String string, char character) {
        var count = 0;
        for (var i = 0; i < string.length(); i++) {
            if (string.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }
//Potremmo aggiungere altri metodi che fanno operazioni sulle stringhe
}