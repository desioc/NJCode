import java.util.List;

public class Soluzione10V {
    protected final void modifica(List<?> list) {
        helperMethod(list);
    }
    
    private <T> void helperMethod(List<T> list){
        list.add(list.get(0));
    }
}