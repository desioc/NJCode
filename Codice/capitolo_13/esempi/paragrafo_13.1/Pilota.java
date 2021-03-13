public record Pilota (String nome) {
    public void fattiUnGiro(Volante volante) {
        volante.decolla();
        volante.plana();
        volante.atterra();
    }    
    @Override
    public String toString(){
        return nome();
    }
}