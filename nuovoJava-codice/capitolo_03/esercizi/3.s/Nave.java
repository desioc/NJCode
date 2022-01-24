public class Nave {
    int indice = 0;
    public Auto[] autoArray;

    public Nave () {
        autoArray = new Auto[100];
    }

    public void caricaAuto(Auto auto) {
        autoArray[indice] = auto;
        indice++;
    }
}