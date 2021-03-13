package var; 

public class VarTest {
    public static void main(String args[]) {
        var obj1 = new LibroSuJava();
        var obj2 = getIstanza();

        var bool = false; // dedotto il tipo boolean
        var string ="Foqus";// dedotto il tipo String
        var character= 'J'; // dedotto il tipo char
        var integer = 8; // dedotto il tipo int
        var byteInteger = (byte)8; // dedotto il tipo byte
        var shortInteger = (short)8; // dedotto il tipo short
        var longInteger = 8L; // dedotto il tipo long
        var floatingPoint = 3.14F; // dedotto il tipo float
        var doublePrecisionfloatingPoint = 3.14; // dedotto il tipo double

//        var notInitialized;
//        var nullInitialized = null;
//        var var1 = 1, var2 = 2;
//        var varArray[] = new int[3];
        var var = 0;

    }
    
    public void var() {
    }
    
    static LibroSuJava getIstanza() {
        return new LibroSuJava();
    }
}
//class var {}
//interface var {}
//enum var {}
//@interface var {}

class LibroSuJava {
    public String titolo;
    public String autore;
}