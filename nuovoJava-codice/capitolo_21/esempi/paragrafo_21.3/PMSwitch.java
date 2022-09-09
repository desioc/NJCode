public class PMSwitch {
    // paragrafo 21.3.3 Il nuov(issim)o switch    
/* public static String getInfo(Object object) {
      if (object instanceof Integer integer) {
        return (integer < 0 ? "Negative" : "Positive") + " integer";
      }
      if (object instanceof String string) {
        return "String of length " + string.length();
      }
      return "Unknown";
    }

/* public static String getInfo(Object object) {
        return switch (object) {
            case Integer i -> (i < 0 ? "Negative" : "Positive")+ " integer" ;
            case String s -> "String of length " + s.length();
            default -> "Unknown";
//            case Object o -> "Unknown";     // paragrafo 21.3.4 Exhaustiveness/Completeness    
        } ;
    } */

    //paragrafo 21.3.5 Dominance
    /* public static String getInfo(Object object) {
      return switch (object) {
        case Object o -> "Unknown";
        case Integer i -> (i < 0 ? "Negative" : "Positive")+ " integer";
        case String s -> "String of length " + s.length();
      };
    } */

    // paragrafo 21.3.6 Dominance e clausola default
/* public static String getInfo(Object object) {
      return switch (object) {
        default -> "Unknown";
        case Integer i -> (i < 0 ? "Negative" : "Positive")+ " integer";
        case String s -> "String of length " + s.length();
      };
    } */
    
    // paragrafo 21.3.7 Guarded pattern
/* public static String getInfo(Object object) {
        return switch (object) {
            case Integer i && i < 0 -> "Negative integer" ; // guarded pattern
            case Integer i -> "Positive integer" ;
            case String s -> "String of length " + s.length();
            default -> "Unknown";
        } ;
    } */
    
    // Da Java 19
/* public static String getInfo(Object object) {
      return switch (object) {
        case Integer i when i < 0 -> "Negative integer"; // guarded pattern
        case Integer i -> "Positive integer";
        case String s -> "String of length " + s.length();
        default -> "Unknown";
      };
    } */
    
    // paragrafo 21.3.8 Fall-through
 /* public static String getInfo(Object object) {
      return switch (object) {
        case Integer i, Float f -> "This is a number";
        case String s -> "String of length " + s.length();
        default -> "Unknown";
      };
    } */
    
 /* public static String getInfo(Object object) {
      return switch (object) {
        case Integer i: // manca il break: fall-through
        case Float f: 
          yield "This is a number";
        break;
        case String s: 
          yield "String of length " + s.length();
        break;
        default: 
          yield "Unknown";
        break;
      };
    } */

    //paragrafo 21.3.9 Controllo di nullità
/*  public static String getInfo(Object object) {
      return switch (object) {
        case null -> "Null!"; // controllo di nullità
        case Integer i -> (i < 0 ? "Negative" : "Positive")+ " integer";
        case String s -> "String of length " + s.length();
        default -> "Unknown";
      }; 
   }*/
   
/* public static String getInfo(Object object) {
      return switch (object) {
        case null -> throw new NullPointerException(); // inserita dal compilatore
        case Integer i -> (i < 0 ? "Negative" : "Positive")+ " integer";
        case String s -> "String of length " + s.length();
        default -> "Unknown";
      };
   } */

    //paragrafo 21.3.10 Dominance e case null
/* public static String getInfo(Object object) {
      return switch (object) {
        default -> "Unknown";
        case Integer i -> (i < 0 ? "Negative" : "Positive")+ " integer";
        case String s -> "String of length " + s.length();
        case null -> "Null!";
        //paragrafo 21.3.11 Fall-through con case null
        //case null, Integer i -> "This is a number or null"; 
        //case null, default -> "Unknown or null"; 
        //default, case null -> "Unknown or null"; 
      };
    }*/
}