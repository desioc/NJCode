import java.io.File;

public class ArrayTest {
    public static void main(String args[]) {
        char alfabeto [];       // oppure        char [] alfabeto;
        File files [];          // oppure        File [] files;
        alfabeto = new char[21];
        files = new File[3];
        alfabeto [0] = 'a';
        alfabeto [1] = 'b';
        alfabeto [2] = 'c';
        alfabeto [3] = 'd';
        alfabeto [4] = 'e';
        alfabeto [5] = 'f';
        alfabeto [6] = 'g';
        alfabeto [7] = 'h';
        alfabeto [8] = 'i';
        alfabeto [9] = 'l';
        alfabeto [10] = 'm';
        alfabeto [11] = 'n';
        alfabeto [12] = 'o';
        alfabeto [13] = 'p';
        alfabeto [14] = 'q';
        alfabeto [15] = 'r';
        alfabeto [16] = 's';
        alfabeto [17] = 't';
        alfabeto [18] = 'u';
        alfabeto [19] = 'v';
        alfabeto [20] = 'z';

        files [0] = new File("HelloWorld.java");
        files [1] = new File("HelloWorld.class");
        files [2] = new File("HelloWorld.html");

        char alfabeto2 [] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'z'} ;
        File files2 [] = {new File("HelloWorld.java"), new File("HelloWorld.class"),new File("HelloWorld.html")} ;

        char alfabeto3[] = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'z'} ;
        File files3[] = new File[] {new File("HelloWorld.java"), new File("HelloWorld.class"),new File("HelloWorld.html")} ; 
        
        System.out.println(alfabeto.hashCode());
    }
}