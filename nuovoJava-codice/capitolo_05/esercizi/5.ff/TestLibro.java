public class TestLibro {
    public static void main(String[] args) {
        Libro jfaVol1 = new Libro("979-12-200-4915-3" , "Java for Aliens Vol. 1" , "Claudio De Sio Cesari" , 25, "Manuale");
        Libro jfaVol2 = new Libro("979-12-200-4916-0" , "Java for Aliens Vol. 2" , "Claudio De Sio Cesari" , 25, "Biografia");
        System.out.println("Genere JFA Vol 1 = " + jfaVol1.getGenere());
        System.out.println("Genere JFA Vol 2 = " + jfaVol2.getGenere());
    }
}