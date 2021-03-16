public class AlfabetoArray {
    public static void main(String args[]) {
        char alfabeto [] = new char[26];
        int i = 0;
        for (char c = 'a'; c <= 'z'; c++, i++) {
           alfabeto[i] = (char)c;
        }
        for (char lettera : alfabeto) {
            System.out.println(lettera);
        }
    }
}