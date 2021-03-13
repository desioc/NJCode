public class CloneableClass implements Cloneable {
    private String campo;

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public String getCampo() {
        return campo;
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
        /* CloneableClass cloneableClass = new CloneableClass();
        cloneableClass.setCampo(getCampo());
        return cloneableClass; */
    }
    
    @Override
    public String toString() {
        return " Oggetto " + super.toString() + " - " + getCampo();
    }
}