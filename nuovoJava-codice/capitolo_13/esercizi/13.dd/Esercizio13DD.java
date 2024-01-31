public enum Esercizio13DD {
    A, B, C;
    public class Interna {
        public enum EnumInterna {
            D, E, F;
        }
    }
    public static void main(String args[]) {      
        for (Esercizio13DD.Interna.EnumInterna item : 
                    Esercizio13DD.Interna.EnumInterna.values()) {
            System.out.println(item);
        }
    }
}
