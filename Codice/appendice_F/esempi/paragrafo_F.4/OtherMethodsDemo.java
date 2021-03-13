public class OtherMethodsDemo {
    public static void main(String args[]) {
        String string = "<HTML>\n" +
                                "  <BODY>\n" +
                                "    <H1>Hello World!</H1>\n" +
                                "  </BODY>\n" +
                                "</HTML>";
        System.out.println(string.indent(-3));
        String escapedLF = "***\\n***";
        System.out.println(escapedLF);
        String lf = escapedLF.translateEscapes();
        System.out.println(lf);
    }
}