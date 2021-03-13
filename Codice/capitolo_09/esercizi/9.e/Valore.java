public enum Valore {

    UN_CENTESIMO(1) {
                @Override
                public String getStringaDescrittiva() {
                    return getValore() + " centesimi di ";
                }
            },
    DUE_CENTESIMI(2),
    CINQUE_CENTESIMI(5),
    DIECI_CENTESIMI(10),
    VENTI_CENTESIMI(20),
    CINQUANTA_CENTESIMI(50),
    UN_EURO(1) {
                @Override
                public String getStringaDescrittiva() {
                    return getValore() + " ";
                }
            },
    DUE_EURO(2) {
                @Override
                public String getStringaDescrittiva() {
                    return getValore() + " ";
                }
            };

    private int valore;

    private Valore(int valore) {
        this.valore = valore;
    }

    public String getStringaDescrittiva() {
        return getValore() + " centesimi di ";
    }

    public int getValore() {
        return valore;
    }
}
