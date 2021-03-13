public record Foto(String formato, boolean aColori) {
/* public Foto {
        if (formato.length() < 5) throw new IllegalArgumentException("Descrizione del formato troppo breve");
    } */

    public Foto(String formato, boolean aColori, String msg) {
        this(formato, aColori);
        if (formato.length() < 5) throw new IllegalArgumentException(msg);
//        this.formato = formato;
//        this.aColori = aColori;
    }
    
    /* public Foto(String formato, boolean aColori) {
        if (formato.length() < 5) throw new IllegalArgumentException("Descrizione del formato troppo breve");
        this.formato = formato;
        this.aColori = aColori;
    } */
}