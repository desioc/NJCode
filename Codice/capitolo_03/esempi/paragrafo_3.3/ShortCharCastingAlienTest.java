public class ShortCharCastingAlienTest {
    public static void main(String args[]) {
        int i = '\n';
        System.out.println(i);
        
        char c = 'a'; //il carattere a equivale al numero decimale 65
        short s = 65;
        s = (short)c;
        char cc = '\uffff'; // l’esadecimale FFFF corrisponde al decimale 65535
        short ss = (short)cc;
        System.out.println(ss);
        
        short sss = -32768;
        char ccc = (char)sss;
        System.out.println(ccc);
    }
}