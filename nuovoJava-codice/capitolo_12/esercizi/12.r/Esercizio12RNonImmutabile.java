public class Esercizio12RNonImmutabile {
    
    private Integer intero;

    private StringBuilder stringBuilder;

    public void setStringBuilder(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }

    public void setIntero(Integer intero) {
        this.intero = intero;
    }

    public Integer getIntero() {
        return intero;
    }
}