public enum Esercizio13EE {
    A, B, C;
    public static class Interna{
        public enum EnumInterna {
            D, E, F;
        }
    }
    public static void main(String args[]) {      
//    for (Esercizio13EE.Interna.EnumInterna item : Esercizio13EE.Interna.EnumInterna.values()) {
        for (Interna.EnumInterna item : Interna.EnumInterna.values()) {
            System.out.println(item);
        }
    }
}