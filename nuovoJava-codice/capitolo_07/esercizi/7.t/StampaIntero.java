public class StampaIntero extends StampaNumero{
    //overload
    public void stampa(int numero) {
        System.out.print(numero);
    }
    //override
    public void stampa(double numero) {
        System.out.print(numero);
    }
}