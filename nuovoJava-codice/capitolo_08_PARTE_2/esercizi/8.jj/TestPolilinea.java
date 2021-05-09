public class TestPolilinea {
    private static final String TEST_OK ="TEST OK:\n";
    private static final String TEST_KO ="TEST FALLITO: ";
    
    public static void main(String args[]) {
        testPolilineaCorretta();
        testPolilineaCorrettaConQuattroPunti();
        testPolilineaSenzaSegmenti();
        testPolilineaConUnSoloSegmento();
        testPolilineaConDueSegmentiNonConsecutiviNelCostruttore();
        testPolilineaConTreSegmentiNonConsecutiviNelCostruttore();
        testPolilineaCorrettaAggiungendoUnSegmentoConsecutivo();
        testPolilineaScorrettaAggiungendoUnSegmentoNonConsecutivo();
    }

    public static void testPolilineaCorretta() {
        try {
            System.out.println("testPolilineaCorretta:");
            Punto p1 = new Punto(0,0);
            Punto p2 = new Punto(1,1);
            Segmento s1 = new Segmento(p1, p2);
            Punto p3 = new Punto(1,2);
            Segmento s2 = new Segmento(p2, p3);
            Polilinea pol1 = new Polilinea(s1, s2);
            System.out.println(TEST_OK + pol1);
        } catch (Exception exc) {
            assert false : TEST_KO +  exc.getMessage();
        }
    }

    public static  void testPolilineaCorrettaConQuattroPunti() {
        try {
            System.out.println("testPolilineaCorrettaConQuattroPunti:");
            Punto p1 = new Punto(0,0);
            Punto p2 = new Punto(1,1);
            Segmento s1 = new Segmento(p1, p2);
            Punto p3 = new Punto(1,1);
            Punto p4 = new Punto(2,3);
            Segmento s2 = new Segmento(p3, p4);
            Polilinea pol1 = new Polilinea(s1, s2);
            System.out.println(TEST_OK + pol1);
        } catch (Exception exc) {
            assert false : TEST_KO +  exc.getMessage();
        }
    }

    public static  void testPolilineaSenzaSegmenti() {
        try {
            System.out.println("testPolilineaSenzaSegmenti:");
            Polilinea pol1 = new Polilinea();
            System.out.println(TEST_KO + pol1);
            assert false :"È stata creata un polilinea senza segmenti!";
        } catch (Exception exc) {
            System.out.println(TEST_OK +  exc.getMessage());
            System.out.println();
        }
    }

    public static  void testPolilineaConUnSoloSegmento() {
        try {
            System.out.println("testPolilineaConUnSoloSegmento:");
            Punto p1 = new Punto(0,0);
            Punto p2 = new Punto(1,1);
            Segmento s1 = new Segmento(p1, p2);
            Polilinea pol1 = new Polilinea(s1);
            System.out.println(TEST_KO + pol1);
            assert false :"È stata creata un polilinea con un solo segmento!";
        } catch (Exception exc) {
            System.out.println(TEST_OK +  exc.getMessage());
            System.out.println();
        }
    }

    public static  void testPolilineaConDueSegmentiNonConsecutiviNelCostruttore() {
        try {
            System.out.println("testPolilineaConDueSegmentiNonConsecutiviNelCostruttore:");
            Punto p1 = new Punto(0,0);
            Punto p2 = new Punto(1,1);
            Segmento s1 = new Segmento(p1, p2);
            Punto p3 = new Punto(1,2);
            Punto p4 = new Punto(2,2);
            Segmento s2 = new Segmento(p3, p4);
            Polilinea pol1 = new Polilinea(s1, s2);
            System.out.println(TEST_KO+ pol1);
            assert false :"È stata creata un polilinea con due segmenti non consecutivi (nel costruttore)!";
        } catch (Exception exc) {
            System.out.println(TEST_OK +  exc.getMessage());
            System.out.println();
        }
    }

    public static  void testPolilineaConTreSegmentiNonConsecutiviNelCostruttore() {
        try {
            System.out.println("testPolilineaConTreSegmentiNonConsecutiviNelCostruttore:");
            Punto p1 = new Punto(0,0);
            Punto p2 = new Punto(1,1);
            Segmento s1 = new Segmento(p1, p2);
            Punto p3 = new Punto(1,1);
            Punto p4 = new Punto(2,2);
            Segmento s2 = new Segmento(p3, p4);
            Punto p5 = new Punto(2,3);
            Punto p6 = new Punto(3,2);
            Segmento s3 = new Segmento(p5, p6);
            Polilinea pol1 = new Polilinea(s1, s2, s3);
            System.out.println(TEST_KO+ pol1);
            assert false :"È stata creata un polilinea con tre segmenti non consecutivi (nel costruttore)!";
        } catch (Exception exc) {
            System.out.println(TEST_OK +  exc.getMessage());
            System.out.println();
        }
    }

    public static  void testPolilineaCorrettaAggiungendoUnSegmentoConsecutivo() {
        try {
            System.out.println("testPolilineaCorrettaAggiungendoUnSegmentoConsecutivo:");
            Punto p1 = new Punto(0,0);
            Punto p2 = new Punto(1,1);
            Segmento s1 = new Segmento(p1, p2);
            Punto p3 = new Punto(1,2);
            Segmento s2 = new Segmento(p2, p3);
            Polilinea pol1 = new Polilinea(s1, s2);
            Punto p4 = new Punto(3,2);
            Segmento s3 = new Segmento(p3, p4);
            pol1.aggiungiSegmento(s3);
            System.out.println(TEST_OK+ pol1);
        } catch (Exception exc) {
            assert false : TEST_KO +  exc.getMessage();
        }
    }

    public static  void testPolilineaScorrettaAggiungendoUnSegmentoNonConsecutivo() {
        try {
            System.out.println("testPolilineaScorrettaAggiungendoUnSegmentoNonConsecutivo:");
            Punto p1 = new Punto(0,0);
            Punto p2 = new Punto(1,1);
            Segmento s1 = new Segmento(p1, p2);
            Punto p3 = new Punto(1,2);
            Segmento s2 = new Segmento(p2, p3);
            Polilinea pol1 = new Polilinea(s1, s2);
            Punto p4 = new Punto(3,2);
            Punto p5 = new Punto(3,3);
            Segmento s3 = new Segmento(p4, p5);
            pol1.aggiungiSegmento(s3);
            System.out.println(TEST_KO+ pol1);
            assert false :"È stata creata un polilinea con un segmento non consecutivo!";
        } catch (Exception exc) {
            System.out.println(TEST_OK +  exc.getMessage());
        }
    }
}