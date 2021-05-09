public class StringMethodDemo {
    public static void main(String args[]) {
        //charAt
        System.out.println("Claudio".charAt(2));
        //concat
        String stringa1 ="Mc";
        String stringa2 ="Guffin";
        String stringa3 = stringa1.concat(stringa2);
        System.out.println("stringa1 = "+ stringa1);
        System.out.println("stringa2 = "+ stringa2);
        System.out.println("stringa3 = "+ stringa3);
        //compareTo
        System.out.println("A".compareTo("B"));
        System.out.println("C".compareTo("B"));
        System.out.println("D".compareTo("D"));
        //endsWith
        String nome ="Viola";
        System.out.println(nome.endsWith("a"));
        //equals
        System.out.println("Equals: "+ new String("sapore").equals("Sapore"));
        //equalsIgnoreCase
        System.out.println("EqualsIgnoreCase: "+ new String("battista").equalsIgnoreCase("Battista"));
        //format
        System.out.println("Format: "+ String.format("Stringa = %s,  booleano = %b","a",  1==1));
        //indexOf
        System.out.println("IndexOf: "+"Ligeia".indexOf("i"));
        System.out.println("IndexOf: "+"Ligeia".indexOf("i", 2));
        //join
        String message = String.join("\\","C:","Esempi","Java");
        System.out.println(message);
        //lastIndexOf
        System.out.println("LastIndexOf: "+"Rosalia".lastIndexOf("a"));
        //trim
        String stringToTrim ="     Emanuele     ";
        final String STAR="*";
        System.out.println(STAR+stringToTrim.trim()+STAR);
        //strip
        String stringToStrip ="    Salvo D'Acquisto    ";
        System.out.println(STAR+stringToStrip.strip()+STAR);
        System.out.println(STAR+stringToStrip.stripLeading()+STAR);
        System.out.println(STAR+stringToStrip.stripTrailing()+STAR);
        //length
        System.out.println("Claudio".length());
        //repeat
        System.out.println("01".repeat(4));
        //replaceFirst
        String newString ="aomame".replaceFirst("a","A");
        System.out.println(newString);
        //Split
        String deepPurple ="Gillan-Glover-Paice-Blackmore-Lord";
        String[] components = deepPurple.split("-");
        for (String component: components) {
            System.out.println(component);
        }
        //startsWith
        String cantoPrimo ="Nel mezzo del cammin di nostra vita mi ritrovai per una selva oscura, ché la diritta via era smarrita";
        System.out.println(cantoPrimo.startsWith("mez"));
        System.out.println(cantoPrimo.startsWith("mez", 4));
    }
}