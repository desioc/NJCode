public class TestQuadro {
    public static void main(String args[]) {
        Quadro quadro = new Quadro("Camaleón" , "Leonardo Furino" , 1000000);
        System.out.println(quadro);
        String titolo = quadro.titolo();
        String autore = quadro.autore();
        System.out.println(titolo + " " + autore);
    }
}