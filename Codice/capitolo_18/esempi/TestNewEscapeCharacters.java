public class TestNewEscapeCharacters {
    public static void main(String args[]) {
        String testo1 = "Quando la tempesta sarà finita, probabilmente non " 
            + "saprai neanche tu come hai fatto ad attraversarla a " 
            + "uscirne vivo. Anzi, non sarai neanche sicuro se sia " 
            + "finita per davvero. Ma su un punto non c'è dubbio. " 
            + "Ed è che tu, uscito da quel vento, non sarai lo stesso " 
            + "che vi è entrato" ;
        String testo2 = """
                Quando la tempesta sarà finita, probabilmente non \
                saprai neanche tu come hai fatto ad attraversarla a \
                uscirne vivo. Anzi, non sarai neanche sicuro se sia \
                finita per davvero. Ma su un punto non c'è dubbio. \
                Ed è che tu, uscito da quel vento, non sarai lo stesso \
                che vi è entrato\
                """;
          System.out.println(testo1);    
          System.out.println(testo2);           
          String testo3 = """
              1  \s
              10 \s
              100\s
              1000""";
          System.out.println(testo3);
    }
}