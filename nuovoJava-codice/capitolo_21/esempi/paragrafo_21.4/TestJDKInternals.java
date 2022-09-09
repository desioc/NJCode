import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;

public class TestJDKInternals {
    public static void main(String args[]) throws IllegalAccessException {
        //Class<MethodHandles.Lookup> lookup2 = MethodHandles.Lookup.class;
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        //lookup.defineClass("class A {}".getBytes());
       /* Class<?> c = lookup.defineClass(("Êþº¾\0\0\0005\0\26\11\0\11\0\12\10\0\13\12\0\14\0"
        +"\15\7\0\16\7\0\17\1\0\3foo\1\0\3()V\1\0\4Code\7\0\20\14\0\21\0\22\1\0"
        +"\30hello dynamic world!\7\0\23\14\0\24\0\25\1\0\4Lazy\1\0\20java/"
        +"lang/Object\1\0\20java/lang/System\1\0\3out\1\0\25Ljava/io/PrintStream;"
        +"\1\0\23java/io/PrintStream\1\0\7println\1\0\25(Ljava/lang/String;)V\6\0"
        +"\0\4\0\5\0\0\0\0\0\1\0\11\0\6\0\7\0\1\0\10\0\0\0\25\0\2\0\0\0\0\0\11²\0"
        + "\1\22\2¶\0\3±\0\0\0\0\0\0").getBytes(StandardCharsets.ISO_8859_1)); */
    }
}