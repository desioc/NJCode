public sealed interface Pesabile permits Imballaggio, Articolo, Misura {
    String UNITA_DI_MISURA = "kg";
    double getPeso();
}