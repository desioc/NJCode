public class PortaAutomatica implements AutoCloseable {
    public void close(){
        System.out.println("La porta si sta chiudendo");
    }

    public void open(){
        System.out.println("La porta si sta aprendo");
    }
}