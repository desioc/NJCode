public class Outer4 {
    private String messaggio = "Nella classe ";

    public void metodoConClasse(final int a) {
        ClasseEsistente ce = new ClasseEsistente() {
            @Override
            public void metodo() {
                System.out.println(messaggio+"anonima numero "+ a);
            }
        } ;
        ce.metodo();
    }
}