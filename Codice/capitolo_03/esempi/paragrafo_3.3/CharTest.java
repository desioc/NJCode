public class CharTest {
    public static void main(String args[]) {
        char primoCarattere = 'a';
        String s ="Java melius semper quam latinam linguam est";

        //char c = "C";
        //String s = 'Meum filium maxime amo, sed ille me latinam linguam studere compellit';

        char aMaiuscolo = 'A';
        char trattino = '-';
        char at = '@';

        int i = 1;
        char a = 'A';
        char b = (char)(a+i); // c ha valore 'B'!
        //char b = a+i;
        int ii = a+i;
        char letteraGrecaPhi = '\u03A6';  //(lettera "?")
        char carattereUnicodeNonIdentificato = '\uABC8';

        char zero = '\u0030'; //il numero esadecimale 30 equivale al numero decimale 48
        //char zero = '0';
        System.out.println(zero);

        System.out.println('"');
        
        char virgolette = '"';
        System.out.println(virgolette);

        //System.out.println(''');
        
        System.out.println("'IQ'");
        
        System.out.println("\"IQ\"");
    }
}