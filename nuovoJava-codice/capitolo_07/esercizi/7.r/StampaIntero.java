public class StampaIntero extends StampaNumero{
    public void stampa(int numero) {
        System.out.print(numero);
    }
    
    public static void main(String args[]) {
        StampaNumero stampaNumero = new StampaIntero();
        stampaNumero.stampa(1);
    }
}
