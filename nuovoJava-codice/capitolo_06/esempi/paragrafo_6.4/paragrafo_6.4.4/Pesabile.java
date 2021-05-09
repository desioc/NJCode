public sealed interface Pesabile permits Imballaggio, Articolo {
    String UNITA_DI_MISURA = "kg";
    double getPeso();
}