public class Esercizio13AA {
    public static void main(String args[]) {
        new Interfaccia(){
            public void metodo(){
                System.out.println("Classe anonima");
            }
        }.metodo();
    }
    private interface Interfaccia{
        void metodo();
    }
}