import java.util.*;
public class TokenizerTest {
    public static void main(String args[]) {
        StringTokenizer st = new StringTokenizer("questo � un test","t", true);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}