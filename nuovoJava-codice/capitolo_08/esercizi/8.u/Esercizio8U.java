public class Esercizio8U {
    public static void main(String args[]) {
        try (PortaAutomatica portaAutomatica = new PortaAutomatica();) {
            portaAutomatica.open();
        }
    }
}