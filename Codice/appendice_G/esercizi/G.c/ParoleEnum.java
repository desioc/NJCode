public enum ParoleEnum {

    LIBRO("libro"), TEMPO("tempo"), CASA("casa");

    private String chiave;

    private ParoleEnum(String chiave) {
        this.chiave = chiave;
    }

    public String getChiave() {
        return chiave;
    }

}