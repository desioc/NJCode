public class TextBlockDemo {
    public static void main(String args[]) {
        String htmlFile = 
        "<HTML>\n" +
        "  <BODY>\n" +
        "    <H1>Hello World!</H1>\n" +
        "  </BODY>\n" +
        "</HTML>";
        System.out.println(htmlFile);
        htmlFile = "<HTML>\n  <BODY>\n    <H1>Hello World!</H1>\n  </BODY>\n</HTML>";
        System.out.println(htmlFile);
        String htmlFile = """
                          <HTML>
                            <BODY>
                              <H1>Hello World!</H1>
                            </BODY>
                          </HTML>   """;
        System.out.println(htmlFile);
        htmlFile = """
                          <HTML>
                            <BODY>
                              <H1>Hello World!</H1>
                            </BODY>
                          </HTML>  
""";
        System.out.println(htmlFile);
        htmlFile = """
                          <HTML>
                            <BODY>
                              <H1>Hello World!</H1>
                            </BODY>
                          </HTML>  
                          """;
        System.out.println(htmlFile);
/* String functionName = "alert";
        String jsFunction = "function dynamicFunction() {\n"+
                                        "\t"+functionName+"(msg);\n" +
                                        "}";
        System.out.println(jsFunction); */
/* String functionName = "alert";
        String jsFunction = """
                                        function dynamicFunction() {
                                        \t"""  + functionName + """
                                        (msg);
                                        }""";
        System.out.println(jsFunction); */
/* String functionName = "$functionParameter";
        String jsFunction = """
                                        function dynamicFunction() {
                                        \t$functionParameter(msg);
                                        }""".replace("$functionParameter", "alert");
        System.out.println(jsFunction); */
/* String jsFunction = """
                                        function dynamicFunction() {
                                        \t%s(msg);
                                        }""".formatted("alert");
        System.out.println(jsFunction); */
        String jsFunction = String.format("""
                                                              function dynamicFunction() {
                                                              \t%s(msg);
                                                              }""","alert");
        System.out.println(jsFunction); 
   }
}