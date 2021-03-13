public class Data2 {
    private int giorno;
    private int mese;
    private int anno;
    public void setGiorno(int g) {
        if (g > 0 && g <= 31) {
            giorno = g;
        }
        else {
            System.out.println("Giorno non valido");
        }
    }
    public int getGiorno() {
        return giorno;
    }
    public void setMese(int m) {
        if (m > 0 && m <= 12) {
            mese = m;
        }
        else {
            System.out.println("Mese non valido");
        }
    }
    public int getMese() {
        return mese;
    }
    public void setAnno(int a) {
        anno = a;
    }
    public int getAnno() {
        return anno;
    }
}