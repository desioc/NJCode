public class RisorsaChiudibile implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("Chiamato metodo close()");
    }
    @Override
    public String toString() {
        return "RisorsaChiudibile";
    }
}